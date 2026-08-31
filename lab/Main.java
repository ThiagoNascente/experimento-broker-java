package lab;

public class Main {

    public static void main(String[] args) {

        // 1. Criar o Broker
        Broker broker = new Broker();

        // 2. Registrar os serviços

        System.out.println("Exercicio 1");

        broker.registrar(
            "produto",
            new ProdutoService()
        );

        broker.registrar(
            "consumidor",
            new ConsumidorService()
        );

        broker.registrar(
            "pedido",
            new PedidoService()
        );

        // 3. Criar o Cliente
        Cliente cliente = new Cliente(broker);

        // 4. Fazer solicitações do exercicio 1
        cliente.consultarProduto(2);
        cliente.consultarConsumidor(1);

        System.out.println("\nExercicio 2");
        // 5. Fazer solicitação do exercicio 2
        cliente.consultarPedido(3);

        System.out.println("\nExercicio 3");
        //5. Teste que da errado (exercicio 3)
        String resposta = broker.solicitar("pagamento", "1");
        System.out.println(resposta);
    }
}