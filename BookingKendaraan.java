public class BookingKendaraan {
    private StrategyTarif strategyTarif;

    public BookingKendaraan(StrategyTarif strategyTarif) {
        this.strategyTarif = strategyTarif;
    }

    public void setStrategyTarif(StrategyTarif strategyTarif) {
        this.strategyTarif = strategyTarif;
    }

    public void pesan(double distanceKm) {
        double totalTarif = strategyTarif.hitungTarif(distanceKm);
        System.out.println("=== Booking Confirmed ===");
        System.out.println("Kendaraan: " + strategyTarif.getTipeKendaraan());
        System.out.println("Jarak: " + distanceKm + " km");
        System.out.println("Total Tarif: Rp " + totalTarif);
        System.out.println();
    }
}
