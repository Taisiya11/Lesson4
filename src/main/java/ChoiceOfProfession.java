import java.util.Scanner;

/**
 * Класс ввода пункта профессии
 */
public class ChoiceOfProfession {
    Scanner scanner = new Scanner(System.in);

    ChoiceOfProfession() {
    }

    public int chooseProfession() {
        System.out.println("Выберите пункт профессии для расчета премии:" + "\n" + "1. Обычный рабочий" + "\n" + "2. Помощник директора" + "\n" + "3. Директор");
        return scanner.nextInt();
    }
}
