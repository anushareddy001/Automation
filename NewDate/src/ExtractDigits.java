
public class ExtractDigits {

	public static void main(String[] args) {
	String anu="Anusha 202 Anitha 402 Alekhya 504";
	String anu2="Anusha1258Padma2586";
	System.out.println("The number is:"+anu.replaceAll("[^0-9]", ""));
	System.out.println("The number is:"+anu2.replaceAll("[^0-9]", ""));
//	System.out.println("The number is:"+anu.replaceAll("[A-Z][a-z]", ""));
	
	}

}
