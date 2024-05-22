// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Opel", "Astra", 2008, 10000, 2000);
        Track track = new Track("Mercedes", "Transporter", 2011, 50000, 6666, 1000);

        car.displayinfo();
        System.out.println();
        track.displayinfo();
        System.out.println();

    }


}