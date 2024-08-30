
// Classe CarroTeste
public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.abastecer(20);
        carro2.abastecer(30);

        carro1.mover(200);
        carro2.mover(400);

        System.out.println("Carro 1 - Combustível Restante: " + carro1.getCombustivelRestante() + " litros");
        System.out.println("Carro 1 - Distância Percorrida: " + carro1.getDistanciaPercorrida() + " km");

        System.out.println("Carro 2 - Combustível Restante: " + carro2.getCombustivelRestante() + " litros");
        System.out.println("Carro 2 - Distância Percorrida: " + carro2.getDistanciaPercorrida() + " km");
    }
}