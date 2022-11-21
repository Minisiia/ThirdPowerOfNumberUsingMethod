public class ThirdPowerOfNumberUsingMethod {
    public static void main(String[] args) {
        double a1 = 1;
        double a2 = 2;
        double a3 = 3;
        double a4 = 4;
        double a5 = 5;

        System.out.println(PowerA3(a1));
        System.out.println(PowerA3(a2));
        System.out.println(PowerA3(a3));
        System.out.println(PowerA3(a4));
        System.out.println(PowerA3(a5));
    }

    static double PowerA3(double a) {
        double c = Math.pow(a, 3);
        return c;
    }
}
