import org.junit.Assert;
import org.junit.Test;

/**
 * Тест расчета премии
 */
public class PremiumTests {
    @Test
    public void premium() {
        Worker worker = new Worker();
        AssistantDirector assistantDirector = new AssistantDirector();
        Director director = new Director();
        Assert.assertEquals(100000, worker.expectPremium(), 0.0);
        Assert.assertEquals(200000, assistantDirector.expectPremium(), 0.0);
        Assert.assertEquals(500000, director.expectPremium(), 0.0);
    }
}
