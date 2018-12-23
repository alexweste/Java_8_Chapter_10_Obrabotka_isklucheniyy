/* вспоминаем ООП*/
public class Cat {
    private int weight; // вес кота
    private String name; // имя кота
    private String color; // цвет кота

    /* объявим методы - что наш кот умеет делать?
    Пусть он будет уметь есть, спать и разговаривать
     */
    // 1) кот ест:
    public void eat() {
        System.out.print("Eating ...\n");
    }

    // 2) кот спит:
    public void sleep(){
        System.out.println("Sleeping zz-zz-z..");
    }

    // 3) кот говорит:
    public String speak(String words){
        String phrase = words + " ... mau..\n";
        return phrase;
    }
}
