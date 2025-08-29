public class CuentaSeguro {
    private String numPoliza;
    private double importe;

    public CuentaSeguro(String numPoliza, double importe) {
        setNumPoliza(numPoliza);
        setImporte(importe);
    }

    public String getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(String numPoliza) {

        if (numPoliza == null || numPoliza.isEmpty()) {
            throw new IllegalArgumentException("El numero de la poliza no puede estar vacio");
        }

        this.numPoliza = numPoliza;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {

        if (importe < 0) {
            throw new IllegalArgumentException("El importe no puede ser negativo");
        }

        this.importe = importe;
    }

    @Override
    public String toString() {
        return String.format("Póliza nº: %s, Importe: %.2f", numPoliza, importe);
    }

}
