class Phone{
	public void name() {System.out.println("post name");}
	public void name1() {System.out.println("post name1");}
	}

class SmartPhone extends Phone{
	public void name(){System.out.println("post name2");}
	public void name3(){System.out.println("post name3" );}
}
	
public class Ch_49 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Phone obj= new SmartPhone();
		obj.name();
		
		Phone sm= new Phone();
		sm.name();
		
		
		

	}

}
