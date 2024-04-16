public class Perro extends Animal{

    private String sonido = "GUAU GUAU";

    public Perro(){
        this.sonido = sonido;
    }

    @Override
    public void hacerSonido(){
        System.out.println(sonido);
    }

}
