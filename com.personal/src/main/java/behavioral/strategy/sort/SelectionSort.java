package behavioral.strategy.sort;

/**
 * @description:
 * @version: 1.0
 * @date: 2021-01-07 08:36:06
 * @author: wanglong16@meicai.cn
 * @summary:
 */
public class SelectionSort implements ISort{

    public void sortIntArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
