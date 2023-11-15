import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);

        //a)
        int x1=0;
        while(x1<6){
            System.out.println(x1);
            x1++;
        }

        System.out.println("");

        //b)
        int x2=2;
        while(x2<6){
            System.out.println(x2);
            x2++;
        }

        System.out.println("");

        //c)
        for(int x3=0; x3<6; x3++){
            System.out.println(x3);
        }

        System.out.println("");

        //d)
        int x4=2;
        do{
            System.out.println(x4);
            x4++;
        }while(x4<6);

        System.out.println("");

        //e)
        int x5=5;
        while(x5>-1){
            System.out.println(x5);
            x5--;
        }

        System.out.println("");

        //f)
        for(int x6=5; x6>-1; x6--){
            System.out.println(x6);
        }

        System.out.println("");

        //g)
        System.out.println("Skriv ut 5 tal: ");
        int[] z = new int [5]; //(Användaren ska kunna mata in 5 tal i en for-loop. FIXA)

        for(int i=0; i<z.length; i++){
            z[i] = tangentbord.nextInt();
        }

        System.out.println("");
        System.out.println("Du skrev ut talen: ");

        for(int i = 0; i<z.length; i++){
            System.out.println(z[i]);
        }

        System.out.println("");


        //h)
        System.out.println("Dina tal i motsatt ordning är: ");
        for(int i=4; i>-1; i--){
            System.out.println(z[i]);
        }

        System.out.println("");

        //i)
        System.out.println("Välj hur många \"*\" du vill skriva ut: ");
        int m = tangentbord.nextInt();

        for(int i=0; i<m; i++){
            System.out.print("*");
        }

        System.out.println("");

        //j)
        System.out.println("Välj hur många rader av \"*\" som ska skrivas ut: ");
        int r = tangentbord.nextInt();

        System.out.println("Välj hur många kolumner av \"*\" som ska skrivas ut: ");
        int k = tangentbord.nextInt();

        for(int i=0; i<k; i++){
            System.out.println("");
            for(int l=0; l<r; l++){
                System.out.print("*");
            }
        }



    }
}
