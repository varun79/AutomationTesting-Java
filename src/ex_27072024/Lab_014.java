package ex_27072024;

public class Lab_014 {
    public static void main(String[] args) {

        int [] salaries={15,23,28,10,8,5};

        int max=salaries[0];
        int secondMax=salaries[0];

        for(int i=0;i<salaries.length;i++){
            if(salaries[i]>max){
                secondMax=max;
                max=salaries[i];
            } else if (salaries[i]>secondMax) {
                secondMax=salaries[i];
            }
        }
        System.out.println("Maximum Salary is "+max);
        System.out.println("Second max Salary is "+secondMax);
    }
}
