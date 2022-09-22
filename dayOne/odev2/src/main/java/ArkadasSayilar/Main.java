package ArkadasSayilar;

public class Main {
    public static void main(String[] args) {
        //Kendileri haric pozitif tam bolenleri toplami birbirine esit olan sayiya arkadas sayi denir.Ornek;
        //220-284

        int sayi1=220;
        int sayi2=284;
        int toplam1=0;
        int toplam2=0;

        for (int i = 1; i <sayi1; i++) {
            if (sayi1%i==0){
                toplam1+=i;
            }
        }
        for (int i = 1; i <sayi2; i++) {
            if (sayi2%i==0){
                toplam2+=i;
            }
        }

        if (sayi1==toplam2 && sayi2==toplam1){
            System.out.println("bu iki sayi arkadastir");
        }else {
            System.out.println("bu iki sayi arkadas degildir");
        }
    }
}
