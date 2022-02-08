/**
 * Класс реализации пункта меню "начать новую игру"
 */
public class RunNewGame extends MenuItemImplementation {
    RunNewGame() {
        super();
    }

    @Override
    public void implementsMenuItem() {
        System.out.println("Вы выбрали начать новую игру");
    }
}
