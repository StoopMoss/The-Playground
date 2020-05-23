import com.sun.javafx.scene.paint.GradientUtils.Point;

//import org.omg.PortableInterceptor.NON_EXISTENT;

public class CircularQueue{

    public static void main(String[] args){
        System.out.println("Running");
        MyQueue q = new MyQueue(3);
        MyQueue q2 = new MyQueue(3);
        
        try 
        {
            // Handle push over end of buffer
            q.push(1);
            q.push(2);
            q.push(3);
            q.push(4);
            q.print();

            // Handle push over end of buffer when empty tail
            q2.push(1);
            q2.push(1);
            q2.push(1);
            q2.pop();
            q2.pop();
            q2.pop();
            q2.print();
            q2.push(2);
            q2.print();
            q2.push(3);
            q2.print();

        } catch (Exception e) {
            System.out.print("Exception: " + e.getMessage()); 
        }
    }

   

}
 
