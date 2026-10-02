package act3_ejercicio3_personal_rrhh;

import java.time.Year;

public class enRelacionDeDependencia extends PERSONAL {
    
    //ATRIBUTO
    private double sueldoBasico;
    
    //CONSTRUCTOR VACIO
    public enRelacionDeDependencia(){
    }
    
    //CONSTRUCTOR PARAMETRIZADO
    public enRelacionDeDependencia(String nombre, String apellido, int dni, int anioIngreso, double sueldoBasico){
        super(nombre, apellido, dni, anioIngreso);
        this.sueldoBasico = sueldoBasico;
    }
    
    //GETTER
    public double getSueldoBasico(){
        return sueldoBasico;
    }
    
    //SETTER
    public void setSueldoBasico(double sueldoBasico){
        this.sueldoBasico = sueldoBasico;
    }
    
    //CALCULAR AÑO DE ANTIGUEDAD
    private int calcularAntiguedad(){
        int anioActual = Year.now().getValue();
        
        return anioActual - getAnioIngreso();
    }
    
    //DETERMINAR PORCENTAJE DE ADICIONAL
    private double obtenerPorcentajeAdicional(){
        int antiguedad = calcularAntiguedad();
        
        if (antiguedad < 2){
            return 0.00;
        }else{
            if(antiguedad <= 3){
                return 0.06;
            }else{
                if(antiguedad <= 7){
                    return 0.11;
                }else{
                    if(antiguedad <= 15){
                        return 0.16;
                    }else{
                        return 0.23;
                    }
                }
            }
        }
    }
    
    //IMPLEMENTACION DEL METO ABSTRACTO
    @Override
    public double calcularSueldo(){
        double porcentaje = obtenerPorcentajeAdicional();
        
        return sueldoBasico + (sueldoBasico * porcentaje);
    }
    
    //SOBREECRIBIR IMPRIMIR()
    @Override
    public void imprimir(){
        super.imprimir();
        
        System.out.println("Tipo: Relacion de dependencia");
        System.out.println("Sueldo basico: $" + calcularSueldo());
    }

}