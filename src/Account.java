public class Account {
    String clientName;
    double Income;
    int filingStatus;
    double tax;

    public Account(String clientName, double income, int filingStatus) {
        this.clientName = clientName;
        Income = income;
        this.filingStatus = filingStatus;
    }

    public double single(double income){
        if(income <= 9950){
            tax = 0.10 * income;
            System.out.println(tax);
        }
        else if(income <= 40525){
            tax = (0.10 * 9950) + 0.12 * (income - 9951);
            System.out.println(tax);
        }
        else if(income <= 86375){
            tax = (0.10 * 9950) + 0.12 * (40525 - 9951) + 0.22 *(income - 40526);
            System.out.println(tax);
        }
        else if (income <= 164925){
            tax = 0.10 * 9950 + 0.12 * (40525 - 9951) + 0.22 *(86375 - 40526) + 0.24 * (income - 86376);
            System.out.println(tax);
        }
        else if(income <= 209425){
            tax = 0.10 * 9950 + 0.12 * (40525 - 9951) + 0.22 *(86375 - 40526) + 0.24 *(164925 - 86376) +
                    0.32 *(income - 164926);
            System.out.println(tax);
        }
        else if (income <= 523600){
            tax = 0.10 * 9950 + 0.12 * (40525 - 9951) + 0.22 *(86375 - 40526) + 0.24 *(164925 - 86376) +
                    0.32 * (209425 - 164926) + 0.35 *(income - 209426);
            System.out.println(tax);
        }
        else if(income >= 523601){
            tax =0.10 * 9950 + 0.12 * (40525 - 9951) + 0.22 *(86375 - 40526) + 0.24 *( 164925 - 86376) +
                    0.32 * (209425 - 164926) + 0.35 *(523600 - 209426) + 0.37 *(income - 523601);
            System.out.println(tax);
        }
        return tax;
    }

    public double married_filed_jointly(double income){
        if(income <= 19900){
            tax = 0.10 * income;
        }
        else if(income <= 81050){
            tax = 0.10 * 19900 + 0.12 *(income - 19901);
        }
        else if(income <= 172750){
            tax = 0.10 * 19900 + 0.12 * (81050 -19901) + 0.22 * (income - 81051);
        }
        else if(income <= 329850){
            tax = 0.10 * 19900 + 0.12 * (81050 -19901) + 0.22 * (172750 - 81051) + 0.24 *(income - 172751);
        }
        else if(income <= 418850){
            tax = 0.10 * 19900 + 0.12 * (81050 -19901) + 0.22 * (172750 - 81051) + 0.24 * (329850 - 172751) +
                    0.32 * (income - 329851);
        }
        else if(income <= 628300){
            tax = 0.10 * 19900 + 0.12 * (81050 -19901) + 0.22 * (172750 - 81051) + 0.24 * (329850 - 172751) +
                    0.32 * (418850 - 329851) + 0.35 * (income -418851);
        }
        else {
            tax = 0.10 * 19900 + 0.12 * (81050 -19901) + 0.22 * (172750 - 81051) + 0.24 * (329850 - 172751) +
                    0.32 * (418850 - 329851) + 0.35 * (628300 - 418851) + 0.37 * (income - 628301);
        }
        return tax;
    }

    public double married_filing_separately(double income){
        if(income <= 9950){
            tax = 0.10 * income;
        }
        else if(income <= 40525){
            tax = 0.10 * 9950 + 0.12 * (income - 9951);
        }
        else if(income <= 86375){
            tax = 0.10 * 9950 + 0.12 * (40525 - 9951) + 0.22 * (income - 40526);
        }
        else if(income <= 164925){
            tax = 0.10 * 9950 + 0.12 * (40525 - 9951) + 0.22 * (86375 - 40526) + 0.24 * (income - 86376);
        }
        else if(income <= 209425){
            tax = 0.10 * 9950 + 0.12 * (40525 -9951) + 0.22 * (86375 - 40526) + 0.24 * (164925 - 86376) +
                    0.32 * (income - 164926);
        }
        else if(income <= 314150){
            tax = 0.10 * 9950 + 0.12 * (40525 -9951) + 0.22 * (86375 - 40526) + 0.24 * (164925 - 86376) +
                    0.32 * (209425 - 164926) + 0.35 * (income - 209426);
        }
        else {
            tax = 0.10 * 9950 + 0.12 * (40525 -9951) + 0.22 * (86375 - 40526) + 0.24 * (164925 - 86376) +
                    0.32 * (209425 - 164926) + 0.35 * (314150 - 209426) + 0.37 * (income - 314151);
        }
        return tax;

    }

    public double head_of_household(double income){
        if(income <= 14200){
            tax = 0.10 * income;
        }
        else if(income <= 54200){
            tax = (0.10 * 14200) + 0.12 * (income - 14201);
        }
        else if(income <= 86350){
            tax = (0.10 * 14200) + 0.12 * (54200 - 14201) + 0.22 *(income - 54201);
        }
        else if (income <= 164900){
            tax = 0.10 * 14200 + 0.12 * (54200 - 14201) + 0.22 *(86350 - 54201) + 0.24 * (income - 86351);
        }
        else if(income <= 209400){
            tax = 0.10 * 14200 + 0.12 * (54200 - 14201) + 0.22 *(86350 - 54201) + 0.24 *(164900 - 86351) +
                    0.32 *(income - 164901);
        }
        else if (income <= 523600){
            tax = 0.10 * 14200 + 0.12 * (54200 - 14201) + 0.22 *(86350 - 54201) + 0.24 *( 164900 - 86351) +
                    0.32 * (209400 - 164901) + 0.35 *(income - 209401);
        }
        else {
            tax =0.10 * 14200 + 0.12 * (54200 - 14201) + 0.22 *(86350 - 54201) + 0.24 *(164900 - 86351) +
                    0.32 * (209400 - 164901) + 0.35 *(523600 - 209401) + 0.37 * (income - 523601);
        }
        return tax;
    }
}
