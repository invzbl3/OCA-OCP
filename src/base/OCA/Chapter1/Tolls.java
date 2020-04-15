package base.OCA.Chapter1;

/**
 * @author invzbl3 on 15.04.2020.
 * @project OCP-OCA
 */

public class Tolls {
    private static int yesterday = 1;
    int tomorrow = 10;

    public static void main(String[] args) {
        Tolls tolls = new Tolls();
        int today = 20, tomorrow = 40;
        System.out.print(today + tolls.tomorrow + tolls.yesterday);
    }
}