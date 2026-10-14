package icc.pap.models;

import java.util.function.Function;

public class Lectura<T> {
        private String idSensor;
        private T valor;
        private String Unidad;


       public Lectura(String idSensor, T valor, String unidad) {
            this.idSensor = idSensor;
            this.valor = valor;
            Unidad = unidad;
        }

        public String getIdSensor() {
            return idSensor;
        }
        public T getValor() {
            return valor;
        }
        public String getUnidad() {
            return Unidad;
        }
        public <R> Lectura<R> transformar(Function<T, R> conversor, String nuevaUnidad){
            if(conversor == null)
                throw new IllegalArgumentException("Esta vacio");
            
            R modificado = conversor.apply(valor);
            
            if(modificado == null)
                throw new IllegalArgumentException("El resultado es nulo"); 
            
            return new Lectura<>(this.idSensor, modificado, nuevaUnidad);
        
        }   

       

        


}
