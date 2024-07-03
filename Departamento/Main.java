package Departamento;

    public class Main {
        public static void main(String[] args) {

            Funcionario gerente = new Gerente("João", 35, 8000.0, " Tecnologia e inovação");
            Funcionario analista = new Analista("Artur", 30, 5000.0, "Processos");
            Funcionario desenvolvedor1 = new Desenvolvedor1("Romulo", 32, 6000.0, "Java");
            Funcionario desenvolvedor2 = new Desenvolvedor2("Neto", 31, 6000.0, "JavaScript");
            Funcionario desenvolvedor = new Desenvolvedor("Maria", 25, 6000.0, "TypeScript");


            System.out.println("Bônus anual do Gerente: " + gerente.calcularBonusAnual() + "💰💵");
            System.out.println("Bônus anual do Desenvolvedor: " + desenvolvedor.calcularBonusAnual()+ "💰💵");
            System.out.println("Bônus anual do Desenvolvedor: " + desenvolvedor1.calcularBonusAnual()+ "💰💵");
            System.out.println("Bônus anual do Desenvolvedor: " + desenvolvedor2.calcularBonusAnual()+ "💰💵");
            System.out.println("Bônus anual do Analista: " + analista.calcularBonusAnual()+ "💰💵");


            gerente.imprimirDetalhes();
            desenvolvedor.imprimirDetalhes();
            analista.imprimirDetalhes();
            desenvolvedor1.imprimirDetalhes();
            desenvolvedor2.imprimirDetalhes();
        }
    }

