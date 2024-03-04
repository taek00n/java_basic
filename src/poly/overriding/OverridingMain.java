package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("child => child ");
        System.out.println("value => " + child.value);
        child.method();

        Parent parent = new Parent();
        System.out.println("parent => parent ");
        System.out.println("value => " + parent.value);
        parent.method();

        Parent poly = new Child();
        System.out.println("parent => Child ");
        System.out.println("value => " + poly.value);
        poly.method();
    }
}
