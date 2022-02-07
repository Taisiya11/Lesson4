/**
 * Класс реализации пункта меню "настройки"
 */
public class ItemSettings extends MenuItemImplementation{
    ItemSettings(){
        super();
    }
    public void implementsMenuItem(){
        System.out.println("Вы выбрали настройки");
    }
}
