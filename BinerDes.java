import java.util.Scanner;
public class BinerDes {
 Scanner scan = new Scanner(System.in);;
 int num;
 
 void KonversiNilai()
 {
  System.out.println("Program Konversi Bil. Biner ke Decimal");
  System.out.println("======================================");
  
  System.out.print("\nMasukkan Bilangan Biner :");
  num = Integer.parseInt(scan.nextLine(), 2);
  System.out.println("Konversi Dalam bilangan decimal : " + num);
 }
}
class MainClass {
   public static void main(String args[]) {
   BinerDes bil = new BinerDes();
   bil.KonversiNilai();
   }
}