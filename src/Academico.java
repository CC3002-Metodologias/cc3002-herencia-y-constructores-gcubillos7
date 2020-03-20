public class Academico extends Persona{
    protected String paper;
    public Academico (String nombre, String ocupacion, int edad, String paper){
        super(nombre,ocupacion,edad);
        this.paper=paper;
    }
    public void dormir() {
        System.out.println("ZzzZzzZ");
    }
    public String hacerLoSuyo() {
        return "Aprender Zoom y sobrevivir en la cuarentena";
    }
    public String publicarPaper(){
        return this.paper;
    }
}
