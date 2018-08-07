/*В данной программе происходит обработка исключения ошибки деления
на 0
*/

class Exc2 {
    public static void main(String[] args) {
        int  c, a;
        try { // берём на контроль блок кода
            c = 0;
            a = 42 / c;
            System.out.println("Эта строка не должна выводится");
        }
        catch (ArithmeticException e) { //перехватить ощибку
            System.out.println("Деление на 0");
        }
    }
       // System.out.println(" a = " + a);

}
