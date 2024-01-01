import java.util.*;

public class GetSubsequence {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0); // a
        String sprt = str.substring(1); // bc
        ArrayList<String> rsprt = gss(sprt); // [-- , -c , b- , bc]

        ArrayList<String> mres = new ArrayList<>();
        for (String fstr : rsprt) {
            mres.add(fstr);
        }

        for (String fstr : rsprt) {
            mres.add(ch + fstr);
        }
        return mres;
    }
}
