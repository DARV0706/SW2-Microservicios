package co.edu.unbosque.sw2.products_service.Service;

import co.edu.unbosque.sw2.products_service.DTO.ProductoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {
    private List<ProductoDTO> productos = new ArrayList<>();

    public void crearLista(){
        ProductoDTO prod1 = new ProductoDTO(1, "Pescado", 10);
        ProductoDTO prod2 = new ProductoDTO(2, "Salchicha", 6);
        ProductoDTO prod3 = new ProductoDTO(3, "Play 5", 2000);
        ProductoDTO prod4 = new ProductoDTO(4, "Coca-Cola", 3);
        ProductoDTO prod5 = new ProductoDTO(5, "Atún", 35);
        ProductoDTO prod6 = new ProductoDTO(6, "Arroz", 2);
        ProductoDTO prod7 = new ProductoDTO(7, "Pollo", 15);
        ProductoDTO prod8 = new ProductoDTO(8, "Laptop", 1500);
        ProductoDTO prod9 = new ProductoDTO(9, "Smartphone", 700);
        ProductoDTO prod10 = new ProductoDTO(10, "Cerveza", 5);
        ProductoDTO prod11 = new ProductoDTO(11, "Leche", 4);
        ProductoDTO prod12 = new ProductoDTO(12, "Galletas", 3);
        ProductoDTO prod13 = new ProductoDTO(13, "Pan", 1);
        ProductoDTO prod14 = new ProductoDTO(14, "Jabón", 2);
        ProductoDTO prod15 = new ProductoDTO(15, "Detergente", 10);
        ProductoDTO prod16 = new ProductoDTO(16, "Shampoo", 8);
        ProductoDTO prod17 = new ProductoDTO(17, "Cereal", 6);
        ProductoDTO prod18 = new ProductoDTO(18, "Huevos", 3);
        ProductoDTO prod19 = new ProductoDTO(19, "Mantequilla", 4);
        ProductoDTO prod20 = new ProductoDTO(20, "Queso", 5);

        productos.add(prod1);
        productos.add(prod2);
        productos.add(prod3);
        productos.add(prod4);
        productos.add(prod5);
        productos.add(prod6);
        productos.add(prod7);
        productos.add(prod8);
        productos.add(prod9);
        productos.add(prod10);
        productos.add(prod11);
        productos.add(prod12);
        productos.add(prod13);
        productos.add(prod14);
        productos.add(prod15);
        productos.add(prod16);
        productos.add(prod17);
        productos.add(prod18);
        productos.add(prod19);
        productos.add(prod20);
    }

    public List<ProductoDTO> obtenerProducto(List<Integer> ids) {
        crearLista();
        List<ProductoDTO> resultado = new ArrayList<>();
        for (Integer id : ids) {
            productos.stream()
                    .filter(producto -> producto.getId() == id)
                    .findFirst()
                    .ifPresent(resultado::add);
        }
        return resultado;
    }



}
