import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a[] = new int[20];
        for (int i = 0; i < 20; ++i){
            a[i] = (int) (Math.random() * (100- 1) + 1);

        }
//      int[] a ={1,6,8,45,998,2,17,2,68};
      System.out.println(Arrays.toString(a));
        //冒泡排序
      //  bubbleSort bubbleSort = new bubbleSort();
       // a =  bubbleSort.sort(a);
        //插入排序
//        insertSort insertSort = new insertSort();
//        a = insertSort.sort(a);
//        System.out.println(Arrays.toString(a));

        //归并排序（有错误）
//        mergeSort mergeSort = new mergeSort();
//       a = mergeSort.sort(a);
//       System.out.println(Arrays.toString(a));
//        selectSort selectSort = new selectSort();
//        a = selectSort.sort(a);
//        System.out.println(Arrays.toString(a));
//        int[] t = {1, 3, 5,78,456,123456};
//        int[] w = {2, 4, 6,8,10,13};
//        mergeSort mergeSort1 = new mergeSort();
//        System.out.println(Arrays.toString(mergeSort1.merge(t,w)));
////));
//
        //快速排序
//        quickSort quickSort = new quickSort();
//        a = quickSort.sort(a);
//        System.out.println(Arrays.toString(a));
        //计数排序
        countingSort countingSort = new countingSort();
        a = countingSort.sort(a);
        System.out.println(Arrays.toString(a));


    }
}
