package codingInterviews;

public class ZigZagConvertatiom {

    public static void main(String[] args) {

        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convertInZigZag(s,numRows));
    }

    private static String convertInZigZag(String s, int numRows) {

        StringBuilder[] stringBuilder = new StringBuilder[numRows];

        for(int i =0;i<numRows;i++){
            stringBuilder[i] = new StringBuilder();
        }

        int countOfRows=0;
        boolean goingDown=false;
        for(Character c:s.toCharArray())
        {
            if(countOfRows==0 || countOfRows == numRows-1)
            {
                goingDown = !goingDown;
            }
            stringBuilder[countOfRows].append(c);
            if(goingDown)
            {
                countOfRows++;
            }
            else {
                countOfRows--;
            }

        }

        StringBuilder output = new StringBuilder();
        for (StringBuilder string:stringBuilder)
        {
            output.append(string);
        }

return  output.toString();

    }

}
