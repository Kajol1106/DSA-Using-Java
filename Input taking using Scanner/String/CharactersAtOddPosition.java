public static void charAtOddPos(int n, String str){
    //write your code here
    for(int i=0; i<n; i++) {
        if(i%2 == 1) {
            System.out.println(str.charAt(i));
        }
    }
  }