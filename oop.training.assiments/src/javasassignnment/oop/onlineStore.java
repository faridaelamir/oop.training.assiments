package javasassignnment.oop;
//Assignment 4 part 2
import java.util.Scanner;
import java.util.Locale;

public class onlineStore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        Product noodles = new Product("5090" , "buldak ramen", 95.5,true);
        noodles.displayProductInfo();
        noodles.setPrice(150.50);
        noodles.setInStock(true);

        Product milk = new Product("r4e3","almond milk",250.50,true );
        System.out.println("Product info before update: ");
        milk.displayProductInfo();
        System.out.println("Product info after update : ");
        milk.setInStock(false);

    }

}
