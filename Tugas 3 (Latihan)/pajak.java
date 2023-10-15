import java.util.Scanner;;
public class pajak {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        
        System.out.println("masukan gaji bulanan: ");
        double gajibulanan = input.nextDouble();
        double gajitahunan = gajibulanan * 12;
        double tax = 0;
        if (gajitahunan <= 500000) {
            tax = 0;
        } else if (gajitahunan <= 100000) {
            tax = 0.05 * (gajitahunan - 500000);
        } else if (gajitahunan <= 2000000); {
            tax = 12.500 + 0.2 * (gajitahunan - 100000);
        }  {
            tax = 112.500 + 0.3 * (gajitahunan - 10000000);
        }

        System.out.print("pajak penghasilan tahunan yang harus dibayar: "+tax);
        input.close();
        
     }

 } 
