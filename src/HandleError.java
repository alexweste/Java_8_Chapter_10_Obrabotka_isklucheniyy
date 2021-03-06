/*В данной программе на каждом цикле for образуется два случайных числа,
которые делятся друг на друга. Результат этого деления делит число 12345.
Если в одной из операций деления появляется ощибка деления на 0, то
эта ошибка обрабатывается исключением (перехватывается), переменной a
присваивается значение 0, и программа продолжает работать дольше.
 */

import java.util.Random;

class HandleError {
    public static void main(String[] args){
        int a = 0, b = 0, c = 0;
        Random r = new Random();

        for(int i = 0; i<32000; i++) {
            try{        //берём часть кода под контроль обработчика исключений
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b/c);
            }
            catch (ArithmeticException e){
                System.out.println("Исключение: " + e);
                a = 0;  // присваиваем a значение нуля ипродолжаем работать
            }
            System.out.println("a = " + a);
        }
    }
}
