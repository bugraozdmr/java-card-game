import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] a={{"1","2","3","4"},{"1","3","3","4"},{"2","3","4","5"},{"3","4","5","3"}};
        kart kart1=new kart(a);

        Scanner scanner=new Scanner(System.in);

        while (kart1.don()!=1){
            System.out.println("\n\n");
            //1.sayi
            System.out.print("1. kart satir :");
            int k=scanner.nextInt();
            System.out.print("1. kart sütun :");
            int l=scanner.nextInt();

            if (k>4 || l>4){
                System.out.println("4x4 index");
                continue;
            }

            kart1.ac(k,l);
            //2.sayi
            System.out.print("2. kart satir :");
            int q=scanner.nextInt();
            System.out.print("2. kart sütun :");
            int m=scanner.nextInt();

            if (q>4 || m>4){
                System.out.println("4x4 index");
                continue;
            }

            kart1.karsila(k,l,q,m);
        }
    }
}
