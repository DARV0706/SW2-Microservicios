package co.edu.unbosque.sw2.products_service.DTO;

import java.util.List;

public class ProductoResponseDTO {
    private List<ProductoDTO> products;
    private String instanceId;

    public ProductoResponseDTO(List<ProductoDTO> products, String instanceId) {
        this.products = products;
        this.instanceId = instanceId;
    }


    public List<ProductoDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductoDTO> products) {
        this.products = products;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
}
