public static void checkPalindrome(int n, String str){
    //write your code here
    String reverse = "";
    for(int i=0; i<n; i++) {
        char ch = str.charAt(i);
        reverse = ch+reverse;
    }
    //System.out.println(reverse);
    if(str.equals(reverse)) {
        System.out.println("Yes");
    }
    else {
        System.out.println("No");
    }
  }
