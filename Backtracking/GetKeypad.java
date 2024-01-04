package Day_28;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKeypad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Key pad numbers : ");
        String keys = sc.next();
        ArrayList<String>words = getKPC(keys);
        System.out.println(words);
    }
     static String[] code = { ".;", "abc" , "def" , "ghi" , "jkl" , "mno", "pqrs" ,"tu","vwx","yz"};
  
  public static ArrayList<String> getKPC(String str){
    
    if(str.length() == 0){
      ArrayList<String> bres = new ArrayList<>();
      bres.add(" ");
      return bres;
    }
    
    char ch = str.charAt(0);
    String ros = str.substring(1);
    ArrayList<String>rres = getKPC(ros);
    
    ArrayList<String> myres = new ArrayList<>();
     String charcodestr = code[ch -'0'];
     for(int i = 0; i<charcodestr.length(); i++){
        char charcode = charcodestr.charAt(i);
        for(String rstr : rres){
          myres.add(charcode + rstr);
        }
     }
     return myres;
  }
}
