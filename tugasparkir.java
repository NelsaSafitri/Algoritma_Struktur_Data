
    import java.util.Scanner;

public class tugasparkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jam Masuk: 7 ");
        int jamMasuk = input.nextInt();

        System.out.print("Jam Keluar: 12 ");
        int jamKeluar = input.nextInt();

        System.out.print("Biaya Per Jam: 2000 ");
        int biayaPerJam = input.nextInt();

        int lamaParkir = jamKeluar - jamMasuk;
        int biayaParkir = lamaParkir * biayaPerJam;

        System.out.println("Biaya Parkir: 1000 " + biayaParkir);
    }
}

