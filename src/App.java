public class App {
    public static void main(String[] args) throws Exception {
        Producto<String, Integer> producto = new Producto<>("Colores", 12);
        System.out.println("Nombre del producto: " + producto.getNombreProducto());
        System.out.println("Precio del producto: " + producto.getPrecioProducto());

        producto.setNombreProducto("Lapiz");
        producto.setPrecioProducto(5);

        System.out.println(producto);
    }
}
