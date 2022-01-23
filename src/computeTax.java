import java.util.Scanner;

public class computeTax {
    public static void main(String[] args) {
        boolean inputCorrect ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Input your annual income:");
        double income = scanner.nextDouble();

        do {

            System.out.println("Please enter your filing status: 0 for Single filers e.t.c");
            System.out.println("0. Single Filers");
            System.out.println("1. Married Filing Jointly or Qualifying widow(er) ");
            System.out.println("2. Married Filing Separately");
            System.out.println("3. Head of Household");
            int filingStatus = scanner.nextInt();

            Account user = new Account(name,income,filingStatus);


            switch (filingStatus){
                case 0: {
                    inputCorrect = true;
                    System.out.println(user.clientName + ", your estimated income tax is: " + user.single(user.Income));
                    break;
                }
                case 1: {
                    inputCorrect = true;
                    System.out.println(user.clientName + ", your estimated income tax is: " + user.married_filed_jointly(user.Income));
                    break;
                }
                case 2: {
                    inputCorrect = true;
                    System.out.println(user.clientName + ", your estimated income tax is: " + user.married_filing_separately(user.Income));
                    break;
                }
                case 3: {
                    inputCorrect = true;
                    System.out.println(user.clientName + ", your estimated income tax is: " + user.head_of_household(user.Income));
                    break;
                }
                default:{
                    inputCorrect = false;
                    System.out.println("Input is wrong. Please read instructions carefully.");
                    break;
                }
            }
        }
        while(inputCorrect == false);

    }
}
