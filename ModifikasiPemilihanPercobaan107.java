import java.util.Scanner; 
public class ModifikasiPemilihanPercobaan107 {

    public static void main (String [] args) {
        Scanner input07 = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka =input07.nextInt();
        String jenisAngka = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " bilangan " + jenisAngka);
            
        }
}