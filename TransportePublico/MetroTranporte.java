package TransportePublico;
import TransportePublico.Transporte;

class Metro extends Transporte {
    public Metro(int numeroAssentos, int capacidade, double tarifa) {
        super(numeroAssentos, capacidade, tarifa);
    }

    @Override
    public double calcularTarifaTotal() {

        return 0.0;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Detalhes do Metrô:");

    }
}


