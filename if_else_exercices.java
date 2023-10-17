package basic;

public class if_else_exercices {
    public static void main(String[] args) {
        
        System.out.println(ConsecutiveNumbers(67, 190, 23));

    }

    public static int maxNumber(int a, int b){
        return Math.max(a, b);
    }

    public static boolean esBisiesto(int año){
        return año % 4 == 0;
    }

    public static String lengthOrBlank(String cadena){
        return cadena.length() < 5 ? cadena + "     ." : cadena;
    }

    public static boolean cadenaEquals(String cadena, String cadena2){
        return cadena.equals(cadena2);
    }

    public static boolean unitNumber(int num){
        return String.valueOf(num).length() <= 1;
    }

    public static String lowerUpper(String cadena){
        return cadena.equals(cadena.toLowerCase()) ? cadena.toUpperCase() : cadena.toLowerCase();
    }

    public static String ConsecutiveNumbers(int a, int b, int c){
        return Math.min(Math.min(a,b), Math.min(b,c)) + "," + Integer.valueOf((a + b + c) - (Math.min(Math.min(a,b), Math.min(b,c)) + Math.max(Math.max(a,b), Math.max(b,c)))) + "," + Math.max(Math.max(a,b), Math.max(b,c)); 
    }

    // Math.min(Math.min(a,b), Math.min(b,c)); => el más pequeño.

    // (a + b + c) - (Math.min(Math.min(a,b), Math.min(b,c)) + Math.max(Math.max(a,b), Math.max(b,c))) => el intermedio.

    // Math.max(Math.max(a,b), Math.max(b,c)); => el más grande.

    public static double randomZeroToOne(){
        return Math.random();
    }

    // empezamos en 0 y 1 => multiplicamos todo por 14 (la diferencia entre 84 y 98) => 0 y 14 => sumamos 84 => 0 + 84 y 14 + 84 => [84 y 98].
    public static double random84to98(){
        return Math.random() * 14 + 84;
    }


}
