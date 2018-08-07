//Пример с операторами Try, которые неявно вложены в вызовы методов
class MethNestTry2 {
    static void nesttry2 (int a){
        try{
            if (a == 1) a = a/(a-a);  //деление на нуль
            if (a == 2){
                int c[] = { 1 };
                    c[42] = 99;
                }
            }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Индекс за пределами массива: " + e);
        }
    }

    public static void main(String[] args){
    try {
        int a = args.length;
        int b = 42 / a;
        System.out.println("a = " + a);
        nesttry2(a);
        } catch(ArithmeticException e) {
        System.out.println("Деление на 0: " + e);
    }
    }
    }

