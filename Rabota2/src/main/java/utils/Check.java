package utils;

public class Check{

//    1 - ый метод
    public static boolean isOdd(int a){

        if (a % 2 != 0) {
            return true;
        }
        else {
            return false;
        }
    }

//    2 - ой метод
    public static boolean isDevidedByThree(int a){

        if (a % 3 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

//    3 - ий метод
    public static boolean isDevidedByFiveAndSeven(int a){

        if (a % 5 == 0 && a % 7 == 0) {
            return true;
        }
        else {
            return false;
        }
    }


//    public static void main(String[] args) {

//        System.out.println();

}
//}




