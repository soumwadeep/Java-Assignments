class Q3MarksReview 
{
    public static void main(String args[])
    {
        float a=Float.parseFloat(args[0]);
        if(a<50)
        {
            System.out.println("Fail");
        }
        else if(a>=50 && a<60)
        {
            System.out.println("Poor");
        }
        else if(a>=60 && a<70)
        {
            System.out.println("Average");
        }
        else if(a>=70 && a<80)
        {
            System.out.println("Good");
        }
        else if(a>=80 && a<90)
        {
            System.out.println("Excellent");
        }
        else if(a>=90 && a<=100)
        {
            System.out.println("Outstanding");
        }
        else
        {
            System.out.println("Invalid Marks");
        }
    }
}
