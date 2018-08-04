import java.util.Scanner;

public class Exam2 {
    private double getTax(double salary){
        double tax = 0;
        if(salary<0){
            System.out.println("不需要缴税");
            return 0;
        }else if(salary < 1500){
            tax = salary * 0.03;
            return tax;
        }else if(salary < 4500){
            tax = 1500*0.03 + (salary-1500)*0.1;
            return tax;
        }else if(salary < 9000){
            tax = 1500*0.01 + 3000*0.1 + (salary-4500)*0.2;
            return tax;
        }else if(salary < 35000){
            tax = 1500*0.01 + 3000*0.1 + 4500*0.2 + (salary-9000)*0.25;
            return tax;
        }else if(salary < 55000){
            tax = 1500*0.01 + 3000*0.1 + 4500*0.2 + 26000*0.25 + (salary-35000)*0.3;
            return tax;
        }else if(salary < 80000){
            tax = 1500*0.01 + 3000*0.1 + 4500*0.2 + 26000*0.25 + 20000*0.3 + (salary-55000)*0.35;
            return tax;
        }else if(salary >80000){
            tax = 1500*0.01 + 3000*0.1 + 4500*0.2 + 26000*0.25 + 20000*0.3 + 25000*0.35 + (salary-80000)*0.45;
            return tax;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入工资:");
        double salary = scanner.nextDouble();
        Exam2 t = new Exam2();
        double tax = t.getTax(salary-3500);
        System.out.println("所需要缴纳的税费为:"+tax);
    }
}
