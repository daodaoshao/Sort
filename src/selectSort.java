public class selectSort implements Sort{
    @Override
    public int[] sort(int[] array) {
        int length = array.length;
        if (length <= 1) return array;
        for (int i = 0; i < length - 1; ++i) { //  外层循环为已排空间
            int k = i ;
            //int temp = array[j];
            for (int j = k + 1; j < length; ++j) {
                if (array[j] < array[k]){
                    k = j;
                }
            }

            int temp = array[i];
            array[i] = array[k];
            array[k] = temp;

        }
        return array;
    }
}
