/**
 * Класс расчета премии для директора
 */
public class Director extends PremiumCalculation {
    double premium;

    Director() {
        super();
    }

    public double expectPremium() {
        premium = 1000000 * 0.5;
        return premium;
    }
}
