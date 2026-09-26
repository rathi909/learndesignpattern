package leetcode;

public class LengthOfLastWords2 {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World  goat "));

    }

    static int lengthOfLastWord(String str)
    {
        int len=0;
        for(int i=str.length()-1;i>0;i--)
        {
            if(str.charAt(i)==' ' && len==0)
            {
                continue;
            }
            else if(str.charAt(i)==' ' && len>0)
            {
                break;
            }
            else {
                len++;
            }
        }
        return len;
    }
}
