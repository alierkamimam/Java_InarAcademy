
package chapter.chapter10.homework.Exercises08;

public class Tax {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_OR_WIDOWER = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    int fillingStatus;
    int[][] brackets;
    double[] rates;
    double taxableIncome;


    public Tax() {
        this(SINGLE_FILER, null, null, 0);


    }

   /* public double getTax(){
        if (taxableIncome<brackets[fillingStatus][0]){
            return 0;
        }
        for (int i = 0; i < brackets[fillingStatus].length; i++) {


        }



    }*/
    public Tax(int fillingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.fillingStatus = fillingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;

    }

    public int getFillingStatus() {
        return this.fillingStatus;
    }

    public void setFillingStatus(int fiilingStatus) {
        this.fillingStatus = fiilingStatus;
    }

    public int[][] getBrackets() {
        return this.brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return this.rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return this.taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
}
