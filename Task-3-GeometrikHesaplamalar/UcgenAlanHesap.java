public class UcgenAlanHesap {
    public static void main(String[] args) {
        double a = 3, b = 4, c = 5;
        double s = (a + b + c) / 2; // çevre yarısı
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.printf("Ucgenin Kenarlari: a=%.1f, b=%.1f, c=%.1f%n", a, b, c);
        System.out.printf("s = (a + b + c) / 2 = %.2f%n", s);
        System.out.printf("Ucgenin Alani (Heron Formulu) = √[s(s-a)(s-b)(s-c)] = %.4f%n", alan);
    }
}
