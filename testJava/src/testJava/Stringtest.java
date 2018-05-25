package testJava;



public class Stringtest {

	public static void main(String[] args) {
		
		
		char firstLetter;
		 String formattedString;
		  String autoSelected = "  left  ";
		  
		  formattedString = autoSelected.trim(); //removes spaces
		  formattedString = formattedString.toUpperCase();
		  firstLetter = formattedString.charAt(0);
		  System.out.println("---" + formattedString  + "---"  );

	}

}
