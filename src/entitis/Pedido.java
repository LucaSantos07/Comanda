package entitis;

import entitis.enums.StatusPedido;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date data;
    private StatusPedido Status;

    private Cliente cliente;

    private List<Item> itens = new ArrayList();

    public Pedido() {

    }

    public Pedido(Date data, StatusPedido Status, Cliente cliente) {
        this.data = data;
        this.Status = Status;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public StatusPedido getStatus() {
        return Status;
    }

    public void setStatus(StatusPedido Status) {
        this.Status = Status;
    }

    public List<Item> getItem() {
        return itens;
    }

    public void addItem(Item item) {
        itens.add(item);
    }

    public void removeItem(Item item) {
        itens.remove(item);
    }

    public double total() {

        double soma = 0.0;

        for (Item item : itens) {

            soma += item.SubTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        
        sb.append("Data do Pedido: ");
        sb.append(sdf.format(data) + "\n");
        sb.append("Status: ");
        sb.append(Status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        
        sb.append("\nItens: "+ "\n");
        for (Item item : itens) {
            
            sb.append(item + "\n");
            
        }
        
        sb.append("Total: ");
        sb.append(String.format("%.2f", total()));
        
        
        
        
        return sb.toString();
    }
    
    

}
