public class quickSort implements Sort {
    @Override
    public int[] sort(int[] array) {
        int n  = array.length;
        quickSort_c(array,0,n-1);
        return array;
    }

    public void quickSort_c(int[] array, int p, int r) {
        if (p >= r){
            return;
        }
        int q = partion(array,p,r);
        quickSort_c(array,p,q-1);
        quickSort_c(array, q+1, r);

    }

    public int partion(int[] array, int p, int r) {  //  y原地分区的思想类似选择排序，利用i分为已处理区间和未处理区间
        int privot = array[r];
        int i = p;
        for (int j = p; j < r; ++j) {
            if (array[j] < privot) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                ++i;
            }

        }
        int temp = array[i];
        array[i] = array[r];
        array[r] = temp;
        return i;

    }
}
