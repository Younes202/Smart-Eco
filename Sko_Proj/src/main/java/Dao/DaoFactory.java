package Dao;

public class DaoFactory {
	private String  url;
	private String username;
	private String password;
	public DaoFactory(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	public static DaoFactory getInstance() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DaoFactory instance = new DaoFactory("jdbc:mysql://localhost:3306/Skoters","root","missour.1422");
		return instance;
		
	}
	
	public DaoUserImpl getUserDao() {
		
		return new DaoUserImpl(this);
	}
	

}
