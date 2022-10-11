public static void charAtEvenPos(int n, String str){
    //write your code here
    for(int i=0; i<n; i++) {
        if(i%2 == 0) {
            System.out.println(str.charAt(i));
        }
    }
  }