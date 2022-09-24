package LambdaExpression;


@FunctionalInterface
interface MeLambda{
	public int add(int x , int y);
}

public class LambdaAddition {

	public static void main(String[] args) {
		MeLambda me =(x,y)->x+y;
		
		int sum = me.add(11, 65);
		System.out.println(sum);
	}
	
}
