
public class B extends A{
	
	void run() {
		System.out.println("I am standing");
	}
	
	public static void main(String[] args) {
		
	//	B b=new B();
	//	b.run();
		
		A a=new B();
		a.run();
		
		
	}

	
//	WebDriverWait wait=new WebDriverWait(driver,10);
	//wait.until(visibilityofelement.elementTobeclickable(xpath));
}
