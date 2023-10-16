package basic;

public class conversor {
    public static void main(String[] args) {
        System.out.println(DecimalToHex(binarioADecimal("11010111")));
    }

    // el truco es pasar de binario a decimal y después usar la conversión a hexadecimal:

    public static int binarioADecimal(String binario){

        StringBuilder binaryNumberReversed = new StringBuilder(binario).reverse();

        int decimal = 0;

        for(int i = 0; i < binaryNumberReversed.length(); i++){
            if(binaryNumberReversed.charAt(i) == '1'){
                decimal += (int) Math.pow(2, i);
            }
        }

        return decimal;
    }

    public static String DecimalToHex(int decimal){

        StringBuilder almacenador = new StringBuilder();
        boolean myBreak = false;

        while(decimal / 16 >= 0 && myBreak == false){

            int residuo = decimal % 16;
            String letras = "ABCDEF";
            
            /* sustituir la letra según el número (resto 10 para obtener los valores desde 0 y que se sincronice
            con la ubicación de cada letra) */
            if(residuo > 9){
                almacenador.append(letras.charAt(residuo - 10));
            }else{
                almacenador.append(residuo);
            }

            // que llegué a cero e INCLUYA EL ÚLTIMO NÚMERO, pero que rompa el bucle tiempo después (sin break);
            if(decimal / 16 == 0){
               myBreak = true;
            }

            // incrementador de división por iteración (MUY necesario, sino el bucle es infinito!!):
            decimal /= 16;
        }

        return almacenador.reverse().toString();
    }


}
