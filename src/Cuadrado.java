public class Cuadrado extends Figura{

    //Atributos

    private int lado;
    private int area;
    private int perimetro;

    //Constructor

    public Cuadrado(int lado){
        this.lado = lado;
    }

    //metodos polimorficos


    @Override
    public void calcularArea() {
        area = lado * lado;
        System.out.println(area);
    }

    @Override
    public void calcularPerimetro() {
        perimetro = lado * 4;
        System.out.println(perimetro);
    }
}
