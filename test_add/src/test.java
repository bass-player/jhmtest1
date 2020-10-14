public class test {
    public static void main(String[] args) {
        /*for(int i=1; i<5; i++){
            for(int j=0; j<4-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<i; k++){
                System.out.print('*');
            }
                System.out.println("");
        }*/
        Person p = new Chinese("abc",11,"abc");
        p.eat();
        //p.introduce();
    }
}
abstract class Person{
    Person(){
        System.out.println("Person没有参数的构造函数");
    }

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    String name;
    int age;
    void introduce(){
        System.out.println("我的名字是"+name+"，我的年龄是"+age);
    }
    abstract void eat();
}


class Chinese extends Person{
    String address;
    Chinese(){
        super();
        System.out.println("Chinese的构造函数");
    }

    Chinese(String name,int age,String address){
        super(name,age);
        this.address=address;
        System.out.println("我的名字是"+name+"，我的年龄是"+age+"，我的地址是"+address);
    }
    void eat(){
        //复写
        System.out.println("吃饭");
    }
}
