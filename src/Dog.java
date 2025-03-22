public class Dog extends Animal implements Runnable{

    public String bark(){
        return "From Dog";
    }

    public static void main(String[] args) {
        Animal a=new Dog();
        System.out.println( a.bark());
        String s="pp";//obj 1
        s=s+"lll";//obj 2
        System.out.println(s);

    }

    @Override
    public void run() {

    }
}
