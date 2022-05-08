public class ExampleSingleton {
	private static ExampleSingleton instance = null;
	/* in multi-threading environment, only one thread can use the volatile variable at a time */
	public static volatile int testInt;
	
	/* Default Constructor */
	private ExampleSingleton() {}
	
	/* Method to Instantiate Singleton Object*/
	public static ExampleSingleton getInstance() {
		if(instance == null) {
			instance = new ExampleSingleton();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		ExampleSingleton first = new ExampleSingleton();
		first.testInt = 1;
		ExampleSingleton second = new ExampleSingleton();
		second.testInt = 2;
		ExampleSingleton third = new ExampleSingleton();
		third.testInt = 3;
		ExampleSingleton fourth = ExampleSingleton.getInstance();
		fourth.testInt = 4;
		
		System.out.println("first instance: "+first.testInt);
		System.out.println("second instance: "+second.testInt);
		System.out.println("third instance: "+third.testInt);
		System.out.println("fourth instance: "+fourth.testInt);
	}
	
}