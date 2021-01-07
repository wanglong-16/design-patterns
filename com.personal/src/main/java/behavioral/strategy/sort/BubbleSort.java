package behavioral.strategy.sort;

/**
 * @description: 冒泡排序
 * @version: 1.0
 * @date: 2021-01-07 08:36:50
 * @author: wanglong16@meicai.cn
 * @summary: 通过加减法运算交换俩个变量，比使用临时变量来交换值更能节省空间
 */
public class BubbleSort implements ISort{

    public void sortIntArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    //swap j and j+1
                    arr[j + 1] = arr[j + 1] + arr[j];
                    arr[j] = arr[j + 1] - arr[j];
                    arr[j + 1] = arr[j + 1] - arr[j];
                }
            }
        }
    }
}
