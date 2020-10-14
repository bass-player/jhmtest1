//循环生成40个0--100之间的随机整数,并输出低于平均成绩的个数
public class Test2 {
    public static void main(String[] args) {
        int[] al = new int[40];
        int sum = 0;
        for(int i=0; i<al.length; i++){
            al[i] = (int)(100*Math.random());
            sum += al[i];
            System.out.print(al[i]+" ");
            if(i == al.length-1){
                System.out.println("");
            }
        }

        //并输出低于平均成绩的个数
        int num = 0;
        double avg = (double)(sum)/ al.length;
        for(int j=0; j< al.length; j++){
            if(al[j]<avg){
                num++;
            }
        }
        System.out.println(num);

        //冒泡排序
        for(int m=0; m<al.length-1; m++){
            for(int n=0; n< al.length-1; n++){
                int temp = al[n];
                if(al[n+1] >= al[n]){
                    al[n] = al[n+1];
                    al[n+1] = temp;
                }else {
                    continue;
                }
            }
        }
        for(int a=0; a<al.length; a++)
        System.out.print(al[a]+" ");
    }
}
