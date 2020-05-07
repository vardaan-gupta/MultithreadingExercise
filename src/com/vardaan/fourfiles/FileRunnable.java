package com.vardaan.fourfiles;


public class FileRunnable implements Runnable
{

    @Override
    public void run()
    {
       System.out.println(Thread.currentThread().getName() + " is Completed");
        
    }

}
