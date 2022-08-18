package chapter2;

public class BreakContinueLabel {

	public static void main(String[] args) {
		//break et le continue
		/*
		for(int i = 0; i<10; i++)
		{
			//if(i==5) break;
			if(i==5) continue;
			System.out.println("i = "+i);
		}
		
		System.out.println("Fin du programme....");*/
		
		// label avec break et continue
		
		outer:for(int i=0; i<10; i++)
		{
			
			for(int j=0; j<10;j++)
			{   
				//if(j==5) break outer;
				if(j==5) continue outer;
				System.out.println("(i,j) = ("+i+","+j+")");
			}
		}

		System.out.println("Fin du programme....");
	}

}
