/**
 * Класс анализа введенного пункта профессии и присвоение соответствующей премии
 */
public class ProfessionAnalysis {

    ProfessionAnalysis() {
    }

    public void professionAnalysis() {
        ChoiceOfProfession choiceOfProfession = new ChoiceOfProfession();
        PremiumCalculation premiumCalculation = new PremiumCalculation();
        Worker worker = new Worker();
        AssistantDirector assistantDirector = new AssistantDirector();
        Director director = new Director();
        int profession = choiceOfProfession.chooseProfession();
        if (profession == 1) {
            System.out.println("Премия составляет:" + worker.expectPremium());
        }
        if (profession == 2) {
            System.out.println("Премия составляет:" + assistantDirector.expectPremium());
        }
        if (profession == 3) {
            System.out.println("Премия составляет:" + director.expectPremium());
        }
        if (profession != 1 && profession != 2 && profession != 3) {
            System.out.println("Премия составляет:" + premiumCalculation.expectPremium());
        }
    }
}
