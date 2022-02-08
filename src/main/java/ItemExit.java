/**
 * Класс реализации пункта меню "выход"
 */
public class ItemExit extends MenuItemImplementation {
    ItemExit() {
        super();
    }

    @Override
    public void implementsMenuItem() {
        System.out.println("Вы выбрали выход");
    }
}
