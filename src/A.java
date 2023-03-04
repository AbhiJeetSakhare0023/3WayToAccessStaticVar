public class A {
    static int i=100;
    String s="java";
}
class A2
{
    public static void main(String[] args) {
        System.out.println(A.i); // 100
        A a = new A();
        System.out.println(a.s); // java
    }
}
