public class Topic_6_1_Function_Overloading {

    //Overloading:- Multiple function with same name but different parameters
    //Using Parameters
//    public static int sum(int a, int b)
//    {
//        return a+b;
//    }
//    public static int sum(int a,int b,int c)
//    {
//        return a+b+c;
//    }

    //Using Data Types
    public static int sum(int a, int b)
    {
        return a+b;
    }
    public static float sum(float a,float b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        //For Using Parameters
//        int s1=sum(1,2);
//        int s2=sum(1,2,3);
//        System.out.println(s1);
//        System.out.println(s2);

        //For using Data Types
        System.out.println(sum(3,2));
        System.out.println(sum(3.2f,2.1f));
    }
}
