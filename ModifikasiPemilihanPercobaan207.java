import java.util.Scanner;
public class ModifikasiPemilihanPercobaan207 {

    public static void main (String [] args) {
        Scanner input07 = new Scanner(System.in);

        System.out.println("Nilai uas : ");
        float uas = input07.nextFloat();
        System.out.println("Nilai uts :");
        float uts = input07.nextFloat();
        System.out.println("Nilai kuis : ");
        float kuis = input07.nextFloat();
        System.out.println("Nilai tugas : ");
        float tugas = input07.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String huruf;
        if (total > 80 ) {
            huruf = "A";
        }
        else if (total > 73){
            huruf = "B+";
        }
        else if (total > 65){
            huruf = "B";
        }
        else if (total > 60){
            huruf = "C+";
        }
        else if (total > 50){
            huruf = "C";
        }
        else if (total > 39){
            huruf = "D";
        }
        else 
        huruf = "E";
        System.out.println("Nilai akhir = " + total + " sehingga mendapat predikat nilai " + huruf);

        }
    }

