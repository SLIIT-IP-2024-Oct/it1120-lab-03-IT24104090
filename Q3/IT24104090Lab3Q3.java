import java.util.Scanner;

public class IT24104090Lab3Q3 {
    public static void main(String [] args ){
	    Scanner input = new Scanner(System.in);
		
		System.out.print("Enter rupee amount:");
		int amount = input.nextInt();
		
		int notes5000 = 0;
        int notes1000 = 0;
        int notes500 = 0;
        int notes200 = 0;
        int notes100 = 0;
        int notes50 = 0;
        int notes20 = 0;
        int notes10 = 0;
        int coins5 = 0;
        int coins2 = 0;
        int coins1 = 0;
		
		while (amount > 0) {
		    if (amount >= 5000){
			    notes5000 = amount / 5000;
				amount %= 5000;
			} else if (amount >= 1000){
			    notes1000 = amount/ 1000;
                amount %= 1000;
			} else if (amount >= 500) {
                notes500 = amount / 500;
                amount %= 500;
            } else if (amount >= 200) {
                notes200 = amount / 200;
                amount %= 200;
            } else if (amount >= 100) {
                notes100 = amount / 100;
                amount %= 100;
            } else if (amount >= 50) {
                notes50 = amount / 50;
                amount %= 50;
            } else if (amount >= 20) {
                notes20 = amount / 20;
                amount %= 20;
            } else if (amount >= 10) {
                notes10 = amount / 10;
                amount %= 10;
            } else if (amount >= 5) {
                coins5 = amount / 5;
                amount %= 5;
            } else if (amount >= 2) {
                coins2 = amount / 2;
                amount %= 2;
            } else {
                coins1 = amount;
                amount = 0;
            }
        }
		
		System.out.println("5000 Notes -" + notes5000);
        System.out.println("1000 Notes -" + notes1000);
        System.out.println("500 Notes -" + notes500);
        System.out.println("200 Notes -" + notes200);
        System.out.println("100 Notes -" + notes100);
        System.out.println("50 Notes -" + notes50);
        System.out.println("20 Notes -" + notes20);
        System.out.println("10 Notes -" + notes10);
        System.out.println("5 Coins -" + coins5);
        System.out.println("2 Coins -" + coins2);
        System.out.println("1 Coins -" + coins1);
		
		input.close();
	}
}	
	