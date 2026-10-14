package icc.pap.u01;
//record para guardar datos que no cambian
// Mejor cuando los datos no vayan a cambiar, en caso de cambio ocupar getter y setters
// Ya tiene su propio to string
public record Sensor(
    String id,
    String ubicacion){
    }
    
