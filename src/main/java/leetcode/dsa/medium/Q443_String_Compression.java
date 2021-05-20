package leetcode.dsa.medium;

public class Q443_String_Compression {
    public int compress(char[] chars) {
        StringBuilder result = new StringBuilder();
        if(chars.length > 0) {
            char c = chars[0];
            short count = 1;
            for(int i = 1; i <chars.length; i++) {
                if(chars[i] == c) count++;
                else {
                    result.append(new StringBuffer().append(c));
                    if(count >1)
                        result.append(count);
                    c = chars[i];
                    count = 1;
                }
            }
            result.append(new StringBuffer().append(c));
            if(count >1)
                result.append(count);
        }
        int i = 0;
        for(i = 0; i< chars.length; i++) {
            chars[i] = ' ';
        }
        i = 0;
        for(char c : result.toString().toCharArray()) {
            chars[i++] = c;
        }

        return result.length();
    }
}
