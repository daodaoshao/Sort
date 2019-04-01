import java.util.Arrays;

public class mergeSort implements Sort {
    @Override
    public int[] sort(int[] array) {
        return mergeSort_c(array, 0 ,array.length - 1);
    }
    public int[] mergeSort_c(int[] a,int p, int r) {
        if (p >= r){ return a;}
        int q =  (p + r) / 2;
        mergeSort_c(a, p, q);
        mergeSort_c(a, q + 1, r);
        return merge(Arrays.copyOfRange(a, p, q), Arrays.copyOfRange(a, q + 1, r));

    }

    public int[] merge(int[] j, int[] k) {
        int jlength = j.length;
        int klength = k.length;
        int[] temp = new int[jlength + klength];
        int l,n,m;
        l = n = m = 0;

        while (n < jlength && m < klength) {

            if (j[n] <= k[m]) {
                temp[l] = j[n];
                n++; ++l;
            } else {
                temp[l] = k[m];
                m++; ++l;
            }
        }
        if (n == jlength) {
            while (l < (klength + jlength)) {
                temp[l] = k[m];
                ++l; ++m;
            }
        }
        if (m == klength) {
                while (l < (jlength + klength)) {
                    temp[l] = j[n];
                    ++l; ++n;
                }
        }
        return temp;
        }
    }


