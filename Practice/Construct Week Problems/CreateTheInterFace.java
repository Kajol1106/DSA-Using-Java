/*
class order implements ArraySum{
    public int sum(int[] arr){
        int sum = 0;
        for (Integer i : arr) sum += i;
        return sum;
    }
    public boolean evenOdd(int[] arr){
        int even = 0;
        int odd = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i] % 2 == 0) even++;
            else{
                odd++;
            }
        }
        return even >= odd;
    }
    public boolean oddEven(int[] arr){
        int even = 0;
        int odd = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i] % 2 == 0) even++;
            else{
                odd++;
            }
        }
        return even <= odd;
    }
}
*/
interface ArraySum{
    // complete this interface
    int sum(int[] arr);
    boolean evenOdd(int[] arr);
    boolean oddEven(int[] arr);
  }
  
