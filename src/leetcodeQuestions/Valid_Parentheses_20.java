package leetcodeQuestions;

public class Valid_Parentheses_20 {
    public static void main(String[] args) {
        String s= "(){}}{";

        System.out.println(isValid(s));

    }
    public static boolean isValid(String s) {
        // this is not submited if it comes's on DQ
//        boolean isTrue = false;
//        int n = s.length() -1;
//
//        for(int i =0;i<n;i++){
//            char check1 = s.charAt(i);
//            char check2 = s.charAt(i+1);
//            if(check2 == ' ' || check1 == ' '){
//                isTrue = false;
//            }
//            if(check1 =='(' && check2 ==')' || check1 == '[' && check2 == ']' || check1 =='{' && check2 =='}'){
//                isTrue = true;
//            }
//        }
//        return isTrue;

        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()", "")
                    .replace("[]", "")
                    .replace("{}", "");
        }

        return s.isEmpty();

    }
}
