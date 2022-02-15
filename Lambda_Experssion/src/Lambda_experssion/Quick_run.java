package Lambda_experssion;

public class Quick_run {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		
		for(int i = 1; i<10; i++) {
			System.out.println("this  is i: "+i);
			//x = x++;
			System.out.println(x);
			System.out.println(x = x++);
			System.out.println(x);
			
		}


	}

}