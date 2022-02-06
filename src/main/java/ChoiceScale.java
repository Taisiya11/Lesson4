/**
 * Класс конвертации в зависимости от выбранной шкалы
 */
public class ChoiceScale {
    ChoiceScale() {
    }

    public void choiceConvector() {
        EnteringValues enteringValues = new EnteringValues();
        enteringValues.degree();
        enteringValues.scale();
        if (enteringValues.scale.equals("F")) {
            UnitConvector convector = new ConvectorInFahrenheit(enteringValues.degree);
            System.out.println(convector.convector(enteringValues.degree));
        }
        if (enteringValues.scale.equals("C") || enteringValues.scale.equals("С")) {
            UnitConvector convector = new ConvectorInCelsius(enteringValues.degree);
            System.out.println(convector.convector(enteringValues.degree));
        }
    }

}
