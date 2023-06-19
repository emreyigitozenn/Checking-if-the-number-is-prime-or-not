import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int number=1;
        boolean isPrime=true;
        if(number==1){
            System.out.println("Asal Degildir.");
            return;
        }
        if(number<2){
            System.out.println("Geçersiz sayi");
        }
        for(int i=2;i<number;i++){
          if(number%i==0){
              isPrime=false;
          }
        }
        if(isPrime==false){
            System.out.println("Asal Sayı Degildir.");
        }
        if(isPrime==true){
            System.out.println("Asal Sayıdır.");
        }


    }
}