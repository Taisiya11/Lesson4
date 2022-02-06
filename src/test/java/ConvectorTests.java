import org.junit.Assert;
import org.junit.Test;
public class ConvectorTests {
 /**
  * Тест, проверяющий корректную конвертацию в из Шкалы Фаренгейта в Цельсия и обратно
  */
 @Test
    public void convector(){
  ConvectorInCelsius convectorInCelsius = new ConvectorInCelsius(34);
  double oneValue= convectorInCelsius.convector(34);
  ConvectorInFahrenheit convectorInFahrenheit = new ConvectorInFahrenheit(34);
  Assert.assertEquals(34,convectorInFahrenheit.convector(oneValue),0.0);
 }
}


