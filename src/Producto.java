public class Producto<N, P> {
    private N nombreProducto;    
    private P precioProducto;

    public Producto(N nombreProducto, P precioProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }   

    public N getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(N nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public P getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(P precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public String toString() {
        return "Nombre del producto = " + nombreProducto + ", Precio = " + precioProducto;
    }
}

