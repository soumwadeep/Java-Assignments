class Calc
{
    public static void main(String args[])
    {
        float a=Float.parseFloat(args[0]);
        float choice=Float.parseFloat(args[1]);
        float b=Float.parseFloat(args[2]);
        switch (choice)
        {
            case "+":
                System.out.print("Sum="+(a+b));
                break;
            case "-":
                System.out.print("Difference="+(a-b));
                break;
            case "*":
                System.out.print("Product="+(a*b));
                break;
            case "/":
                System.out.print("Quotient="+(a/b));
                break;
            default:
                System.out.print("Invalid Choice");
                break;
        }
    }
}