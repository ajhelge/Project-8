package lab108.helgesonaj;

/**
 * A class for lab 8 that holds any helper methods that surve a 
 * more universal purpose.
 */
public class helperMethods {

    public static boolean isOperator(String token){
        if(token.matches("[+\\/\\*-]")){
            return true;
        }
        return false;
    }

    public static boolean isNumber(String token){
        if(token.matches("\\d{1,}")){
            return true;
        }
        return false;
    }

    public static boolean isLeftBracket(String token){
        if(token.matches("[\\[\\{\\(]")){
            return true;
        }
        return false;
    }

    public static boolean isRightBracket(String token){
        if(token.matches("[\\]\\}\\)]")){
            return true;
        }
        return false;
    }

}