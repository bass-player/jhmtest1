import java.util.Scanner;

//20*5的数组记录20名同学的5门成绩
public class Test1 {
    public static void main(String[] args) {
        int[][] al = new int[20][5];
        for(int i=0; i<al.length; i++){
            for(int j=0; j<al[i].length; j++){
                al[i][j] = (int)(100*Math.random());
            }
        }

        //列表输出
        System.out.println("成绩列表为：");
        for(int a=0; a< al.length; a++){
            for (int b=0; b<al[a].length; b++){
                System.out.print(al[a][b]+"\t");
            }
            System.out.println("");
        }


        //输出每位同学的成绩总和
        int[] sum = new int[20];
        System.out.print("每位同学的成绩总和为：");
        for(int m=0; m<al.length; m++){
            int s = 0;
            for(int x=0; x<al[m].length; x++){
                s += al[m][x];
            }
            sum[m] = s;
            System.out.print(sum[m]+" ");
        }


        //输出某门课程的平均分
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你想要查询的课程编号（0-4）");
        int y = sc.nextInt();
        if(y<0 && y>4){
            System.out.print("请输入0-4的整数");
        }else {
            double zz = 0;
            for (int z = 0; z < al.length; z++) {
                zz += al[z][y];
            }
            zz = zz / al.length;
            System.out.print("该门课程的平均成绩为：" + zz);
        }
    }
}
