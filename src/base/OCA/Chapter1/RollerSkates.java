package base.OCA.Chapter1;

/**
 * @author invzbl3 on 15.04.2020.
 * @project OCP-OCA
 */

public class RollerSkates {
    static int wheels = 1;
    int tracks = 5;
    public static void main(String[] arguments) {
        RollerSkates s = new RollerSkates();
        int feet=4, tracks = 15;
        System.out.print(feet + tracks + s.wheels);
    }
}