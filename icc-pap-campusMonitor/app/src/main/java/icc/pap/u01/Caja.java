package icc.pap.u01;

import java.util.function.Function;

public class Caja<T> {

    // Dato generico
    private final T valor;
    
    public Caja(T valor){
        this.valor = valor;
    }
    //Metodo generico
    //Getter
    public  T obtener(){
        return valor;
    }

    public <R> R mapear(Function<T,R> operacion){
        R resultado = operacion.apply(valor);
        return resultado;
    }
}



