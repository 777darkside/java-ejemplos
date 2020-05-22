package clases;

public abstract class Depreciacion {
    protected float precioCompra;
    // Ojo valorDepreciable no tiene getter y setters ya que estan definidos en la interfaz
    protected float valorDepreciable;
    protected float valorRescate;
    protected float aniosVida;

    public Depreciacion(float precioCompra, float valorRescate, float aniosVida) {
        this.precioCompra = precioCompra;
        this.valorRescate = valorRescate;
        this.aniosVida = aniosVida;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public float getValorRescate() {
        return valorRescate;
    }

    public void setValorRescate(float valorRescate) {
        this.valorRescate = valorRescate;
    }

    public float getAniosVida() {
        return aniosVida;
    }

    public void setAniosVida(float aniosVida) {
        this.aniosVida = aniosVida;
    }

    abstract public float depreciacionAnual();
}
