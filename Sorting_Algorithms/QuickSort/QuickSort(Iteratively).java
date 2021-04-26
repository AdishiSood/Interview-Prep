import java.io.*;
import java.util.*;
import java.lang.*;

class QuickSort 
{
      public static int Partition(int[] numbers, int left, int right)
    {
        int pivot = numbers[left];
        while (true)
        {
            while (numbers[left] < pivot)
            left++;
            while (numbers[right] > pivot)
            right--;
            if (left < right)
              {
                int temp = numbers[right];
                numbers[right] = numbers[left];
                numbers[left] = temp;
              }
              else
              {
                    return right;
              }
        }
    }
    public static class QuickPosInfo
    {
        public int left;
        public int right;
    };
      public static QuickPosInfo info = new QuickPosInfo();
      public static void QuickSort_Iterative(int[] numbers, int left, int right)
    {
        if(left >= right)
        return; // Invalid index range
        LinkedList<QuickPosInfo> list = new LinkedList< QuickPosInfo>();
        info.left = left;
        info.right = right;
        list.add(info);
        while(true)
        {
            if(list.size() == 0)
                  break;
                  left = list.get(0).left;
                  right = list.get(0).right;
                  list.remove(0);
            int pivot = Partition(numbers, left, right);   
            if(pivot > 1)
            {
                info.left = left;
                info.right = pivot - 1;
                list.add(info);
            }
            if(pivot + 1 < right)
            {
                info.left = pivot + 1;
                info.right = right;
                list.add(info);
            }
        }
    }
    public static void main(String[] args)
    {
            int[] numbers = { 3, 8, 7, 5, 2, 1, 9, 6, 4 };
            int len = 9;
            System.out.println();
            System.out.println("QuickSort By Iterative Method");
            QuickSort_Iterative(numbers, 0, len - 1);
            for (int i = 0; i < 9; i++)
            System.out.println(numbers[i]);
    }
}
