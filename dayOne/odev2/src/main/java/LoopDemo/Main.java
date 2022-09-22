package LoopDemo;

public class Main {
    public static void main(String[] args) {
        //For
        for (int i = 3; i <= 9; i+=3) {
            System.out.println(i);
        }
        System.out.println("Dongu Bitti");
        System.out.println("-------------------------------");
        //While
        int i=0;
        while(i<10){
            System.out.println(i);
            i+=3;
        }
        System.out.println("While Dongusu Bitti");
        System.out.println("-------------------------------");
        //Do While
        int j=1;
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
            System.out.println("Do-While Dongusu Bitti.");

    }
}
