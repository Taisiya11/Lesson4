/**
 * Класс, конвертирующий градусы из шкалы Цельсия в шкалу Фаренгейта
 */
public class ConvectorInFahrenheit extends UnitConvector{
    double value;

    ConvectorInFahrenheit(double degree) {
        super(degree);
    }
    /**
     * Переоперделенный метод конвертации
     * @param degree градусы по шкале Цельсия
     * @return градусы по шкале Фаренгейта
     */
    @Override
    public double convector(double degree){
        value= degree*1.8+32;
        return value;
    }
}

