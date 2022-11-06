import java.math.BigInteger;
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


    // Return the indexes of the ints whose sum are equal to target 
    public int[] twoSum(int[] nums, int target) {
        int i, j; 
        i = 0; j = 0;
        for(i = 0; i < nums.length-1; i++){
            for(j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    int[] res = {i, j};
                    return res;
                }
            }
        }
        int[] notFound = {0,0};
        return notFound;
    }


    // Add two numbers in reverse order in a linked list
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String n1 = listToReversedString(l1);
        String n2 = listToReversedString(l2);

        BigInteger res = new BigInteger(n1).add(new BigInteger(n2));

        StringBuilder sss = new StringBuilder();
        sss.append(res);

        return stringToList(sss.reverse().toString());
    }

    public String listToReversedString(ListNode l){
        StringBuilder res = new StringBuilder();
        while(l != null){
            res.append(l.val);
            l = l.next;
        }
        res.reverse();
        return res.toString();
    }

    public ListNode stringToList(String s){
        ListNode res = null;
        if(!s.isEmpty()){
            res = new ListNode(Integer.parseInt(s.substring(0, 1)), stringToList(s.substring(1)));
        }
        else{
            res=null;
        }
        return res;
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