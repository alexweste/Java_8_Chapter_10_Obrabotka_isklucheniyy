// Пример применения вложенных операторов try
public class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;

            int b = 42 / a;
            System.out.println("a = " + a);
            try { // Вложенный блок try
                if (a == 1) a = a / (a - a);

                if (a == 2) {
                    int c[] = {1};
                    c[42] = 99; // генерируется исключение в связи с выходом за пределы массива
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Символ за пределами массива:" + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0:" + e);
        }
    }
}
