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

        productos.add(prod1);
        productos.add(prod2);
        productos.add(prod3);
        productos.add(prod4);
        productos.add(prod5);

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
