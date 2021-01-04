package leetcode.dsa.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
https://leetcode.com/problems/3sum/
 */

public class Q15_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int NI = 0, PI = nums.length;
       /* for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && NI != 0) {
                NI++;
                continue;

            }
            if (nums[i] >= 0) {
                PI = i;
                break;
            }
        }*/
        List<List<Integer>> resultList = new ArrayList<>();
        int k = 0;
        int[] indexArr = new int[3]; indexArr[k++] = nums[NI];
        int index = NI;
        Integer sum = 0;
        findSum(nums, sum, PI, NI,index, indexArr, k, resultList,false);
        return resultList;
    }

    public void findSum(int[] nums, int sum, int PI, int NI,int index ,int[] indexArr, int k,List<List<Integer>> resultList, boolean done) {
        sum = sum + nums[index];
        if((k==3 && sum!=0)) return;
        if(sum == 0 && k==3)  {
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < 3; i++){
                list.add(indexArr[i]);
            }
            resultList.add(list);

            return;
        }

        if(sum < 0 && k<3) {

            index = --PI;
            indexArr[k++] = nums[index];
            findSum(nums, sum, PI, NI, index, indexArr, k, resultList, done);
            //PI--;
            //NI++;
            k = 0;
            sum = 0;

            indexArr = null;
            indexArr = new int[3];

        }


        if(sum >= 0 && k<3) {
            index = ++NI;
            indexArr[k++] = nums[index];
            findSum(nums, sum, PI, NI,index, indexArr, k, resultList, done);

        }
    }
}



/*
  final int SIZE = 3;
    public List<List<Integer>> threeSum(int[] nums) {

    List<Integer> positiveSorted = Arrays.stream(nums).boxed().filter(x -> x>=0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    List<Integer> negativeSorted = Arrays.stream(nums).boxed().filter(x -> x<0).sorted().collect(Collectors.toList());
    Integer zero = positiveSorted.get(positiveSorted.size() - 1) == 0 ? 0: -1;
    positiveSorted.removeIf(x -> x.intValue() == 0);
    List<List<Integer>> listOfMakingZerosLists = new ArrayList<>();
    for(Integer positiveNum : positiveSorted) {
        List<Integer> listMakingZeros = new ArrayList<>();
        int sum = positiveNum;int size = 0;
        listMakingZeros.add(sum);
        for(Integer negativeNum : negativeSorted) {
            sum = sum + negativeNum;

            if(sum >=0 && size<=SIZE) {
                listMakingZeros.add(negativeNum);
                size++;
            }
            else {
                break;
            }
        }
        if(listMakingZeros.stream().mapToInt(i ->i.intValue()).sum() == 0) {
            if(listMakingZeros.size()== SIZE - 1 && zero==0)listMakingZeros.add(zero);
            listOfMakingZerosLists.add(listMakingZeros);
        }
    }
    return listOfMakingZerosLists;
    }
 */
