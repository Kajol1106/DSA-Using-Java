

public static void printArray(int index,int[] arr){
    if(index == arr.length) {
        return;
    }
    System.out.println(arr[index]);
    printArray(index+1, arr);
  }
  
  