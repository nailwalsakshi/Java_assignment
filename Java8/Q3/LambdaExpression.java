/* Create a thread using lambda function */

package Java8.Q3;
public class LambdaExpression {

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
