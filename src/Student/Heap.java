package Student;

import java.util.List;

public class Heap <T>{
    public static <T> List<T> sort(List<T> pq, Compare<T> compare) {
        int n = pq.size();
        for (int k = n /2; k >= 1; k--)
            sink(pq, k, n, compare);
        while (n > 1) {
            exch(pq, 1, n--);
            sink(pq, 1, n, compare);
        }
        return pq;
    }

    /***************************************************************************
     * Helper functions to restore the heap invariant.
     ***************************************************************************/

    private static<T> void sink(List<T> pq, int k, int n, Compare<T> compare) {
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && compare.compare(pq.get(j - 1), pq.get(j+1 - 1)) == 0) j++;
            if (compare.compare(pq.get(k - 1), pq.get(j - 1)) != 0) break;
            exch(pq, k, j);
            k = j;
        }
    }

    /***************************************************************************
     * Helper functions for comparisons and swaps.
     * Indices are "off-by-one" to support 1-based indexing.
     ***************************************************************************/

    private static<T> void exch(List<T> pq, int i, int j) {
        T swap = pq.get(i-1);
        pq.set(i-1, pq.get(j-1));
        pq.set(j-1, swap);
    }
}
