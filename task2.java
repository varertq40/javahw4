/* Реалезуйте очередь с помощью LinkedList со следующими 
методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя. */

class task2{
    public static void main(String a[]){
     
    LinkedListQueue queue = new LinkedListQueue();
    
    queue.enqueue(6);
    queue.enqueue(3);
    queue.print_frontRear();
    queue.enqueue(12);
    queue.enqueue(24);
    queue.dequeue();
    queue.dequeue();
    queue.enqueue(9);
    
    queue.print_frontRear();
    }
}
class LinkedListQueue{

    private Node front, rear; 
    private int queueSize; 

    private class Node{ 
    int data;
    Node next;
    }
  
    public LinkedListQueue(){
        front = null;
        rear = null;
        queueSize = 0;
    }
 
    public boolean isEmpty(){
        return (queueSize == 0);
    }
  
    public int dequeue(){
        int data = front.data;
        front = front.next;
        if (isEmpty()){
        rear = null;
    }

        queueSize--;
        System.out.println("Элемент " + data+ " снят с очереди");
        return data;
}
  
    public void enqueue(int data){
        Node oldRear = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;
        if (isEmpty()){
        front = rear;
    }
        else{
        oldRear.next = rear;
    }

        queueSize++;
        System.out.println("Элемент " + data+ " добавлен в очередь");
    }

    public void print_frontRear() {
        System.out.println("Переди очереди:" + front.data 
        + " Задняя часть очереди:" + rear.data);
    }
}
