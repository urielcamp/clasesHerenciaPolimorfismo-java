public class Persona {

    private Direccion direccion;

    public Persona(){
        this.direccion = new Direccion();
        direccion.setBarrio("pb");
        direccion.setCiudad("Montevideo");
    }

    public String getCiudad(){
        return direccion.getCiudad();
    }
    public String getBarrio(){
        return direccion.getBarrio();
    }


}
