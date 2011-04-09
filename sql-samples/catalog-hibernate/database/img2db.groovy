import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import groovy.sql.Sql

class sql {
	
	static main(args) {	

		def sql = Sql.newInstance( 'jdbc:oracle:thin:@localhost:1521:xe', 'CATALOG', 'CATALOG123', 'oracle.jdbc.driver.OracleDriver' );
		
		sql.connection.autoCommit = false

		(1..29).each({ num ->
			sql.eachRow("select IMAGE, IMAGEURL from ITEM where ITEMID = ? for update", [num], {
				println it.IMAGEURL
				java.sql.Blob blob = it.IMAGE
				FileInputStream fis = new FileInputStream(new File(it.IMAGEURL))
				OutputStream out = blob.getBinaryOutputStream();
				byte[] data = new byte[fis.available()]
				fis.read(data)
				fis.close()
				out.write(data)
				out.close()
      	sql.commit()
			});
		});
	
		(1..29).each({ num ->
			sql.eachRow("select IMAGETHUMB, IMAGETHUMBURL from ITEM where ITEMID = ? for update", [num], {
				println it.IMAGETHUMBURL
				java.sql.Blob blob = it.IMAGETHUMB
				FileInputStream fis = new FileInputStream(new File(it.IMAGETHUMBURL))
				OutputStream out = blob.getBinaryOutputStream();
				byte[] data = new byte[fis.available()]
				fis.read(data)
				fis.close()
				out.write(data)
				out.close()
       	sql.commit()
			});
		});
	}
	
	public static int copy(InputStream ins, OutputStream out, int bufSize)
		throws IOException
	{
		if (bufSize <= 0)
		{
			throw new IllegalArgumentException("The parameter 'bufSize' must not be <= 0");
		}

		final byte[] buffer = new byte[bufSize];
		int bytesCopied = 0;
		while (true)
		{
			int byteCount = ins.read(buffer, 0, buffer.length);
			if (byteCount <= 0)
			{
				break;
			}
			out.write(buffer, 0, byteCount);
			bytesCopied += byteCount;
		}
		return bytesCopied;
	}
}
