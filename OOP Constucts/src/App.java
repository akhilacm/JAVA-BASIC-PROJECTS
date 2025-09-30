public class App {
    public static void main(String[] args) throws Exception {

        Point p1 = new Point(2, 3);
        Point p2 = new Point(5, 6);
        System.out.println("Distance from origin: " + p1.distance());
        System.out.println("Distance from origin: "+ p1.distance(p2));
    }
}
