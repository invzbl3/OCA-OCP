package base.OCA.Chapter1;

/**
 * @author invzbl3 on 15.04.2020.
 * @project OCP-OCA
 */

public class Airplane {
    static int start = 2;
    final int end;
    public Airplane(int x) {
        x = 4;
        end = x;
    }
    public void fly(int distance) {
        System.out.print(end-start+" ");
        System.out.print(distance);
    }
    public static void main(String... start) {
        new Airplane(10).fly(5);
    }
}