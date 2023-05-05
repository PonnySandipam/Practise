package javaBasicPrograms;

public class DataBase {

	
	private static DataBase DbObject;
	
	private DataBase() {
		
	}
	
	public static DataBase getInstance() {
		
		
		if(DbObject==null) {
		DbObject = new DataBase();
		}
		 return DbObject;
	}
	
	
	public void getConnection() {
		System.out.println("You are now connected to the database.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataBase db1;
		
		db1= DataBase.getInstance();
	      
	      db1.getConnection();
		db1.getInstance();
	}

}
