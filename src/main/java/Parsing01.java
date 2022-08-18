public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
String shirtPrice="15", taxRate="0.05", gibberish="887ds7nds87dsfs";
double tax;

        //Parse shirtPrice and taxRate, and print the total tax

        int shirtPriceInt= Integer.parseInt(shirtPrice);
        double taxRateDouble= Double.parseDouble(taxRate);
 tax=shirtPriceInt*taxRateDouble;
        System.out.println(tax);

        //Try to parse taxRate as an int

        //Try to parse gibberish as an int
//        int gibberishInt= Integer.parseInt(gibberish);
    }

}
