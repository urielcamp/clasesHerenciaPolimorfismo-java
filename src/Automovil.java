public class Automovil extends Vehiculo {

    //Atributos de automovil
    private String marca;


    //constructor heredado

    public Automovil(int velocidad, int anio, String marca){
        super(velocidad, anio);
        this.marca = marca;
    }

}
