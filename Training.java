import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Training{

    // Reversing a string
    public static String reverse(String str){
        StringBuilder out = new StringBuilder(str.length());
        char[] in = str.toCharArray();
        for(int i = str.length()-1; i >= 0; i--){
            out.append(in[i]);
        }
        return out.toString();
    }


    // Character swap w/out 3rd variable
    public static void swap(int[] arr, int a, int b){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == a){
                arr[i] = b;
            }
            else if(arr[i] == b){
                arr[i] = a;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    // Check for vowels in a String
    public static boolean hasVowels(String str){
        char[] in = str.toLowerCase().toCharArray();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for(int i = 0; i < in.length; i++){
            for(int ii = 0; ii < vowels.length; ii++){
                if(in[i] == vowels[ii]){
                    return true;
                }
            }
        }

        return false;
    }


    // Check if a number is prime 
    public static boolean isPrime(int number){
        int aux = number;
        if(number <= 1)
            return false;

        while(aux > 0){
            if(number % aux == 0){
                if(!(aux == number | aux == 1)){
                    return false;
                }
            }
            aux -= 1;
        }
        return true;
    }
    
    
    // Remove whitespaces of a String 
    public static String rmWhiteSpaces(String str){
        StringBuilder out = new StringBuilder(str.length());
        char[] in = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            if(!Character.isWhitespace(in[i]))
                out.append(in[i]);
        }
        return out.toString();
    }
    
    public static void main(String[] args){
        // System.out.println(reverse("Hello New World"));
        // int[] test = {1, 2, 3, 4, 5};
        // swap(test, 3, 5);
        // System.out.println(hasVowels("hll nw wrld"));
        // System.out.println(isPrime(79));;
        // System.out.println(rmWhiteSpaces("   Hello New World   "));
    }
}