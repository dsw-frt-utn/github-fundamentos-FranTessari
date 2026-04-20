package domain;

public class VehiculoCombustible extends Vehiculo {
    private double kilometrosPorLitro;
    private double litrosExtra;

    public VehiculoCombustible(String patente, Marca marca, String modelo, int anio, double capacidadCarga,
                               Sucursal sucursal, double kilometrosPorLitro, double litrosExtra) {
        super(VehiculoTipo.COMBUSTIBLE, patente, marca, modelo, anio, capacidadCarga, sucursal);
        this.kilometrosPorLitro = kilometrosPorLitro;
        this.litrosExtra = litrosExtra;
    }
    
     public double getKilometrosPorLitro() {
        return kilometrosPorLitro;
    }

    public double getLitrosExtra() {
        return litrosExtra;
    }

//    @Override
//    public double calcularConsumo(double kilometros) {
//        double total = kilometros / kilometrosPorLitro;
//        double extra;
//        if (anio <= 2021){
//            extra = (kilometros % 15) * litrosExtra;
//            total = (kilometros / kilometrosPorLitro) + litrosExtra;
//        }
//        return total;
//    }
    
    @Override
public double calcularConsumo(double kilometros) {
   double total = kilometros / kilometrosPorLitro;
    int anioActual = java.time.Year.now().getValue();
    int antiguedad = anioActual - anio;

    if (antiguedad > 5) {
        double tramos = kilometros / 15; 
        double extra = tramos * litrosExtra;
        total += extra;
    } 

    return total;
}
}
