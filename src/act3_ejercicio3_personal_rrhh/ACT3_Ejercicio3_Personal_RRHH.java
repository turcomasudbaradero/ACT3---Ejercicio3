package act3_ejercicio3_personal_rrhh;

public class ACT3_Ejercicio3_Personal_RRHH {

    public static void main(String[] args) {
        
        //CREAR UN VECTOR
        PERSONAL[] personal = new PERSONAL[4];
        
        //CONSTRUCTOR PARAMETRIZADO PARA JUAN
        personal[0] = new enRelacionDeDependencia("Juan", "Gomez", 30999888, 2014, 23000);
        
        //CONSTRUCTOR PARAMETRIZADO PARA MARIA
        personal[1] = new contratado("Maria", "Suarez", 24555666, 2017, 1600, 5);
        
        //CONSTRUCTOR VACIO + SETTERS PARA PABLO
        contratado pablo = new contratado();
        
        pablo.setNombre("Pablo");
        pablo.setApellido("Aguilar");
        pablo.setDni(30777333);
        pablo.setAnioIngreso(2019);
        pablo.setHonorarios(16000);
        pablo.setClientesCaptados(15);
                
        personal[2] = pablo;
        
        
        //CONSTRUCTOR VACIO + SETTERS PARA PABLO
        enRelacionDeDependencia sofia = new enRelacionDeDependencia();

        sofia.setNombre("Sofia");
        sofia.setApellido("Gutierrez");
        sofia.setDni(31666666);
        sofia.setAnioIngreso(2020);
        sofia.setSueldoBasico(25000);
        
        personal[3] = sofia;
        
        //IMPRIMIR LISTADO
        imprimirListadoPersonal(personal);
        
        //MAYOR SUELDO
        mayorSueldo(personal);
        
    }
    
        //METODO PARA imprimirListadoPersonal()
        public static void imprimirListadoPersonal(PERSONAL[] personal){
            System.out.println();
            System.out.println("==== LISTADO DE PERSONAL ====");
            
            for(int i = 0; i < personal.length; i++){
                System.out.println();
                personal[i].imprimir();
            }
        }
        
        //METODO mayorSueldo()
        public static void mayorSueldo(PERSONAL[] personal){
            
            if(personal.length == 0){
                System.out.println("No hay personal registrado.");
                return;
            }
            
            PERSONAL mayor = personal[0];
            
            for(int i = 1; i < personal.length; i++){
                if(personal[i].calcularSueldo() > mayor.calcularSueldo()){
                    mayor = personal[i];
                }
            }
            
        System.out.println();
        System.out.println("==== MAYOR SUELDO ====");
        System.out.println("Nombre: " + mayor.getNombre());
        System.out.println("Apellido: " + mayor.getApellido());
        System.out.println("Sueldo: $" + mayor.calcularSueldo());
            
        }
    
}