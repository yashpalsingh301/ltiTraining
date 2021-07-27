import java.util.Random;
import java.util.Scanner;

class Harry{
    private int x;
	
	public Harry(int a) {
	this.x = a;
	}
	

	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}

	 
}



  public class Harry43 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int age= sc.nextInt();
		Random random= new Random();
		int z=random.nextInt(50);
		Harry kgs= new Harry(z);
//		kgs.setX(34);
		
		System.out.println(kgs.getX());
		
		
		
		
		
		
		

	}

}







