class SalesTaxCalculator 
{
    double amount,taxRate;
    void setAmtRate(double a,double t)
    {
        amount = a;
        taxRate = t;
    }
    double calculateTax()
    {
        return amount*taxRate/100;
    }
}
class Result
{
    public static void main(String args[])
    {
        SalesTaxCalculator obj = new SalesTaxCalculator();
        obj.setAmtRate(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
        System.out.println("Tax is: "+obj.calculateTax());
    }
}
