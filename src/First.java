public class First {
    static int x=200;
    int y=300;

    public static void main(String[] args) {
        First f1 = new First();

        f1.x=777; //if we modify static variable value then
                   // it will modify for all the created objects.


        f1.y=333; //if we modify non-static variable value then
                   // it will modify for that particular object not for remaining.
        First f2=new First();

        System.out.println(x);// 777
        System.out.println(f1.x); // 777
        System.out.println(f1.y); // 333
        System.out.println("--------------------------");

        System.out.println(f2.x); // 777
        System.out.println(f2.y); // 300

    }
}
