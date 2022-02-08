/**
 * Класс анализа введенного значения
 */
public class MenuAnalysis {
    MenuAnalysis() {
    }

    /**
     * анализирует введенный пункт меню и вызывает соответвующий класс с его реализацией
     */
    public void parsesEnteredValue() {
        MenuItemSelection menuItemSelection = new MenuItemSelection();
        MenuItemImplementation menuItemImplementation = new MenuItemImplementation();
        MenuItemImplementation runNewGame = new RunNewGame();
        MenuItemImplementation itemContinue = new ItemContinue();
        MenuItemImplementation itemSettings = new ItemSettings();
        MenuItemImplementation itemExit = new ItemExit();
        int menuItem = menuItemSelection.chooseMenuItem();
        if (menuItem == 1) {
            runNewGame.implementsMenuItem();
        }
        if (menuItem == 2) {
            itemContinue.implementsMenuItem();
        }
        if (menuItem == 3) {
            itemSettings.implementsMenuItem();
        }
        if (menuItem == 4) {
            itemExit.implementsMenuItem();
        }
        if (menuItem != 1 && menuItem != 2 && menuItem != 3&& menuItem != 4) {
            menuItemImplementation.implementsMenuItem();
        }
    }
}
