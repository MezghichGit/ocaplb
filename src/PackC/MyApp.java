package PackC;

import PackA.*;
import PackB.*;
import PackB.C3;

public class MyApp {

	public static void main(String[] args) {
		C1 c1 = new C1();
		C2 c2 = new C2();
		C3 c3 = new C3();   // conflit
		///
		C5 c5 = new C5();
		C6 c6 = new C6();
		//C1 c1 = new C1();

	}

}
