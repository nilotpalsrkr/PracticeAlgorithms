package leetcode.dsa.medium;

public class Q1649_Create_Sorted_Array_through_Instructions {
    public int createSortedArray(int[] instructions) {
        int m = instructions.length;//(int) 1e5 + 1;
        int[] tree = new int[m * 2 + 1];

        long cost = 0;
        long MOD = (int) 1e9 + 7;
        for (int x : instructions) {
            cost += Math.min(query(0, x, tree, m), query(x + 1, m, tree, m));
            update(x, 1, tree, m);
        }
        return (int) (cost % MOD);
    }

    // implement Segment Tree
    private void update(int index, int value, int[] tree, int m) {
        index += m;
        tree[index] += value;
        for (index >>= 1; index > 0; index >>= 1)
            tree[index] = tree[index << 1] + tree[(index << 1) + 1];
    }

    private int query(int left, int right, int[] tree, int m) {
        int result = 0;
        for (left += m, right += m; left < right; left >>= 1, right >>= 1) {
            if ((left & 1) == 1)
                result += tree[left++];
            if ((right & 1) == 1)
                result += tree[--right];
        }
        return result;
    }
}
