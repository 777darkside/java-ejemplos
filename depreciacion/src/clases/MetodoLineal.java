package clases;

import interfaces.MetodosDepreciacion;

public class MetodoLineal extends Depreciacion implements MetodosDepreciacion {

    public MetodoLineal(float precioCompra, float valorRescate, float aniosVida) {
        super(precioCompra, valorRescate, aniosVida);
    }

    @Override
    public void setValorDepreciable() {
        valorDepreciable = precioCompra - valorRescate;
    }

    @Override
    public float getValorDepreciable() {
        return valorDepreciable;
    }

    @Override
    public float depreciacionAnual() {
        return valorDepreciable / aniosVida;
    }
}
