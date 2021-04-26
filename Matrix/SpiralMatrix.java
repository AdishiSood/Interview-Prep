/*
The Spiral Matrix problem takes a 2-Dimensional array of N-rows and M-columns as an input, and prints the elements of this matrix in spiral order.

The spiral begins at the top left corner of the input matrix, and prints the elements it encounters, while looping towards the center of this matrix, in a clockwise manner.
*/
import java.io.*; 
class SpiralMatrix {
  public static void spiralMatrixPrint(int[][] arr) {

    int rows = arr.length;
    int cols = arr[0].length;
  // Defining the boundaries of the matrix.
  int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
  
  // Defining the direction in which the array is to be traversed.
  int dir = 1;
 
  while (top <= bottom && left <= right) {

    if (dir == 1) {    // moving left->right
      for (int i = left; i <= right; ++i) {
        System.out.print(arr[top][i] + " ");
      }
      // Since we have traversed the whole first
      // row, move down to the next row.
      ++top;
      dir = 2;
    } 
    else if (dir == 2) {     // moving top->bottom
      for (int i = top; i <= bottom; ++i) {
          System.out.print(arr[i][right]+ " ");
      }
      // Since we have traversed the whole last
      // column, move left to the previous column.
      --right;
      dir = 3;
    } 
    else if (dir == 3) {     // moving right->left
      for (int i = right; i >= left; --i) {
          System.out.print(arr[bottom][i]+ " ");
      }
      // Since we have traversed the whole last
      // row, move up to the previous row.
      --bottom;
      dir = 4;
    } 
    else if (dir == 4) {     // moving bottom->up
      for (int i = bottom; i >= top; --i) {
          System.out.print(arr[i][left]+ " ");
      }
      // Since we have traversed the whole first
      // col, move right to the next column.
      ++left;
      dir = 1;
    }
  }   
}
  public static void main(String[] args) 
  { 
    // Driver code
    // Change the following array to test 
    // on some other input
    int a[][] = { {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
    spiralMatrixPrint(a); 
  } 
}
