//Este ejercicio esta hecho para mejorar el encapsulacion

public class App {
    public static void main(String[] args) throws Exception {

        CuentaSeguro cuentaSeguro = new CuentaSeguro("020406", 20);
        Vehiculo vehiculo = new Vehiculo("PEDROCAR", 160);

        System.out.println(cuentaSeguro.toString());

        System.out.println(vehiculo.getVelocidad());
        vehiculo.acelerar(200);
        System.out.println(vehiculo.getVelocidad());
        vehiculo.frenar(700);
        System.out.println(vehiculo.getVelocidad());

    }
}
