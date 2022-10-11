/*
interface stringFunctions{
  public void print(String a,String b);
  public int countVowels(String a,String b);
  public int countConsonants(String a,String b);
  public int valueOfString(String a,String b);
}
*/
// Please note that the string contains both uppercase and lowercase characters
class strClassOne implements stringFunctions{
    // implement all the function inherited by this class
    public String print(String a,String b){
        // This function prints both the strings on the same line separated by space
        return a+" "+b;
    }
    
    
    public int countVowels(String a,String b){
       // This function returns the length of the string having lesser number of vowels. 
      //In case both the strings, have the same number of vowels return the length of the bigger string
      int count1 = 0;
      int count2 = 0;
      for(int i=0; i<a.length(); i++) {
          char ch = a.charAt(i);
          if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
              ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                  count1++;
          }
      }
      
      for(int i=0; i<b.length(); i++) {
          char ch = b.charAt(i);
          if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
              ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                  count2++;
          }
      }
      
      if(count1>count2) {
          return b.length();
      }
      else if(count1<count2) {
          return a.length();
      }
      else{
          if(a.length()>b.length()) return a.length();
          else return b.length();
      }
    }
    
    
      public int countConsonants(String a,String b){
         // This function returns the length of the string having lesser number of consonants
         // In case both the strings have the same number of consonants, return the length of the bigger string
          int count1 = 0;
          int count2 = 0;
          for(int i=0; i<a.length(); i++) {
              char ch = a.charAt(i);
              if(ch!='a' || ch!='e' || ch!='i' || ch!='o' || ch!='u' ||
                  ch!='A' || ch!='E' || ch!='I' || ch!='O' || ch!='U') {
                      count1++;
              }
          }
      
          for(int i=0; i<b.length(); i++) {
              char ch = b.charAt(i);
              if(ch!='a' || ch!='e' || ch!='i' || ch!='o' || ch!='u' ||
                  ch!='A' || ch!='E' || ch!='I' || ch!='O' || ch!='U') {
                      count2++;
              }
          }
      
          if(count1<count2) {
              return a.length();
          }
          else if(count1>count2) {
              return b.length();
          }
          else {
              if(a.length()>b.length()) return a.length();
              else return b.length();
          }
      }
  }
  
  
  class strClassTwo implements stringFunctions{
    // implement all the function inherited by this class
    public String print(String a,String b){
        // This functions prints string a and string b on two different lines
        return a+"\n"+b;
    }
    
    
    public int countVowels(String a,String b){
         // This function returns the length of the string having more number of vowels. 
        //In case both the strings, have the same number of vowels return the length of the smaller string
        int count1 = 0;
          int count2 = 0;
          for(int i=0; i<a.length(); i++) {
              char ch = a.charAt(i);
              if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                  ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                      count1++;
              }
          }
      
      for(int i=0; i<b.length(); i++) {
          char ch = b.charAt(i);
          if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
              ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                  count2++;
          }
      }
      
      if(count1>count2) {
          return a.length();
      }
      else if(count1<count2) {
          return b.length();
      }
      else{
          if(a.length()>b.length()) return b.length();
          else return a.length();
      }
    }
    
    
      public int countConsonants(String a,String b){
         // This function returns the length of the string having more number of consonants
         // In case both the strings have the same number of consonants, return the length of the smaller string
         int count1 = 0;
          int count2 = 0;
          for(int i=0; i<a.length(); i++) {
              char ch = a.charAt(i);
              if(ch!='a' || ch!='e' || ch!='i' || ch!='o' || ch!='u' ||
                  ch!='A' || ch!='E' || ch!='I' || ch!='O' || ch!='U') {
                      count1++;
              }
          }
      
          for(int i=0; i<b.length(); i++) {
              char ch = b.charAt(i);
              if(ch!='a' || ch!='e' || ch!='i' || ch!='o' || ch!='u' ||
                  ch!='A' || ch!='E' || ch!='I' || ch!='O' || ch!='U') {
                      count2++;
              }
          }
      
          if(count1<count2) {
              return b.length();
          }
          else if(count1>count2) {
              return a.length();
          }
          else {
              if(a.length()>b.length()) return b.length();
              else return a.length();
          }
      }
  }
  
  
