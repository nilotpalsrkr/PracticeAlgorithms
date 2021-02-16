package leetcode.dsa.medium;

public class Q1663_Smallest_String_With_A_Given_Numeric_Value {
    //char[] alphabetArr = {'z','y',''};
    public String getSmallestString(int n, int k) {
        int i  = 26;
        String result = "";
        while(i> 0) {
            smallestString(n, 0, k, k, new StringBuffer(""), result, i--);
        }
        return result;
    }

    public void smallestString(int n, int nCounter, int k , int kCounter, StringBuffer sb, String result, int i ) {
        if(nCounter == n && kCounter == k && i>0) result = sb.reverse().toString();
        else if(nCounter > n || kCounter < 0 || i<0)  return;
        else {
                int tempI = i;
                i = kCounter/i;
                sb.append((char)(i + 121));
                smallestString(n, ++nCounter, k, kCounter%tempI, sb, result,i);


        }
    }
}
