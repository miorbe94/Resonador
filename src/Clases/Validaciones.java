
package Clases;

public class Validaciones {
    
    private static String decimales = "(-?[0-9]+([.][0-9]+)?)";
    
    public static boolean isDouble(String x){
        return x.matches(decimales) ? true : false;
    }
}
