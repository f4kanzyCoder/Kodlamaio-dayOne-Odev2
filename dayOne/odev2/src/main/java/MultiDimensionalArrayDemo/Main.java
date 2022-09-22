package MultiDimensionalArrayDemo;

public class Main {
    public static void main(String[] args) {
        String[][] sehirler=new String[3][3];
        sehirler[0][0]="Istanbul";
        sehirler[0][1]="Izmir";
        sehirler[0][2]="Ankara";
        sehirler[1][0]="Bursa";
        sehirler[1][1]="Balikesir";
        sehirler[1][2]="Adiyaman";
        sehirler[2][0]="Mugla";
        sehirler[2][1]="Aydin";
        sehirler[2][2]="Edirne";

        for (int i = 0; i <=2; i++) {
            System.out.println("-------------------");
            for (int j = 0; j <=2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }

    }
}
