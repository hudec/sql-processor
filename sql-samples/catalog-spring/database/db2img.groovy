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
		
		sql.eachRow("select IMAGE, IMAGEURL from ITEM where ITEMID = ? for update", [1], {
			println it.IMAGEURL
			java.sql.Blob blob = it.IMAGE
     	InputStream is = blob.getBinaryStream()
			FileOutputStream out = new FileOutputStream("xxx")
			copy(is, out, 4096)
			out.flush()
			out.close()
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
