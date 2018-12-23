public class OurCat {
    public static void main (String[] arg){
        Cat ourcat = new Cat();
        ourcat.sleep();
        ourcat.eat();
        String say = ourcat.speak("Play with me");
        System.out.println(say);
    }
}
