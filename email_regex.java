package basic;

public class email_regex {
    public static void main(String[] args) {
        System.out.println(email_noRegex("jan56@gmail.com"));
    }

    public static boolean email_noRegex(String email){

        boolean result = true;

        if(!email.contains("@")){
            return result = false;
        }

        String parteLocal = email.substring(0, email.indexOf('@'));
        String parteDominio = email.substring(email.indexOf('@'), email.length());

        // comprobaciones iniciales:
        if(parteLocal.isEmpty() || parteDominio.length() == 1){
            result = false;
        }

        // comprobar si todos los elementos de parteLocal son digitos o letras:
        for(int i = 0; i < parteLocal.length(); i++){
            if(!Character.isLetterOrDigit(parteLocal.charAt(i))){
                result = false;
            }
        }

        // comprobar si se repite el '@' más de una vez:
        for(int i = 0; i < parteDominio.length(); i++){
            if(i > 0 && parteDominio.charAt(i) == '@'){
                result = false;
            }
        }

        return result;
    }
}
