import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a[] = new int[20];
        for (int i = 0; i < 20; ++i){
            a[i] = (int) (Math.random() * (1000 - 1) + 1);

        }
        System.out.println(Arrays.toString(a));
        //冒泡排序
      //  bubbleSort bubbleSort = new bubbleSort();
       // a =  bubbleSort.sort(a);
        //插入排序
//        insertSort insertSort = new insertSort();
//        a = insertSort.sort(a);
//        System.out.println(Arrays.toString(a));

        mergeSort mergeSort = new mergeSort();
       a = mergeSort.sort(a);
       System.out.println(Arrays.toString(a));
//        selectSort selectSort = new selectSort();
//        a = selectSort.sort(a);
//        System.out.println(Arrays.toString(a));
        int[] t = {1, 3, 5};
        int[] w = {2, 4, 6,8,10};
        mergeSort mergeSort1 = new mergeSort();
        System.out.println(Arrays.toString(mergeSort1.merge(t,w)));

    }
}
