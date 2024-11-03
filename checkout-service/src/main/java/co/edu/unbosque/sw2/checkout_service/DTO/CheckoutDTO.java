package co.edu.unbosque.sw2.checkout_service.DTO;

import java.util.List;

public class CheckoutDTO {
    private String id;
    private double total;
    private List<String> metodoPago;
    private String url, log;

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<String> getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(List<String> metodoPago) {
        this.metodoPago = metodoPago;
    }
}
