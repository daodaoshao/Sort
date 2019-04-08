public class countingSort implements Sort {
    @Override
    public int[] sort(int[] array) {
        int n = array.length;
        if (n <= 1) {
            return array;
        }
        //查找数组中的数据范围
        int max = array[0];
        for (int i = 0; i < n; i++) {
            if(max < array[i]) {
                max = array[i];
            }

        }
        //申请一个计数数组，范围为[0,max]
        int[] c = new int[max + 1];
        for (int i = 0; i <= max; i++) {
            c[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            c[array[i]]++;
        }

        //依次累加
        for (int i = 1; i <= max; i++) {
            c[i] = c[i - 1] + c[i];
        }

        //数组r来存储排序后的数组
        int[] r = new int[n];
        for (int i = n - 1; i >=0; --i){
            int index = c[array[i]] - 1;
            r[index] = array[i];
            c[array[i]]--;

        }
        return r;

    }
}
