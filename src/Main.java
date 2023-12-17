import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        double u,alan, aKenari, bKenari, cKenari;
        Scanner input= new Scanner(System.in);
        System.out.println("A kenarını Giriniz : ");
        aKenari= input.nextInt();
        System.out.println("B Kenarını Giriniz : ");
        bKenari = input.nextInt();
        System.out.println("C kenarını Giriniz : ");
        cKenari = input.nextInt();

        u= (aKenari+bKenari+cKenari)/2;
        alan= Math.sqrt(u* (u-aKenari)*(u-bKenari)*(u-cKenari));
        System.out.println("Alan : " + alan);



        }
    }
