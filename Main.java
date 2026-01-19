public class Main {
    public static void main(String[] args) {
        BookingKendaraan booking = new BookingKendaraan(new MotorTarif());

        System.out.println("--- Pemesanan 1 ---");
        booking.pesan(10.0);

        System.out.println("--- Pemesanan 2 ---");
        booking.setStrategyTarif(new MobilTarif());
        booking.pesan(10.0);

        System.out.println("--- Pemesanan 3: Mobil Listrik ---");
        booking.setStrategyTarif(new MobilListrikTarif());
        booking.pesan(10.0);

        System.out.println("--- Skenario: User Berubah Pikiran ---");
        booking.setStrategyTarif(new MotorTarif());
        booking.pesan(5.0);

        System.out.println("User berubah pikiran...");
        System.out.println();

        booking.setStrategyTarif(new MobilTarif());
        booking.pesan(5.0);
    }
}
