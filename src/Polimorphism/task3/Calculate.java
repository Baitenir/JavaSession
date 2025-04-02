package Polimorphism.task3;

public class Calculate {

    public void calculate (int oper, int num1, int num2){
        double res = 0;
        if (oper == 1){
            res = num1 + num2;
        } else if (oper == 2) {
            res = num1 - num2;
        } else if (oper == 3) {
            res = num1 * num2;
        } else if (oper == 4) {
            res = (double) num1 / num2;
        } else {
            System.out.println("Error");
        }
        System.out.println("Result: " + res);


    }
}
