import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a[] = new int[50];
        for (int i = 0; i < 50; ++i){
            a[i] = (int) (Math.random() * (1000 - 1) + 1);

        }
        System.out.println(Arrays.toString(a));
        bubbleSort bubbleSort = new bubbleSort();
        a =  bubbleSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
