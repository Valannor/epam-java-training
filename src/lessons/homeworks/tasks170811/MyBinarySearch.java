package lessons.homeworks.tasks170811;

import java.util.List;

public class MyBinarySearch
{
    public static int search(List<Integer> list, int key)
    {
        int lo = 0;
        int hi = list.size() - 1;
        int no = -1;

        while (lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if (key < list.get(mid))
            {
                hi = mid - 1;
                no = mid + 1;
            }
            else if(key > list.get(mid))
            {
                lo = mid + 1;
                no = mid + 2;
            }
            else return mid;
        }

        return -no;
    }
}
