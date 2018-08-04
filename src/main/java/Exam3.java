import java.util.Scanner;

public class Exam3 {
    public static int[] getNum(String str){
        String[] strs = str.split("-");
        int[] ints = new int[3];
        for (int i = 0; i < 3 ; i++) {
            ints[i] = Integer.valueOf(strs[i]);
        }
        return ints;
    }

    public static String[] nextDay(String str){
        int[] ints = Exam3.getNum(str);
        String[] strs = new String[3];
        if(ints[2]==31 && (ints[1]==1||ints[1]==3||ints[1]==5||ints[1]==7||ints[1]==8||ints[1]==10||ints[1]==12)){
            strs[2] = "01";
            strs[0] = ints[0]+"";
            if(ints[1]==12){
                strs[1] = "01";
                strs[0] = (ints[0]+1)+"";
            }else if (ints[1]<9){
                strs[1] = "0"+ (ints[1]+1);
            }else {
                strs[1] = ints[1]+1+"";
            }
            return strs;
        }else if(ints[1]==9||ints[1]==4||ints[1]==6||ints[1]==11){
            if(ints[2]==30) {
                strs[2] = "01";
                if (ints[1] < 9) {
                    strs[1] = "0" + (ints[1] + 1);
                } else {
                    strs[1] = ints[1] + 1 + "";
                }
                strs[0] = ints[0] + "";
            }else if (ints[2]>30){
                strs[0] = "你输入的日期不存在";
            }else{
                strs[0] = ints[0]+"";
                strs[1] = ints[1]+"";
                if(ints[2]<9){
                    strs[2] = "0"+(ints[2]+1);
                }else {
                    strs[2] = ints[2]+1+"";
                }
            }
        }else if(ints[1] == 2 ){
            strs[0] = ints[0]+"";;
            if((ints[0] % 4 == 0 && ints[0] % 100 != 0 || ints[0] % 400 == 0) && ints[2] == 29){
                strs[2] = "01";
                strs[1] = "03";
            }else if(ints[2]==29){
                strs[0] = "你输入的日期不存在";
                return strs;
            }else if(ints[2] == 28){
                System.out.println(2);
                strs[2] = "01";
                strs[1] = "03";
            }else if(ints[2]<28 && ints[2]>0){
                strs[1] = ints[1]+"";
                if(ints[2]<9){
                    strs[2] = "0"+(ints[2]+1);
                }else {
                    strs[2] = ints[2]+1+"";
                }
            }
        }else if(ints[1]<13 && ints[2]<32){
            strs[0] = ints[0]+"";
            strs[1] = ints[1]+"";
            if(ints[2]<9){
                strs[2] = "0"+(ints[2]+1);
            }else {
                strs[2] = ints[2]+1+"";
            }
        }else{
            strs[0] = "你输入的日期不存在";
        }
        return strs;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入日期:");
        String str = scanner.nextLine();
        String[] strs = Exam3.nextDay(str);
        StringBuilder sb = new StringBuilder();
        if(strs[0].equals("你输入的日期不存在")){
            sb.append("你输入的日期不存在");
        }else {
            sb.append(strs[0]).append("-").append(strs[1]).append("-").append(strs[2]);
        }
        System.out.println(sb.toString());
    }
}
