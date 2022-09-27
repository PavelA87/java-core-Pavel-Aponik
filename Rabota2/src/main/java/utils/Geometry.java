package utils;

public class Geometry {


    public static String getRoots(int a, int b, int c) {

        String s;
        double x1, x2;

        int d = b * b - 4 * a * c;
        if (d < 0) {
            s = "Квадратное уравнение " + a + "*x^2 + " + b + "*x + " + c + " = 0 не имеет корней";
        } else if (d == 0) {
            x1 = x2 = -b / (2 * a);
            s = "Квадратное уравнение " + a + "*x^2 +" + b + "*x " + c + " = 0 равны x1 = x2 равно " + x1;
        } else {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            s = "Квадратное уравнение " + a + "*x^2 +" + b + "*x " + c + " = 0 равны x1 = " + x1 + ", x2 = " + x2;
        }

        return s;
    }

    public static int getHyp(int k1, int k2){
        int g;
        g = (int) Math.round(Math.sqrt(Math.pow(k1, 2) + Math.pow(k2, 2)));
        return g;
    }


    public static void main(String[] args)
    {

        System.out.println(getHyp(5, 10));
//        System.out.println(getRoots(1, -3, -4));
    }
}





