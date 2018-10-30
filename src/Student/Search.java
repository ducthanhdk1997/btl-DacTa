package Student;

import Student.Compare;

import java.util.List;



public class Search <T>{
    public static<T> T binary(List<T> items, T x, Compare<T> compare) {
        int left = 0, right = items.size() - 1, mid;
        while(left != right) {
            mid = (left + right) / 2;
            int cmp = compare.compare(items.get(mid), x);

            if(cmp == 0) {
                return items.get(mid);
            }
            if(cmp < 0) {
                left = mid;
            }
            if(cmp > 0) {
                right = mid;
            }
        }
        return null;
    }
}