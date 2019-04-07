public class insertSort implements Sort {
    @Override
    public int[] sort(int[] array) {
        int length = array.length;
        if (length <= 1) return array;
        for (int i = 1; i < length; ++i) { //外层为未排序列
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; --j) { //内层为已排序列
                if (array[j] > value) {
                    array[j + 1] = array[j];
                }
                else {break;}
            }
            array[j + 1] = value;
        }
        return array;
    }
}
