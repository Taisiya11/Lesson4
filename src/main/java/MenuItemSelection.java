import java.util.Scanner;
/**
 * Класс ввода пункта меню игры
 */
public class MenuItemSelection {
    Scanner scanner = new Scanner(System.in);

    MenuItemSelection() {
    }
    public int chooseMenuItem() {
        System.out.println("Введите пункт меню:" + "\n" + "1. Начать новую игру" + "\n" + "2. Продолжить" + "\n" + "3. Настройки"+ "\n" + "4. Выйти");
        return scanner.nextInt();
    }
}

