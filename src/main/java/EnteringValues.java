import java.util.Scanner;
/**
 * Класс ввода значений для конвертации
 */
public class EnteringValues {
    int degree;
    String scale;

    EnteringValues() {
    }
    public int degree() {
        Scanner scannerDegree = new Scanner(System.in);
        System.out.println("Введите градусы для конвертации:");
        degree = scannerDegree.nextInt();
        return degree;
    }
        public String scale() {
        Scanner scannerScale = new Scanner(System.in);
        System.out.println("Введите F для конвертации в шкалу Фаренгейта или C для конвертации в шкалу Цельсия:");
        scale = scannerScale.nextLine();
        return scale;
    }
}
