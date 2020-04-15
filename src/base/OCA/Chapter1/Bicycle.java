package base.OCA.Chapter1;

/**
 * @author invzbl3 on 15.04.2020.
 * @project OCP-OCA
 */

public class Bicycle {
    String color = "red";
    private void printColor(String color) {
        color = "purple";
        System.out.print(color);
    }
    public static void main(String[] rider) {
        new Bicycle().printColor("blue");
    }
}
