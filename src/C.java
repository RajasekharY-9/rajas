class C implements  B {

public void display() {
    System.out.println("from c");
B.super.display();

}



    public static void main(String[] args) {
        C c=new C();
        c.display();
    }
}
