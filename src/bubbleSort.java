public class bubbleSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        int length = array.length;
        if (length <= 1) return array;
        for (int i = 0; i < length; ++i){
            boolean flag = false;
            for (int j = 0; j < length - i - 1; ++j){
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag  = true;

                    }

                }
            if (!flag){
                break;
            }
        }
        return array;


    }
}
