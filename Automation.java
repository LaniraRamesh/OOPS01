package oopsConceptTrial;

public class Automation extends MultipleLanguage{

	public void java() {
		System.out.println("java");
		
	}

	public void selenium() {
		System.out.println("selenium");
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}
	public static void main(String[] args) {
		Automation object=new Automation();
		object.python();
		object.selenium();
		object.ruby();
		object.java();
	}

}
