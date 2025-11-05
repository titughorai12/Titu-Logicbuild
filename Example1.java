public class Example1

      {
        int a=10;
        int b=0;
        int c=a/b;{
    public static void main(String[] args)
    {
      try 
        System.out.println("result"+c);
      }
      catch(Exception  e)
      {
        System.out.println(e);
      } 
      finally
      {
        System.out.println("program finish");
      } 
    }
}