package javaActivity21;

public class MyBook extends Book{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title = "Jag Automation";
		Book newNovel = new MyBook();
		newNovel.setTitle(title);
		System.out.println("The title is "+ newNovel.getTitle());

	}

}
