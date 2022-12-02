package com.javadbase.id.dbase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Class berisi fungsi untuk hubungan dengan database.
 */
public class DBase {
	private Driver driver;
	private Connection connection;
	private String url;
	private String name;
	private String password;
	
	public DBase() {}
	
	public DBase(String url, String name, String password) {
		this.url = url;
		this.name = name;
		this.password = password;
	}
	
	/**
	 * 
	 */
	private boolean registerToDBase() {
		try {
			driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		return true;
	}
	
  /**
   * @param url   url/link dari database
   * @param user  user dari database
   * @param pass  password dari user
   * @return true jika sukses
   * @throws SQLException
   */
  public boolean connect(String url, String user, String pass) throws SQLException {
		if(connection != null) return true;
		try {
			connection = DriverManager.getConnection(url, user, pass);
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		return true;
  }

    /**
     * Tutup koneksi dari database. Jika koneksi masih kosong lempar pengecualian.
     * @throws SQLException
     */
    public void shutDown() throws SQLException {
        if(connection == null) throw new RuntimeException("Connection is empty");
        connection.close();
    }
}
