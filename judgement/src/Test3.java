//打印乘法表
public class Test3 {
    public static void main(String[] args) {
        for(int i=1; i<10; i++){
            for(int j=1; j<=i; j++){
                if(j==i){
                    System.out.println(j+"*"+i+"="+i*j);
                }else
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
        }
    }
}
