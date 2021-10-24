// JAVA program to check whether two strings are anagrams of each other
import java.util.*;  
   
public class AnagramString {  

     /* function to check whether two strings are anagram of each other */
    static void isAnagram(String str1, String str2) {  
    
        //Remove space from the string
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean status = true;  
        
        //Checking length of both strings. If length of both strings is not same, then they cannot be anagram.
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            //Converting all letters in string to lowercase then to a char array
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            
            //Sorting the char array
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            
            //Compare sorted arrays
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) {  
            System.out.println(s1 + " and " + s2 + " are anagrams");  
        } else {  
            System.out.println(s1 + " and " + s2 + " are not anagrams");  
        }  
    }  
   
    /*Driver Code*/
    public static void main(String[] args) {  
        String str1 = "Mother In Law";
        String str2 = "Hitler Woman";
        isAnagram(str1, str2);  
    }
