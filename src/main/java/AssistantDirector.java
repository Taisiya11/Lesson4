/**
 * Класс расчета премии для помощника директора
 */
public class AssistantDirector extends PremiumCalculation {
    double premium;

    AssistantDirector() {
        super();
    }

    public double expectPremium() {
        premium = 1000000 * 0.2;
        return premium;
    }
}
