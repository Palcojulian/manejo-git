package paquete1;

class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void nombreCompleto(){
        System.out.println(nombre + " " + apellido);
    }
    
}

public class Main {
    public static void main(String[] args) {
        saludo();
        int num1 = 23;
        int num2 = 12;
        System.out.println(sumar(num1, num2));

        Persona[] personas = new Persona[]{

            new Persona("Julian", "Palco"),
            new Persona("Esteban", "Guegue"),
            new Persona("Carlos", "Guegue"),
            new Persona("Pedro", "Molina")
        };

        for (Persona p : personas){
            p.nombreCompleto();
        }

    }
    
    public static void saludo(){
        System.out.println("Hola Mundo desde la funcion");
    }
    
    private static  int sumar(int a, int b){
        return a + b;
    }   
}

