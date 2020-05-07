package com.vardaan.fourfiles;

public class Starter
{

    public static void main(String[] args)
    {
      
      
      for (int i = 0; i < 50; i++)
    {
          
          Thread f1 = new Thread(new FileRunnable(),"F1");
          Thread f2 = new Thread(new FileRunnable(),"F2");
          Thread f3 = new Thread(new FileRunnable(),"F3");
          Thread f4 = new Thread(new FileRunnable(),"F4");
          
          f1.start();
          f2.start();
          
          try
        {
            f1.join();
            f2.join();
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
          
          f3.start();
          f4.start();
        
          try
        {
              f3.join();
            f4.join();
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
          System.out.println("\n\n\n");
        }
      
      
    }

}
