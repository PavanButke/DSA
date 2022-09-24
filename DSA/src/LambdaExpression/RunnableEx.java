package LambdaExpression;

public class RunnableEx {
	
		public static void main(String[] args) {
			
			Runnable runnable = new  Runnable() {
				
				public void run() {
					System.out.println("Inside Runnable 1");
				}
			};
			
			new Thread(runnable).start();
			
			
			Runnable runnable2 =()->{
				System.out.println("Inside Runnable 2");
			};
			
			new Thread(runnable2).start();
		
			new Thread(()-> System.out.println("Inside Runnable 3")).start();
		}
	
}
