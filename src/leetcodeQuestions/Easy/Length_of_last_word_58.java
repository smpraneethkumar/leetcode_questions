package leetcodeQuestions.Easy;

public class Length_of_last_word_58 {

    public static void main(String[] args) {

        String s = "   fly me   to   the moon  ";


        System.out.println(lengthOfLastWord(s));

    }

    public static int  lengthOfLastWord(String s) {

        s.toLowerCase();
        String r =  s.trim();
        int ans = 0;
        int n = r.length()-1;

        for(int i =n;i>=0;i--){

            if(r.charAt(i) != ' '  ){

                ans++;
            }
            else{
                return ans;
            }
        }

        return ans;
    }
}
