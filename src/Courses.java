public class Courses {
    String code ;
    String sub;
    int c;
    String preq;

    public Courses() {
        this.code = code;
        this.sub = sub;
        this.c = c;
        this.preq = preq;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public int getC() {
        return c;
    }

    @Override
    public String toString() {
        return    sub + "   (" + code +")"  ;
    }

   
    

    public void setC(int c) {
        this.c = c;
    }

    public String getPreq() {
        return preq;
    }

    public void setPreq(String preq) {
        this.preq = preq;
    }
    
    
    
    
}
