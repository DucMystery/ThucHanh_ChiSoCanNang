import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap vao can nang:");
        double weight = scanner.nextDouble();
        System.out.println("Moi nhap vao chieu cao :");
        double height = scanner.nextDouble();

        double bmi = weight/(height*height);
        System.out.println(weight+","+height+","+bmi);
        if (bmi>=30.0){
            System.out.println("Obese!");
        }else if (bmi<30.0 && bmi>=25.0){
            System.out.println("OverWeight!");
        }else if (bmi<25.0 && bmi>=18.5){
            System.out.println("Normal!");
        }else if (bmi<18.5){
            System.out.println("UnderWeight!");
        }
    }
}
