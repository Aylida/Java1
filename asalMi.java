package ödev;

public class asalMi {
	public static void main(String[] args) {
		int number = 1;
		int remainder = number % 2;
		//System.out.println(remainder);
		boolean isPrime = true;
		
		for (int i=2; i<number;i++) {
			if(number % i ==0) {
				isPrime = false;
			}
			
		}
		
		if(isPrime==true) {
			System.out.println("Syı asaldır");
		}else {
				System.out.println("Sayı asal değil");
			}
		}
	}

