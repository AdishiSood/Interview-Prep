import java.io.*;
import java.util.*;
import java.lang.*;

class MergeSort 
{
      static public void DoMerge(int [] numbers, int left, int mid, int right)
      {
        int [] temp = new int[25];
        int i, left_end, num_elements, tmp_pos;
        left_end = (mid - 1);
        tmp_pos = left;
        num_elements = (right - left + 1);
        while ((left <= left_end) && (mid <= right))
        {
            if (numbers[left] <= numbers[mid])
                temp[tmp_pos++] = numbers[left++];
            else
                temp[tmp_pos++] = numbers[mid++];
        }
        while (left <= left_end)
            temp[tmp_pos++] = numbers[left++];
        while (mid <= right)
            temp[tmp_pos++] = numbers[mid++];
        for (i = 0; i < num_elements; i++)
        {
            numbers[right] = temp[right];
            right--;
        }
    }
    static public class MergePosInfo
    {
        public int left;
        public int mid;
        public int right;
    }
    static public void MergeSort_Iterative(int [] numbers, int left, int right)
    {
        int mid;
        if (right <= left)
            return;
            LinkedList<MergePosInfo> list1 = new LinkedList<MergePosInfo>();
            LinkedList<MergePosInfo> list2 = new LinkedList<MergePosInfo>();
        MergePosInfo info = new MergePosInfo();
        info.left = left;
        info.right = right;
        info.mid = -1;
        list1.add(info);
        while(true)
        {
            if(list1.size() == 0)
                break;
            left = list1.get(0).left;
                  right = list1.get(0).right;
                  list1.remove(0);             
            mid = (right + left) / 2;
            if(left < right)
            {
                MergePosInfo info2 = new MergePosInfo();
                info2.left = left;
                info2.right = right;
                info2.mid = mid + 1;
                list2.add(info2);
                info.left = left;
                info.right = mid;
                list1.add(info);
                info.left = mid + 1;
                info.right = right;
                list1.add(info);
            }
        }
        for (int i = 0; i < list2.size(); i++)
        {
                  DoMerge(numbers, list2.get(i).left, list2.get(i).mid, list2.get(i).right);
        }
    }
    public static void main(String[] args)
      {
        int[] numbers = { 3, 8, 7, 5, 2, 1, 9, 6, 4 };
        int len = 9;
        System.out.println();
        System.out.println("MergeSort By Iterative Method");
        MergeSort_Iterative(numbers, 0, len - 1);
        for (int i = 0; i < 9; i++)
        System.out.println(numbers[i]);      
    }
}
