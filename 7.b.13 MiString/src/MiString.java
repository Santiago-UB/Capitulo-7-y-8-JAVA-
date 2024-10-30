/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Santiago Uribe Burgos
 */
public class MiString {

   
    public static String alReves(String cadena) {
        StringBuilder sb = new StringBuilder(cadena);
        return sb.reverse().toString();
    }


    public static String limpiaCaracteres(String cadena, String caracteresAEliminar) {
        for (char c : caracteresAEliminar.toCharArray()) {
            cadena = cadena.replace(String.valueOf(c), "");
        }
        return cadena;
    }


    public static String sustituye(String cadena, char original, char sustituto) {
        return cadena.replace(original, sustituto);
    }


    public static boolean todosIguales(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return false;
        }
        char primerCaracter = cadena.charAt(0);
        for (char c : cadena.toCharArray()) {
            if (c != primerCaracter) {
                return false;
            }
        }
        return true;
    }


    public static String quitaEspacios(String cadena) {
        return cadena.replaceAll("\\s+", "");
    }


    public static boolean esNumeroEntero(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return false;
        }
        for (char c : cadena.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}

