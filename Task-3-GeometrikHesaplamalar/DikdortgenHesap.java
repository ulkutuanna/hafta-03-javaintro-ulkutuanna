public class DikdortgenHesap {
    public static void main(String[] args) {
        double en = 4.5;
        double boy = 7.9;
        double alan = en * boy;
        double cevre = 2 * (en + boy);
        System.out.printf("Dikdortgenin En: %.1f, Boy: %.1f%n", en, boy);
        System.out.printf("Dikdortgenin Alani = en * boy = %.4f%n", alan);
        System.out.printf("Dikdortgenin Cevresi = 2(en + boy) = %.4f%n", cevre);
    }
}
