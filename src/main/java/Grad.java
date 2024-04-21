import java.util.Scanner;
public class Grad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветствую Вас на моём кладбище");
        while (true) {
            System.out.println("Что вы хотите сделать?:");
            System.out.println("1. Положить цветы на могилу");
            System.out.println("2. Купить гроб");
            System.out.println("3. Похоронить человека");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Byket();
                    break;
                case 2:
                    Grob();
                    break;
                case 3:
                    Pohoronu();
                    break;
                default:
                    System.out.println("Извините, но такого выбора нет в списке");
            }
        }
    }
    public static void Byket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой Вы хотите положить на могилу?:");
        System.out.println("1. Цветы, которые Вы принесли с собой");
        System.out.println("2. Цветы купленные у нас");
        System.out.println("3. Стащить цветы с чужой могилы");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Вы положили цветы, которые принесли с собой");
                break;
            case 2:
                System.out.println("Вы приобрели цветы у нас и положили их на могилу");
                break;
            case 3:
                System.out.println("Поздравляю! Вы оказались в обезьяннике за плохое поведение");
                break;
            default:
                System.out.println("Извините, но такого выбора нет в списке");
        }
    }

    public static void Grob() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите гроб: ");
        System.out.println("1. Обычный");
        System.out.println("2. Hello Kitty");
        System.out.println("3. Нафиг гроб, лучше кремируем!");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Вы выбрали обычный гроб");
                break;
            case 2:
                System.out.println("Вы выбрали гроб Hello Kitty");
                break;
            case 3:
                System.out.println("Как жестоко... Вы решили кремировать человека");
                break;
            default:
                System.out.println("Извините, но такого выбора нет в списке");
        }
    }

    public static void Pohoronu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите место захоронения: ");
        System.out.println("1. Возле семейного кладбища");
        System.out.println("2. Кремировать");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Вы решили похоронить человека возле семейного кладбища");
                break;
            case 2:
                System.out.println("Вы решили кремировать человека");
                break;
            default:
                System.out.println("Извините, но такого выбора нет в списке");
        }
    }
    //public static void main(String[] args) {

        //Kladbuche.Byket();
        //Kladbuche.Grob();
        //Kladbuche.Pohoronu();

        //Kladbuche graveyard = new Kladbuche();
       // graveyard.Prochanue();
        //graveyard.Data();
       // graveyard.Tryps();

      //  graveyard.bury("Джон");
       // graveyard.mourn("Мэри");
        //graveyard.resurrect("Лазарь");
       // graveyard.digGrave(6);
    //}
}