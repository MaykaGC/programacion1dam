public class Persona {
    public String nombre;
   private int edad;
    double estatura;

   //constructor para todos los atributos
    Persona (String nombre, int edad, double estatura){
        setNombre (nombre);
        this.edad = edad;
        this.estatura= estatura;
    }
    //constructor para los datos obligatorios
    Persona (String nombre, int edad){
        this.nombre= nombre;
        this.edad= edad;
    }
    void mostrarDatos (){
        System.out.println(nombre + " " + edad + " " + estatura);

    }
    void aumentarEdad(int edad){


    }



}
