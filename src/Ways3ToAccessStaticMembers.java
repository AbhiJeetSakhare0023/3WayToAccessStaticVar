public class Ways3ToAccessStaticMembers {
    static int j=200;
    int x=300;
    public static void main(String[] args) {

        System.out.println(j); // 200 ---> if we want to access static var in static method.best way 1
        System.out.println(B.num); // 200 --> if we want to access static var of another class in
        // particular class of static method

        Ways3ToAccessStaticMembers w1 = new Ways3ToAccessStaticMembers();
        System.out.println(w1.x);// 300 if we want to access non-static var in static

    }

}
class B {
    static int num=500;
}
