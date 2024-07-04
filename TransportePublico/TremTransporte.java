package TransportePublico;

class Trem extends Transporte {
    public Trem(int numeroAssentos, int capacidade, double tarifa) {
        super(numeroAssentos, capacidade, tarifa);
    }

    @Override
    public double calcularTarifaTotal() {

        return 0.0;
    }

    @Override
    public void imprimirDetalhes() {

        System.out.println("Detalhes do Ônibus:");

    }
}

class Onibus extends Transporte {

}

class Metro extends Transporte {

}

