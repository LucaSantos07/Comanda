package entitis;

import java.util.List;

public class Item {

    private String name;
    private Integer quantity;
    private Double price;
    private Produto produto;

    public Item() {

    }

    public Item(String name, Integer quantity, Double price, Produto produto) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.produto = produto;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double SubTotal() {

        return price * quantity;
    }

    @Override
    public String toString() {
        return "Item: " + produto.getName()
                + " quantity: " + quantity
                + " Preço: R$ " + String.format("%.2f", price)
                + " SubTotal: R$ "
                + String.format("%.2f", SubTotal());
    }

}
