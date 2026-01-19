public class MobilListrikTarif implements StrategyTarif {
    private static final double BASE_FARE = 12000;
    private static final double FARE_PER_KM = 3000;

    @Override
    public double hitungTarif(double distanceKm) {
        double totalTarif = BASE_FARE + (distanceKm * FARE_PER_KM);
        return totalTarif;
    }

    @Override
    public String getTipeKendaraan() {
        return "Mobil Listrik";
    }
}
