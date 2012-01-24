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

		sql.eachRow("select ITEMID, IMAGEURL, IMAGETHUMBURL from ITEM order by ITEMID") {
			println it.IMAGEURL
			if (it.IMAGEURL != null) {
				FileInputStream fis = new FileInputStream(new File(it.IMAGEURL))
				def ps = sql.connection.prepareStatement("update ITEM set IMAGE = ? where ITEMID = ?");
				ps.setBinaryStream(1, fis, fis.available());
				ps.setObject(2, it.ITEMID);
				ps.execute()
				ps.close()
				fis.close()
			}
			println it.IMAGETHUMBURL
			if (it.IMAGETHUMBURL != null) {
				FileInputStream fis = new FileInputStream(new File(it.IMAGETHUMBURL))
				def ps = sql.connection.prepareStatement("update ITEM set IMAGETHUMB = ? where ITEMID = ?");
				ps.setBinaryStream(1, fis, fis.available());
				ps.setObject(2, it.ITEMID);
				ps.execute()
				ps.close()
				fis.close()
			}
  			sql.commit()
		}	
	}
}
