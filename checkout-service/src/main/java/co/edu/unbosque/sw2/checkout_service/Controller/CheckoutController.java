package co.edu.unbosque.sw2.checkout_service.Controller;

import co.edu.unbosque.sw2.checkout_service.DTO.CheckoutDTO;
import co.edu.unbosque.sw2.checkout_service.DTO.ProductDTO;
import co.edu.unbosque.sw2.checkout_service.DTO.ProductoResponseDTO;
import co.edu.unbosque.sw2.checkout_service.Feign.ProductoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {

    @Autowired
    private ProductoFeign productoFeign;

    @GetMapping("/inicio")
    public CheckoutDTO inciarCheckout (@RequestParam List<Integer> ids){
        ProductoResponseDTO respuesta = productoFeign.getProductsById(ids);
        List<ProductDTO> products = respuesta.getProducts();

        // Calcular el precio total a partir de los datos de `products-service`
        double totalPrice = products.stream()
                .mapToDouble(ProductDTO::getPrice)
                .sum();

        // Crear la respuesta de checkout
        CheckoutDTO CheckoutDTO = new CheckoutDTO();
        CheckoutDTO.setId(UUID.randomUUID().toString());
        CheckoutDTO.setTotal(totalPrice);
        CheckoutDTO.setMetodoPago(List.of("Credit Card", "PayPal", "PSE", "Efecty"));  // Ejemplo
        CheckoutDTO.setUrl("https://EjemplodeUrl.com/checkout/" + CheckoutDTO.getId());
        CheckoutDTO.setLog("La respuesta se produjo desde el puerto ".concat(respuesta.getInstanceId()));

        return CheckoutDTO;
    }
}
