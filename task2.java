/* Реалезуйте очередь с помощью LinkedList со следующими 
методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя. */
 
public class task2 {
  public static void main(String[] args) {
      Queue myQueue = new Queue();
      myQueue.enQueue(3);
      myQueue.enQueue(2);
      myQueue.enQueue(1);
      myQueue.display();
      myQueue.deQueue();
      myQueue.peak();
  }
  }
  class Queue {
    int queueLength = 3;
    int items[] = new int[queueLength];
    int front = -1;
    int back = -1;
    boolean isFull(){
        if(back == queueLength - 1){
            return true;
        } else {
            return false;
        }
    }
    boolean isEmpty(){
        if(front == -1 && back == -1){
            return true;
        } else {
            return false;
        }
    }
     void enQueue(int itemValue) {
        if(isFull()){
            System.out.println("Очередь заполнена");
        } else if(front == -1 && back == -1){
            front = back = 0;
            items[back] = itemValue;
        } else{
            back++;
            items[back] = itemValue;
        }
    }
     void deQueue(){
        if(isEmpty()){
            System.out.println("Очередь пуста. Нечего исключать из очереди.");
        } else if (front == back){
            front = back = -1;
        } else {
            front++;
        }
    }
    void display(){
        int i;
        if(isEmpty()){
            System.out.println("Очередь пуста");
        } else {
            for(i = front; i <= back; i++){
                System.out.println(items[i]);
            }
        }
    }
    void peak(){
        System.out.println("Переднее значение: " + items[front]);
    }
  }