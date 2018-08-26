
public class Greeter {
	
	public void greet(Greeting greeting){
		  greeting.perfrom();
		}

	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
//		HelloWorldGreeting hworld = new HelloWorldGreeting();
//		greeter.greet(hworld);
		
		MyLambda myLambdaFunction = () -> System.out.print("hello world");
//		AddMethod addFunction = (int a, int b) -> a + b;

		Greeting helloWorldGreeting = new HelloWorldGreeting();
//		Greeting myLambdaFunction1 = () -> System.out.print("hello world --");
		
		helloWorldGreeting.perfrom();
//		myLambdaFunction1.perfrom();
		
		
		Greeting innerClassFunction = new Greeting(){
			public void perfrom(){
				System.out.print(" hello world");
			}
		};
//		innerClassFunction.perfrom();
		
//		greeter.greet(myLambdaFunction1);
//		greeter.greet(innerClassFunction);
		
	}

}
 
interface MyLambda {
	void foo();
}
 
//interface AddMethod{
//	void add(int a, int b);
//}


