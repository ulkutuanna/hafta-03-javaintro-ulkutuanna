public class UsluSayilarTablosu {
    public static void main(String[] args) {
        System.out.println("a\t a^2\t a^3");
        System.out.println("-----------------");
        for (int a = 1; a <= 5; a++) {
            int kare = a * a;
            int kup = a * a * a;
            System.out.printf("%d\t %d\t %d%n", a, kare, kup);
        }
    }
}
