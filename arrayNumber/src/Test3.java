//将数组倒序输出
public class Test3 {
    public static void main(String[] args) {
        int[] al = new int[10];
        int[] bl = new int[10];
        System.out.print("原始序列为:");
        for(int i=0; i<al.length; i++){
            al[i] = (int)(100*Math.random());
            System.out.print(+al[i]+" ");
            if (i == al.length-1){
                System.out.println("");
            }
        }
        int temp =0;
        System.out.print("更新后数列为");
        int b = 0;
        for(int z=al.length-1; z>=0; z--){
            bl[b]=al[z];
            b++;
        }
        for (int m=0; m< bl.length; m++)
        System.out.print(bl[m]+" ");
    }
}
