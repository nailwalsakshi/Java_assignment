package Java8.Q2;

public class Program11 {
    public static void main(String[] args)
    {
        Thread EvenNumberThread = new Thread(() -> {
            
            for (int i = 0; i < 10; i++)
            {
                if (i % 2 == 0)
                {
                    System.out.println("Even Number Thread : "+i);
                }
            }
        });
        
        EvenNumberThread.start();
        
    }
    
}
