package co.edu.unbosque.sw2.products_service.Controller;

import co.edu.unbosque.sw2.products_service.DTO.ProductoDTO;
import co.edu.unbosque.sw2.products_service.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    ProductoService servicio ;

    @GetMapping("/lista")
    List<ProductoDTO> getProductsById(@RequestParam List<Integer>ids) {
        List<ProductoDTO> resultado= new ArrayList<>();
        resultado = servicio.obtenerProducto(ids);
        return resultado;
    }

}
