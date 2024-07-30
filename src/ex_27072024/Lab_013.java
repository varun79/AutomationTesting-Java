package ex_27072024;

public class Lab_013 {
    public static void main(String[] args) {

        int[] salaries={7,15,25,14,9,10};
        int max=salaries[0];
        int min=salaries[0];

        for(int i=0;i<salaries.length;i++){
            if(salaries[i]>max){
                max=salaries[i];
            }
            if(min>salaries[i]){
                min=salaries[i];
            }
        }
        System.out.println("Maximum Salary is "+max);
        System.out.println("Minimum Salary is "+min);
    }
}
