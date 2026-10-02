package act3_ejercicio3_personal_rrhh;

public class contratado extends PERSONAL{
    
    private double honorarios;
    private int clientesCaptados;
    
    //CONSTRUCTOR VACIO
    public contratado(){
    }
    
    //CONSTRUCTOR PARAMETRIZADO
    public contratado(String nombre, String apellido, int dni, int anioIngreso, double honorarios, int clientesCaptados){
        super(nombre, apellido, dni, anioIngreso);
        this.honorarios = honorarios;
        this.clientesCaptados = clientesCaptados;
    }
    
    //GETTER HONORARIOS
    public double getHonorarios(){
        return honorarios;
    }
    
    //SETTER HONORARIOS
    public void setHonorarios(double honorarios){
        this.honorarios = honorarios;
    }
    
    //GETTER CLIENTES CAPTADOS
    public int getClientesCaptados(){
        return clientesCaptados;
    }
    
    //SETTER CLIENTES CAPTADOS
    public void setClientesCaptados(int clientesCaptados){
        this.clientesCaptados = clientesCaptados;
    }
       
    //DETERMINAR PLUS
    private double obtenerPlusClientes(){
        if(clientesCaptados <= 2){
            return 300;
        }else{
            if(clientesCaptados <= 7){
                return 1000;
            }else{
                if(clientesCaptados <= 15){
                    return 2000;
                }else{
                    if(clientesCaptados <= 20){
                        return 3500;
                    }else{
                        return 5000;
                    }
                }
            }
        }
    }
    
    //IMPLEMENTACION DEL METO ABSTRACTO
    @Override
    public double calcularSueldo(){
        return honorarios + obtenerPlusClientes();
    }
    
    //SOBREECRIBIR IMPRIMIR()
    @Override
    public void imprimir(){
        super.imprimir();
        
        System.out.println("Tipo: Contratado");
        System.out.println("Honorarios: $" + honorarios);
        System.out.println("Clientes captados: " + clientesCaptados);
        System.out.println("Sueldo final: $ "+ calcularSueldo());
    }

}