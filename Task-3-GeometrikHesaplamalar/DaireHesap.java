public class DaireHesap {
    public static void main(String[] args) {
        double yaricap = 5.5;
        double pi = Math.PI;
        double alan = pi * yaricap * yaricap;
        double cevre = 2 * pi * yaricap;
        System.out.printf("Yaricap: %.1f%n", yaricap);
        System.out.printf("Dairenin Alani = pi * r^2 = %.4f%n", alan);
        System.out.printf("Dairenin Cevresi = 2 * pi * r = %.4f%n", cevre);
    }
}
