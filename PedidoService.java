package lab;

public class PedidoService implements Servico {

    @Override
    public String executar(String parametro) {

        int id = Integer.parseInt(parametro);

        switch (id) {

            case 1:
                return "Pedido 1 - Em processamento";

            case 2:
                return "Pedido 2 - Enviado";

            case 3:
                return "Pedido 3 - Entregue";

            default:
                return "Pedido não encontrado";
        }
    }
}