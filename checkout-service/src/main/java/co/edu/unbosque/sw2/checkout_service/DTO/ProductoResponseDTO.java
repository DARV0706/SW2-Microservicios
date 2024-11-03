package co.edu.unbosque.sw2.checkout_service.DTO;

import java.util.List;

public class ProductoResponseDTO {
    private List<ProductDTO> products;
    private String instanceId;

    public ProductoResponseDTO(List<ProductDTO> products, String instanceId) {
        this.products = products;
        this.instanceId = instanceId;
    }


    public List<ProductDTO> getProducts() {
        return products;
    }


    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
}
