package abstractClass;

public class TextScanner {
	
	Hello obj;
	
	public TextScanner(Hello obj) {
		
		this.obj=obj;
	}
	
	void scan() {
		
		String text="I am great on this";
		
		obj.onText(text);
	}

}
