public class Main {
    public static void main(String[] args) {
        car car1 = new car("tomtom", "Show", 1900);
        car1.setYear(2342);
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
    }
}
// why this getting error
