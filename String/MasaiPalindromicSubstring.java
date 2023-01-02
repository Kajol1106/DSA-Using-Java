public static void masaiPalindromicSubstring(String str){
    //write your code here
    int n = str.length();
    int max_length = 1;
    int start = 0;
    
    for(int i=0; i<n; i++) {
        for(int j=i; j<n; j++) {
            int flag = 1;
            for(int k=0; k<(j-i+1)/2; k++) {
                if(str.charAt(i+k) != str.charAt(j-k)) {
                    flag = 0;
                }
            }
            
            if(flag!=0 && (j-i+1)>max_length) {
                start = i;
                max_length = j-i+1;
            }
        }
    }
    
    System.out.println(max_length);
  }
