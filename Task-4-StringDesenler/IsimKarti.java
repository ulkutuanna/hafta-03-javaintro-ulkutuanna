public class IsimKarti {
    public static void main(String[] args) {
        String ad = "Ulku Tuanna";
        String soyad = "Kara";
        String ogrenciNo = "250541077";
        String bolum = "Yazilim Muhendisligi";
        System.out.println("************************************");
        System.out.printf("* %-34s *%n", "ISIM KARTI");
        System.out.println("************************************");
        System.out.printf("* %-10s: %-20s *%n", "Ad", ad);
        System.out.printf("* %-10s: %-20s *%n", "Soyad", soyad);
        System.out.printf("* %-10s: %-20s *%n", "Ogrenci No", ogrenciNo);
        System.out.printf("* %-10s: %-20s *%n", "Bolum", bolum);
        System.out.println("************************************");
    }
}
