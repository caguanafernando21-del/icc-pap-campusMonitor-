 package icc.pap.u01;

public class TiposDemo {
    public static void main(String[] args){
        
        //Caja<String> definir que datos guarda en este caso solo string
        Caja<String> lugar = new Caja<>("lab6");
        //Caja<Integer> definir que datos guarda en este caso solo Numeros
        Caja<Integer> limite = new Caja<>( 2147483647);
        // Instanciar sensor para mandar los datos
        Caja<Sensor> dispositivo = new Caja<>(new Sensor("s01",  lugar.obtener()));
    System.out.println(lugar.obtener());
    System.out.println(limite.obtener());
    
    System.out.println(dispositivo);
    System.out.println(dispositivo.obtener());
    System.out.println(dispositivo.obtener().id() + "-" + dispositivo.obtener().ubicacion());
}
}
