
 abstract public class Parent_Ch53 {
	public void methodd1(){
		System.out.println("kuch na nhai");
	}
	abstract void greet();
 

 
 
	public static void main(String[] args) {
		Child ch=new Child();
		ch.greet();
		ch.check();
		ch.methodd1();
		

	}

}

 class Child extends Parent_Ch53{
	 public void greet(){
		 System.out.println("good morning");
	 }
	 
	 public int check(){
		 System.out.println("kuch bhi be");
		 return 5;
	 }
	 
  class karan{
	  int x;
	  int y;
	  public int summ(){
		  int z=x+y;
		  return z;
	  }
  }
	 
 }