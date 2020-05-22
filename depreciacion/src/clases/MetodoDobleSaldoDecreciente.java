package clases;

import interfaces.MetodosDepreciacion;

public class MetodoDobleSaldoDecreciente extends Depreciacion implements MetodosDepreciacion {
    private float tasaDepreciacion;

    public MetodoDobleSaldoDecreciente(float precioCompra, float valorRescate, float aniosVida) {
        super(precioCompra, valorRescate, aniosVida);
    }

    public float getTasaDepreciacion() {
        return tasaDepreciacion;
    }

    public void setTasaDepreciacion() {
        tasaDepreciacion = (float) (1 / aniosVida) * 2;
    }
     
    // TODO: entender por qué este método se llama igual que el de la interfaz si es diferente wtf ?!
    public void setValorDepreciable(float valorDepreciableAnioAnt, float depreAnualAnt) {
        valorDepreciable = valorDepreciableAnioAnt - depreAnualAnt;
    }
    
    // TODO: entender este método, aparentemente es inncesesario dado el método de arriba,
    // pero no se puede quitar porque la maestra lo definió en la interfaz? qué putas ?!
    @Override
    public void setValorDepreciable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public float getValorDepreciable() {
        return valorDepreciable;
    }

    @Override
    public float depreciacionAnual() {
        return valorDepreciable * tasaDepreciacion;
    }
}
