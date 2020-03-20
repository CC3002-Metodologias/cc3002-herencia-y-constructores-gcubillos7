public class Estudiante extends Persona {
    public Estudiante(String nombre, String ocupacion, int edad) {
        super(nombre, ocupacion, edad);
    }
    public void dormir(){
        System.out.println("ZzzZzz");
    }
    public void comer() {
        System.out.println("Completos de '500'");
    }
    public String hacerLoSuyo(){
        return "Ver series en cuarentena";
    }
}