import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // приветствие
        System.out.println("Добро пожаловать! Введите кол-во очков, полученных командой в игре: ");
        // ввод
        Scanner scanner = new Scanner(System.in);
        String user_input = scanner.nextLine();
        // проверка ввода на равенство 3
        if (user_input.equals("3")){
            System.out.println("Выигрыш");
        } else if (Objects.equals(user_input, "1")) {
            System.out.println("Ничья");
        } else if (Objects.equals(user_input, "0")) {
            System.out.println("Проигрыш");
        } else {
            System.out.println("Ввод данных не соответствует условиям: 3, 1 или 0");
        }

    }
}