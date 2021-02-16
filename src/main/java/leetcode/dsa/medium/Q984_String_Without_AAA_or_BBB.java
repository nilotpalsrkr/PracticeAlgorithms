package leetcode.dsa.medium;

import java.util.ArrayList;
import java.util.List;

public class Q984_String_Without_AAA_or_BBB {
    List<StringBuilder> list = new ArrayList<>();

    public String strWithout3a3b(int a, int b) {
        StringBuilder sb = new StringBuilder("");
        List<StringBuilder> list = new ArrayList<>();
        generate(a,b,new Counter(), sb);
        return sb.toString();
    }

    private Counter generate(int a, int b, Counter c, StringBuilder sb) {
        if(c.aCount == a  && c.bCounter == b) {
            list.add(sb) ;
            sb = new StringBuilder("");
        }
        if(c.aCounter < a && c.aCount%3 !=0  ){
            c.bCount = 1;
            sb.append("a");
            c.aCounter++;
            ++c.aCount;
            c = generate(a, b, c,sb);
        }
        if(c.bCounter < b && c.bCount %3 !=0 ) {
            sb.append("b");
            c.aCount = 1;
            c.bCounter++;
            ++c.bCount;
            c = generate(a,b, c,sb);
        }
        return c;
    }
}

class Counter {
    int aCount;
    int aCounter;
    int bCount;
    int bCounter;
    public Counter() {
        aCount = 1;
        bCount = 1;
        aCounter = 0;
        bCounter = 0;
    }
}