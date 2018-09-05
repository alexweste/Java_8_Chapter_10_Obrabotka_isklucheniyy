// Программа содержит ошибку и не компилируется
/*class ThrowDemo {
    static void throwOne(){
        System.out.println("В теле метода throwOne().");
        throw new IllegalAccessException ("Демонстрация");
    }
    public static void main (Sting[] args){
        trowOne;
    }
} */

// Программа написана верно:
class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода throwOne().");
        throw new IllegalAccessException("демонстрация");
    }
    public static void main(String[] args){
        try{
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение" + e);
        }
    }
}
