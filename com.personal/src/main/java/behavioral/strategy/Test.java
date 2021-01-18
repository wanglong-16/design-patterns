package behavioral.strategy;

import behavioral.strategy.sort.SortIntArrStrategy;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-07 08:05:18
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class Test {

    public static void main(String[] args) {
        int [] arr = {1, 3,  2, 6, 10, 22, 5, 7, 9};
        System.out.println("排序前 ===");
        printArr(arr);
        SortIntArrStrategy.SELLECTION_SORT.get().sortIntArr(arr);
        System.out.println("冒泡排序后 === ");
        printArr(arr);
    }

    private static void printArr(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
