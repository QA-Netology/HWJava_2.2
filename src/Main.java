public class Main {
    public static void main(String[] args) {

        int acc = 300;                       // Объявляете переменные для входных данных и
        int add = 1500;                      // параметров программы: начального счёта,
        int bonus = add > 1000 ? add / 100 : 0;
        int results =add + acc + bonus;
        // суммы пополнения и тп
        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        System.out.println("Текущий счет: " + acc + " руб." );
        System.out.println("Сумма пополнения: " + add + " руб.");
        System.out.println("Количество бонусов: " + bonus + " руб.");
        System.out.println("Итого на счете: " + results + " руб.");
    }
}
