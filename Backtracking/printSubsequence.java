package Day_27;

public class printSubsequence {
    public static void main(String[] args) {
         print("abc","");
    }
    public static void print(String ques , String ans){
            if(ques.length() == 0){
                System.out.println(ans);
                return;
            }
        char ch = ques.charAt(0);
       String baki = ques.substring(1);
        print(baki , ans+ch); // pick
        print(baki , ans+""); // not pic
    }
}
