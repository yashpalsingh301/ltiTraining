import java.util.Arrays;



class Ekclass{
	int x;
	public int returnOne(){
		return 1; 
	}
	
	Ekclass(int y){
		this.x=y;
		System.out.println("ye lelle");
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	
	public static int num(){
		System.out.println("hello");
		return 2;
	}
	
	public static int[] abc(){
		int[] b={1,2,3,4,6};
		return b;	
	}
		
	}
	



public class Ch_48 {

	
	public static void main(String[] args) {
		Ekclass kate= new Ekclass(10);
		System.out.println(kate.getX());
		
		int[] a= kate.abc();
		int[] d= {1,2,3,4,7,8,9};
		
		System.out.println(Arrays.toString(a));
		kate.num();
		
		}

	

	

	}


