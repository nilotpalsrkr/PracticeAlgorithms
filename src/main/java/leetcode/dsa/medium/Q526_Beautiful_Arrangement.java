package leetcode.dsa.medium;

import java.util.Arrays;

public class Q526_Beautiful_Arrangement {
    Integer count;
    public int countArrangement(int N) {
        count = 0;
        boolean[] visited = new boolean[N+1];

        calc(N, 1, visited);
        return count;


    }

    private void calc(int num, int index, boolean[] visited) {
       if(index > num) count++;
        else {
            for(int i = 1; i <= num; i++) {
                if(!visited[i] && (index%i ==0 || i%index == 0)) {
                    visited[i] = true;
                    calc(num, index+1, visited);
                    visited[i] = false;
                }
            }
        }
    }

}
