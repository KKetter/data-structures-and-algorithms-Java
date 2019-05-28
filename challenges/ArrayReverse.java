import java.util.Arrays;

public class ArrayReverse {
  public static void main (String[] args) {
    // create the array to test your code on later
    int[] startArr = new int[] {1,2,3,4,5,10};
    // print it out, nicely
    System.out.println(Arrays.toString(startArr));
    // call your reverseArray method and save the result in a variable
    int[] endArr = reverseArray(startArr);
    // print out the result, nicely
    System.out.println(Arrays.toString(endArr));
  }

  // the method you should write, to reverse an array
  public static int[] reverseArray(int[] inputArray) {
    for (int i = 0; i < answer.length / 2; i++) { 
          //FIRST PASS-placeholder value for initial array value
            int t = answer[i];
            //assign last position value to first [50,20,30,40,50] t=10
            answer[i] = answer[answer.length - i - 1];
            //put initial value at end of array
            answer[answer.length - i - 1] = t;
            //[x1,y1,z,y2,x2] x's then y's swap etc etc if even sized z values would swap

        } 
    // for now, to make sure that it compiles, here is a bad answer
    return new int[0];
  }
    
}
