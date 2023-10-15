import java.util.Scanner;;
public class membalikankata {
    public static void main(String[] args) {
        String kalimat, balik = "";
      Scanner in = new Scanner(System.in); 
      System.out.println("Masukkan kalimat yang ingin di balik : ");
      kalimat = in.nextLine();
      int panjang = kalimat.length();
      
      System.out.println("hasil dari length = " + panjang);

      for ( int i = panjang - 1; i >= 0; i-- )
      {
          balik = balik + kalimat.charAt(i);
      }
      System.out.println("Kebalikannya adalah : " + balik);
      in.close();
    }
}
