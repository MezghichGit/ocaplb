package chapter2;

public class LesOperateursLogiques {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		//boolean res = (y<100)|(++x<100);
		
		boolean res = (y<100)||(++x<100);
		System.out.println(res);
		System.out.println(x);
		
	}

}
