package mutahir;

class Base{
    public int a;
    public int b;
    public void setNumberA(int n){
        a = n;
    }
    public int getNumberA(){
        return a;
    }
    public void setNumberB(int n){
        b = n;
    }
    public int getNumberB(){
        return b;
    }
}

class Derived extends Base{
    public int c;
    public void setNumberC(int n){
        c = n;
    }
    public int getNumberC(){
        return c;
    }
}

public class Inheritance {
    public static void main(String[] args) {
      System.out.println("Inheritance");
        // Base ba = new Base();
        // ba.setNumberA(1);
        // int result1 = ba.getNumberA();
        // System.out.println(result1);
        // ba.setNumberB(10);
        // int result2 = ba.getNumberB();
        // System.out.println(result2);

        Derived da = new Derived();
        da.setNumberC(2);
        int rD = da.getNumberC();
        System.out.println(rD);

        da.setNumberA(3);
        int d1 = da.getNumberA();
        System.out.println(d1);
        da.setNumberB(30);
        int d2 = da.getNumberB();
        System.out.println(d2);









    }
}
