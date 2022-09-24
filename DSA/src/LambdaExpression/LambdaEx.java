package LambdaExpression;

@FunctionalInterface
interface MyLambda{
	
	public void display();
}

//class My implements MyLambda{
//	public void display() {
//		System.out.println("Display method");
//	}
//}
//


public class LambdaEx {
	public static void main(String []args) {
		
		MyLambda me =()->{
			System.out.println("Main Method");
		};
		me.display();
	}
}
