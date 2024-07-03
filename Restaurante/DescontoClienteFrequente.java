package Restaurante;

    class DescontoClienteFrequente implements Desconto {
        @Override
        public double aplicarDesconto(double valor) {
            return valor * 0.9; // 10% de desconto
        }
    }

