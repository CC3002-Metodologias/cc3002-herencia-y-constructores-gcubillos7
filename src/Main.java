public class Main {

    public static void main(String[] args) {
        Persona Persona_1= new Estudiante("Juan","Estudiante",25);
        Persona Persona_2=new Academico("Jose","Academico",50,"Papar ultra-mega-cientifico");
        Persona Persona_3=new Persona("Pedro","ocupacion no academica",40);
        System.out.println("Dia normal de persona 1");
        Persona_1.comer();
        System.out.println(Persona_1.hacerLoSuyo());
        Persona_1.dormir();
        System.out.println("\n"+"Dia normal de persona 2");
        Persona_1.comer();
        System.out.println(Persona_2.hacerLoSuyo());
        System.out.println(Persona_2.publicarPaper());
        Persona_2.dormir();
        System.out.println("\n"+"Dia normal de persona 3");
        Persona_3.comer();
        System.out.println(Persona_1.hacerLoSuyo());
        Persona_3.dormir();

    }
}
