/**
 * Класс, конвертирующий градусы из шкалы Фаренгейта в шкалу Цельсия
 */
public class ConvectorInCelsius extends UnitConvector {
    double value;

    ConvectorInCelsius(double degree) {
        super(degree);
    }

    /**
     * Переоперделенный метод конвертации
     *
     * @param degree градусы по шкале Фаренгейта
     * @return градусы по шкале Цельсия
     */
    @Override
    public double convector(double degree) {
        value = (degree - 32) / (1.8);
        return value;
    }
}
