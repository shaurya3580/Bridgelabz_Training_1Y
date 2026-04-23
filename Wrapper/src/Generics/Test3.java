package Generics;

public class Test3<A,B> {
    private A a;
    private B b;
    public Test3(B b,A a){
        this.b=b;
        this.a=a;

    }
    public A getA(){
        return a;
    }
    public B getB(){
        return b;
    }

    public static void main(String[] args) {
        Test3<Integer,String> a=new Test3("Name", "5");
        int z = a.getA();
        String y = a.getB();
        System.out.println("z:- " +z);
        System.out.println("y:-  " +y);
    }

}
