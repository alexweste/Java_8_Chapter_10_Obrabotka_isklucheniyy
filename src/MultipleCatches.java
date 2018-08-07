// Пример применения нескольких операторов Catch
class MultipleCatches {
    public static void main(String[] args){
        try {
            int a = args.length;
            System.out.println(" a = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[1] = 9;
        }
        catch (ArithmeticException e){
            System.out.println("Деление на 0" + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ощибка индексации за пределами массива." + e);

        }
        System.out.println("После блока оператороа try/catch");
    }
}
