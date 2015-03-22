package org.sample;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.sample.dao.DigidataDao;
import org.sample.model.Digidata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.jdbc.JdbcEngineFactory;
import org.sqlproc.engine.jdbc.JdbcSessionFactory;
import org.sqlproc.engine.util.DDLLoader;

public class Main2 {

	private static final Driver JDBC_DRIVER = new org.hsqldb.jdbcDriver();
	private static final String DB_URL = "jdbc:hsqldb:mem:sqlproc";
	private static final String DB_USER = "sa";
	private static final String DB_PASSWORD = "";
	private static final String DB_TYPE = SqlFeature.HSQLDB;
	private static final String DB_DDL = "hsqldb.ddl";
	private static final String[] DB_CLEAR = null;

	private final Logger logger = LoggerFactory.getLogger(getClass());

	private Connection connection;
	private SqlSessionFactory sessionFactory;
	private JdbcEngineFactory sqlFactory;
	private List<String> ddls;

	private DigidataDao digidataDao;

	static {
		try {
			DriverManager.registerDriver(JDBC_DRIVER);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Main2() throws SQLException {
		JdbcEngineFactory factory = new JdbcEngineFactory();
		factory.setMetaFilesNames("statements.meta");
		factory.setFilter(DB_TYPE);
		factory.setValidatorFactory(new SampleValidator.SampleValidatorFactory());
		this.sqlFactory = factory;

		ddls = DDLLoader.getDDLs(this.getClass(), DB_DDL);
		connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		sessionFactory = new JdbcSessionFactory(connection);

		digidataDao = new DigidataDao(sqlFactory, sessionFactory);
	}

	public void setupDb() throws SQLException {
		SqlSession sqlSession = sessionFactory.getSqlSession();
		sqlSession.executeBatch((DB_CLEAR != null) ? DB_CLEAR : ddls.toArray(new String[0]));
	}

	public void run() throws Exception {
		setupDb();

		Digidata digidata = new Digidata();
		digidata.setxNote("aha");
		;
		digidata.setxBool(true);
		digidata = digidataDao.insert(digidata);
		System.out.println(digidata.getId());
		System.out.println(digidata.getxNote());
		System.out.println(digidata.getxBool());

		digidata = digidataDao.insert(digidata);
		System.out.println(digidata.getId());
		System.out.println(digidata.getxNote());
		System.out.println(digidata.getxBool());

		digidata.setxNote("oho");
		digidata.setxBool(null);
		//digidata.setNull(Digidata.Attribute.xBool);
		System.out.println(digidataDao.update(digidata));

		digidata = new Digidata();
		digidata.setId(1L);
		Digidata digidata1 = digidataDao.get(digidata);
		System.out.println(digidata1.getId());
		System.out.println(digidata1.getxNote());
		System.out.println(digidata1.getxBool());
	}

	public static void main(String[] args) throws Exception {
		Main2 main = new Main2();
		main.run();
	}
}
