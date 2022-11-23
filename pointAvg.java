import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner input= new Scanner(System.in);
    System.out.print("Matematik notunuzu girin: ");
    int math=input.nextInt();
    System.out.print("\nFizik notunuzu girin: ");
    int phys=input.nextInt();
    System.out.print("\nKimya notunuzu girin: ");
    int chem=input.nextInt();
    System.out.print("\nTürkçe notunuzu girin: ");
    int turk=input.nextInt();
    System.out.print("\nTarih notunuzu girin: ");
    int hist=input.nextInt();
    System.out.print("\nMüzik notunuzu girin: ");
    int musi=input.nextInt();
    float avg=(math+phys+chem+turk+hist+musi)/6f;
    String str=avg>=60?"Sınıfı geçti":"Sınıfta kaldı";
    System.out.println(str);
    
 }
}