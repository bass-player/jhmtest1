public class Test {
    public static void main(String[] args) {
        /*FirstThread ft = new FirstThread();
        ft.start();

        for(int i=0; i<10; i++){
            System.out.println("main"+i);
        }*/
        Test1 test1 = new Test1();
        Thread t = new Thread(test1);
        System.out.println(t.getPriority());
        t.start();
    }
}
