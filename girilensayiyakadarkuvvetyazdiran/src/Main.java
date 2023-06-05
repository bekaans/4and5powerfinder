import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner newo = new Scanner(System.in);
        int i,j;
        System.out.print("Entry the number ="); int number = newo.nextInt();

        for (i=1 ;i<=number ;i*=4)

             {
                  System.out.println(i+"");
             }


        for (j=1 ;j<=number ;j*=5)

            {
                  System.out.println("    "+j);
            }


    }
}