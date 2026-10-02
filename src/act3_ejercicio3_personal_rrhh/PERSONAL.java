package act3_ejercicio3_personal_rrhh;

public abstract class PERSONAL {
    
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private int dni;
    private int anioIngreso;
    
    //CONSTRUCTOR VACIO
    public PERSONAL(){
        
    }
    
    //CONSTRUCTOR PARAMETRIZADO
    public PERSONAL(String nombre, String apellido, int dni, int anioIngreso){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.anioIngreso = anioIngreso;
    }
    
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public int getDni(){
        return dni;
    }
    
    public int getAnioIngreso(){
        return anioIngreso;
    }
    
    
    //SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setDni(int dni){
        this.dni = dni;
    }
    
    public void setAnioIngreso(int anioIngreso){
        this.anioIngreso = anioIngreso;
    }
    
    //METODO PARA IMPRIMIR POR PANTALLA
    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Anio de ingreso: " + anioIngreso);
    }
    
    //METDO ABSTRACTO
    public abstract double calcularSueldo();

}