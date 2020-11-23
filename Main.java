
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
        do{
        koşul doğru olduğu sürece 
        whiledan farkı en az bir kez çalışmasının garanti olmasıdır
        }while(koşul);
        */
        int i = 0;
        do {            
            System.out.println("i fademizin değeri = "+i);
            i++;
        } while (i<59);//<=58 de diyebilirdik...
        // bu yapıda do kelime anlamı yap olduğu için öne faliyete geçiyor ardından sorguluyor olarak ifdade edebiliriz.
        //çok tercih edilen bir yöntem değildir fakat bazı problemlerin çözm için gereklidir.
       //projemiz bir sayının rakamları toplamını belirlemek
       //1234 sayısının rakamları toplamı 1+2+3+4=10
        Scanner scn = new Scanner(System.in);
        System.out.println("bir sayı giriniz :");
        int a = scn.nextInt();
        int toplam = 0;//rakamlar toplamını buraya eklicez
        int k = 1;

        do {
            toplam+=a%10;
            a/=10;
            System.out.println("sayınızın işlem olculuğu "+a +" "+k+".adımda aldığı değer");
            k++;
            
        }while(a>0);
        System.out.println("girdiğiz sayının rakamları toplamı = "+toplam);
    }
    
}
