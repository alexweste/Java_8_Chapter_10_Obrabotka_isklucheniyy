/* в данном примере демонстрируется три метода, возвращающие управление различными способами. Но ни в одном из них не пропускается выполнение блока finally

 */
public class FinallyDemo {
    //сгенерировать исключение в методе
    static void procA(){
        try{
            System.out.println("В телеле метода procA()");
            throw new RuntimeException("демонстрация");
        } finally{
            System.out.println("Блок оператора finally вметоде procA()");

        }
    }
    //возвратить управление из блока оператора try
    static void procB(){
        try{
            System.out.println("В теле метода procB()");
            return;
        }finally {
            System.out.println("Блок оператора finally вметоде procA()");
        }
    }
    //выполнить блок ry как обычно
    static void procC(){
        try{
            System.out.println("В теле метода procC()");
        }finally {
            System.out.println("Блок оператора finally вметоде procA()");
        }
    }
    public static void main(String[] args){
        try{
            procA();
        } catch (Exception e){
            System.out.println("Исключение перехвачено");
        }
        procB();
        procC();
    }
}
