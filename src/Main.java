import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a[] = new int[20];
        for (int i = 0; i < 20; ++i){
            a[i] = (int) (Math.random() * (1000 - 1) + 1);

        }
        System.out.println(Arrays.toString(a));
      //  bubbleSort bubbleSort = new bubbleSort();
       // a =  bubbleSort.sort(a);
        insertSort insertSort = new insertSort();
        a = insertSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
