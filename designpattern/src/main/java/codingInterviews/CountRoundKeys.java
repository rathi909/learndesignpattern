package codingInterviews;

public class CountRoundKeys {


    static String s ="110";
    public static void main(String[] args) {
        int len = s.length();
        int count=0;
        for(int i=0;i<len;i++)
        {
            int value =0;
            for(int j=i;j<len;j++)
            {
                value = value*2 + (s.charAt(j) - '0');
                int current = j-i +1;
                if(value ==current)
                {
                    count++;
                }
                if(value>len)
                {
                    break;
                }
            }

        }
     System.out.println(count);

    }
}
