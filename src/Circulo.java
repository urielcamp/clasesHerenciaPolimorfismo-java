public class Circulo extends Figura{

    //atributo
    private double radio;
    private static double PI = 3.1415;
    private double area;
    private double perimetro;



    //Constructor
    public Circulo(double radio){
        this.radio = radio;
    }


    //Metodo polimorfico

    @Override
    public void calcularArea(){
        area = (radio * radio) * PI;
        System.out.println(area);
    }

    @Override
    public void calcularPerimetro(){
        perimetro = 2 * PI * radio;
        System.out.println(perimetro);
    }

}
