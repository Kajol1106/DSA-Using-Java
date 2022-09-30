public static void vowelAndConsonantCount(int n, String str){
    //write your code here
    int vowel = 0;      //count
    int cons = 0;       //count
    for(int i=0; i<n; i++) {
        char ch = str.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
              vowel++;
        }
        else {
            cons++;
        }
    }
    System.out.print(vowel+" "+cons);
  }