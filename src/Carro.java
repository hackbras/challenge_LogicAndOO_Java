// Classe Carro
public class Carro {
    private double combustivelNoTanque;
    private double distanciaPercorrida;

    private static final double CONSUMO_POR_KM = 15.0;
    private static final double CAPACIDADE_TANQUE = 50.0;

    // Construtor
    public Carro() {
        this.combustivelNoTanque = 0;
        this.distanciaPercorrida = 0;
    }

    // Método para abastecer o carro
    public void abastecer(double litros) {
        if (litros > 0 && (combustivelNoTanque + litros) <= CAPACIDADE_TANQUE) {
            combustivelNoTanque += litros;
        } else if (combustivelNoTanque + litros > CAPACIDADE_TANQUE) {
            combustivelNoTanque = CAPACIDADE_TANQUE;
        }
    }

    // Método para mover o carro
    public void mover(double distancia) {
        double combustivelNecessario = distancia / CONSUMO_POR_KM;
        if (combustivelNecessario <= combustivelNoTanque) {
            distanciaPercorrida += distancia;
            combustivelNoTanque -= combustivelNecessario;
        } else {
            distanciaPercorrida += combustivelNoTanque * CONSUMO_POR_KM;
            combustivelNoTanque = 0;
        }
    }

    // Método para obter a quantidade de combustível restante
    public double getCombustivelRestante() {
        return combustivelNoTanque;
    }

    // Método para obter a distância total percorrida
    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }
}