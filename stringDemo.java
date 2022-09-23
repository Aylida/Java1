package ödev;

public class stringDemo {
	public static void main(String[] args) {
		String mesaj = "Bygün hava çokgozel.";
		System.out.println(mesaj);
		
		System.out.println("eleman sayısı:" +mesaj.length());
		System.out.println("5.eleman:" +mesaj.charAt(4) );
		System.out.println(mesaj.concat("yaşasın"));
		System.out.println(mesaj.endsWith("."));
		
		
	System.out.println(mesaj.substring(2,4));
	
	}
	}
}
