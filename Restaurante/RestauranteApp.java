package Restaurante;

public class RestauranteApp {
        public static void main(String[] args) {
                    Entrada entrada = new Entrada("Salada", 15.0);
                    PratoPrincipal pratoPrincipal = new PratoPrincipal("Tartar de Salmao", 150.0);
                    Sobremesa sobremesa = new Sobremesa("Petit Gâteau", 100.0);

                    System.out.println("Detalhes da Entrada:");
                    entrada.imprimirDetalhes();
                    System.out.println("Valor Total: R$ " + entrada.calcularValorTotal());

                    Desconto descontoCliente = new DescontoClienteFrequente();
                    double valorComDesconto = descontoCliente.aplicarDesconto(pratoPrincipal.calcularValorTotal());
                    System.out.println("Valor do Prato Principal com Desconto: R$ " + valorComDesconto);
                }
            }

