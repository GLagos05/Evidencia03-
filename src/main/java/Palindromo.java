public class Palindromo {
    public static void main(String[] args) {

        String palabra = "aenea";
        palabraPalindromo(palabra);
    }

    public static void palabraPalindromo(String palabra) {

        palabra = palabra.replace(" ", "");
        String palabraInvertida = invertirPalabra(palabra);
        if(palabra.equals(palabraInvertida)){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
    }

    public static String invertirPalabra(String palabra) {
        StringBuilder stringBuilder = new StringBuilder(palabra);
        return stringBuilder.reverse().toString();
    }
}
