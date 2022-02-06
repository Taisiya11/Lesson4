/**
 * Класс расчета премии для обычного рабочего
 */
public class Worker extends PremiumCalculation {
    double premium;

    Worker() {
        super();
    }

    public double expectPremium() {
        premium = 1000000 * 0.1;
        return premium;
    }

}
