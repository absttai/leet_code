package Solution02;


import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 */
class Solution {

    public static void main(String[] args) {
        List<List<Integer>> generate = generate(3);
        System.out.println(generate.toString());
    }

    public static List<List<Integer>> generate(int numRows) {
        // [1] [[1,1]] [[1,2,1]]
        ArrayList<List<Integer>> lists = new ArrayList<>();
        //i代表行,j代表每行几个元素
        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(lists.get(i - 1).get(j - 1) + lists.get(i - 1).get(j));
                }
            }
            lists.add(row);
        }

        return lists;
    }
}