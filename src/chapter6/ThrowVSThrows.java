package chapter6;

public class ThrowVSThrows {

	public static void info() throws ArrayIndexOutOfBoundsException, NullPointerException{
		throw new ArrayIndexOutOfBoundsException("Juste un test");
	}
	
	public static void details() throws Exception{
		throw new Exception();
	}
	
	
	public static void main(String[] args) { //throws Exception {
		  
		
		try {
			details();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
		//try {
		  info();
		//}
		//catch(Exception ex)
		//{
		//	System.out.println("Oups ..."+ex.getMessage());
		//}
		
		System.out.println("Suite du programme...");

	}

}
