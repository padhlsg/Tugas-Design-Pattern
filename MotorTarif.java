public class MotorTarif implements StrategyTarif {
    private static final double BASE_FARE = 5000;
    private static final double FARE_PER_KM = 2000;

    @Override
    public double hitungTarif(double distanceKm) {
        double totalTarif = BASE_FARE + (distanceKm * FARE_PER_KM);
        return totalTarif;
    }

    @Override
    public String getTipeKendaraan() {
        return "Motor";
    }
}
