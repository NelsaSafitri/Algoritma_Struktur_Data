import java.util.Scanner;;
public class pecahanuang {
    public static void main(String[] args) throws Exception {
       int bill, uang;
       
       System.out.println("jumlah uang =");
       Scanner input = new Scanner(System.in);
       uang = input.nextInt();

       // besar 100000
       if (uang >= 100000);
       {
        bill = uang / 100000;
        System.out.println("pecahan uang sebanyak "+bill);
       }

       // antara 50000-100000
       uang = uang % 100000;
       if((uang >= 50000) && (uang <100000));
       {
        bill = uang / 50000;
        System.out.println("pecahan uang 50000 sebanyak "+bill);
        input.close();

       }

    }
}
