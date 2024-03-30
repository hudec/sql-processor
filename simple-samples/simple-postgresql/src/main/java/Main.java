
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.Driver;

public class Main {

//    public static final Driver JDBC_DRIVER = new org.apache.ignite.IgniteJdbcThinDriver();
//    public static final String DB_URL = "jdbc:ignite:thin://strnad.i.cz:30801";
    public static final Driver JDBC_DRIVER = new org.postgresql.Driver();
    public static final String DB_URL = "jdbc:postgresql://postgres.rob.i.cz:5433/aisv_7";

    static {
        try {
            DriverManager.registerDriver(JDBC_DRIVER);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {

        Connection connection = DriverManager.getConnection(DB_URL, "aisv", "aisv123");
        System.out.println("XXXX " + connection);

        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select * from zmena_aifo");
        while (rs.next()) {
            String id = rs.getString("id_zmena");
            System.out.println(id);
            String zm = rs.getString("zmena_udaje_b");
            System.out.println(zm + ": " + zm.getClass());
            break;
        }
    }
}
