public interface StrategyTarif {
    public double hitungTarif(int jarak);
    public double getTipeKendaraan();
}

// Implementasi untuk Motor 
public class MotorTarif implements StrategyTarif {
 private static final double BASE_FARE = 5000;
 private static final double FARE_PER_KM = 2000;

 @Override public double hitungTarif(double distanceKm) {
 // TODO: Implementasikan rumus:
 // tarif dasar + total jumlah tarif per KM

 double totalTarif = BASE_FARE + (distanceKm * FARE_PER_KM);
    
    return totalTarif;
 }
 @Override public String getTipeKendaraan()
 { 
    return "Motor";
 }
 } 




public class DesignPattern {
    public static void main(String[] args) {
        
    }
}