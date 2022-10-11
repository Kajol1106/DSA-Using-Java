public static void checkVowel(int n, String str){
    //write your code here
    if(isVowel(n, str)) {
        System.out.println("true");
    }
    else {
        System.out.println("false");
    }
    
  }
  
  public static boolean isVowel(int n, String str) {
      for(int i=0; i<n; i++) {
          char ch = str.charAt(i);
          if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
              return true;
          }
      }
      return false;
  }