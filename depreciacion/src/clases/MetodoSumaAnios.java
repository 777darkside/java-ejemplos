package clases;

import interfaces.MetodosDepreciacion;

public class MetodoSumaAnios extends Depreciacion implements MetodosDepreciacion {
    private float tasaDepreciacion;
    private float gastoXDepreciacion;
    private float depreciacionAcumulada;
    private float valorInicialLibros;
    private float valorFinalLibros;

    public MetodoSumaAnios(float precioCompra, float valorRescate, float aniosVida) {
        super(precioCompra, valorRescate, aniosVida);
    }

    @Override
    public float depreciacionAnual() {
        return gastoXDepreciacion;
    }

    @Override
    public void setValorDepreciable() {
        valorDepreciable = precioCompra - valorRescate;
    }

    @Override
    public float getValorDepreciable() {
        return valorDepreciable;
    }

    public float getTasaDepreciacion() {
        return tasaDepreciacion;
    }
 
    public void setTasaDepreciacion(int anioDepreciacion) {
        float x = ((int) aniosVida) - anioDepreciacion;
        tasaDepreciacion = (float) (x / 15.0);
    }

    public float getGastoXDepreciacion() {
        return gastoXDepreciacion;
    }

    public void setGastoXDepreciacion() {
        this.gastoXDepreciacion = valorDepreciable * tasaDepreciacion;
    }

    public float getDepreciacionAcumulada() {
        return depreciacionAcumulada;
    }

    public void setDepreciacionAcumulada(float depreciacionAnioAnterior) {
        depreciacionAcumulada = depreciacionAcumulada + depreciacionAnioAnterior;
    }

    public float getValorInicialLibros() {
        return valorInicialLibros;
    }

    public void setValorInicialLibros(float valorFinalLibrosAnioAnterior) {
        valorInicialLibros = valorFinalLibrosAnioAnterior;
    }
    
    public void setValorInicialLibros() {
        valorInicialLibros = precioCompra;
    }

    public float getValorFinalLibros() {
        return valorFinalLibros;
    }

    public void setValorFinalLibros() {
        valorFinalLibros = precioCompra - depreciacionAcumulada;
    }
}
