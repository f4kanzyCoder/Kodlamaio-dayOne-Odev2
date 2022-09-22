package StringDemo;

public class Main {
    public static void main(String[] args) {
        //Video1
        String mesaj = "Bugun hava yagmurlu";
        System.out.println(mesaj);
//
//        System.out.println(mesaj);
//
//        System.out.println("Eleman sayisi : "+mesaj.length());
//        System.out.println("5. Eleman : "+mesaj.charAt(5));
//        System.out.println(mesaj.concat(" Yasasin"));
//        System.out.println(mesaj.startsWith("B"));
//        System.out.println(mesaj.endsWith("."));
//        char[]karekterler=new char[5];
//        mesaj.getChars(0,5,karekterler,0);
//        System.out.println(karekterler);
//        System.out.println(mesaj.indexOf("av"));
//        System.out.println(mesaj.lastIndexOf("a"));

        //Video2
        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2, 5));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}
