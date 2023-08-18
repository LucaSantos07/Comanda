package comanda;

import entitis.Cliente;
import entitis.Item;
import entitis.Pedido;
import entitis.Produto;
import entitis.enums.StatusPedido;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Comanda {

    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Entre com os Dados do Ciente: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Nascimento (DD/MM/YYYY): ");
        Date brithDate = sdf.parse(sc.next());
        
        Cliente cliente = new Cliente(name, email, brithDate);
        
        System.out.print("\nQual Status do pedido? ");
        StatusPedido Status = StatusPedido.valueOf(sc.next());
    
        Pedido pedido = new Pedido(new Date(), Status, cliente);
        sc.nextLine();
        System.out.print("Quantos itens deseja comprar? ");
        Integer n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("\nEntre com o " + (i+1) + " Item:");
            System.out.print("Nome: ");
            sc.nextLine();
            String ProdutoNome = sc.nextLine();
            System.out.print("Preço: R$ ");
            Double Price = sc.nextDouble();
            
            Produto produto =  new Produto(ProdutoNome, Price);
            
            System.out.print("Qual a quantidade? ");
            int quant = sc.nextInt();
            
            Item item = new Item(name, quant, Price, produto);
            
            
            pedido.addItem(item);
            
            
        }
        
        System.out.println();
        System.out.println("PEDIDOOOO:");
        System.out.println(pedido);
        
        sc.close();
    }
    
}
