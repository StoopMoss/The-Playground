public class MyQueue {
    
    int head;
    int tail;
    int[] body;
    int _size;
    boolean eating;

    // Constructors 
    public MyQueue(int size){
        body = new int[size];
        head = 0;
        tail = 0;
        _size = size;
        eating = false;
    }
    
    // Methods
    public void push(int n){
        body[head] = n;
        head ++; 
        if (eating && head > tail) {
            tail++;
        }   
        if (head == _size){
            head = 0;
        }
        if (tail == _size) {
            tail = 0;
        }
        if (head == tail) {
            eating = true;
        } 
    }

    public int pop() throws Exception {
        if (tail == head && !eating) {
            // EMPTY  
            throw new Exception("Queue is empty. Pop not allowed");
        }

        int pop = tail;
        tail++;
        if (tail == _size) {
            tail = 0;
        }
        eating = false;
        return body[pop];
    }

    public void print() {
        
        if (!eating && head == tail){
            System.out.println("Empty queue");
            return;
        }
        System.out.println("Head: " + head + " Tail: " + tail);

        int i = tail;
        do 
        {
            System.out.print(body[i] + " ");
            i++;
            if (i == _size) {
                i = 0;
            }
        }while (i != head) ;
        System.out.println();
    }
}