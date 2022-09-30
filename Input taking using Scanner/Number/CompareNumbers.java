/*
interface comparison{
  public int comparemax(int a,int b);
  public int comparemax(int a,int b,int c);
  public int comparemax(int a,int b,int c,int d);
  public int comparemax(int a);
  public int comparemin(int a);
  public int comparemin(int a,int b);
  public int comparemin(int a,int b,int c);
  public int comparemin(int a,int b,int c,int d);
    
  
}
*/
class numberclass implements comparison{
    // complete the class which implements the comparison class
    
    //compare two number return max
    public int comparemax(int a, int b) {
        if(a>b) return a;
        else return b;
    }
    
    //compare three number return max
    public int comparemax(int a, int b, int c) {
        if(a>b) {
            if(a>c) return a;
            else return c;
        }
        else if(b>c) {
            return b;
        }
        else {
            return c;
        }
    }
    
    //compare four number return max
    public int comparemax(int a, int b, int c, int d) {
        if(a>b) {
            if(a>c) {
                if(a>d) return a;
                else return d;
            }
            else if(c>d) {
                return c;
            }
            else {
                return d;
            }
        }
        else if(b>c) {
            if(b>d) return b;
            else return d;
        }
        else if(c>d) {
            return c;
        }
        else {
            return d;
        }
    }
    
    public int comparemax(int a) {
        return a;
    }
    
    public int comparemin(int a) {
        return a;
    }
    
    //compare two number return min
    public int comparemin(int a, int b) {
        if(a>b) return b;
        else return a;
    }
    
    //compare three number return min
    public int comparemin(int a, int b, int c) {
        if(a<b) {
            if(a<c) return a;
            else return c;
        }
        else if(b<c) {
            return b;
        }
        else {
            return c;
        }
    }
    
    //compare four number return min
    public int comparemin(int a, int b, int c, int d) {
        if(a<b) {
            if(a<c) {
                if(a<d) return a;
                else return d;
            }
            else if(c<d) {
                return c;
            }
            else {
                return d;
            }
        }
        else if(b<c) {
            if(b<d) return b;
            else return d;
        }
        else if(c<d) {
            return c;
        }
        else {
            return d;
        }
    }
    
 }
 