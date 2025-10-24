public class MilKilometreTablosu {
    public static void main(String[] args) {
        double[] milDegerleri = {1, 5, 10, 20, 50};
        double katsayi = 1.609;
        System.out.println("Mil\t Kilometre");
        System.out.println("----------------");
        for (double mil : milDegerleri) {
            double km = mil * katsayi;
            System.out.printf("%.0f\t %.3f%n", mil, km);
        }
    }
}
