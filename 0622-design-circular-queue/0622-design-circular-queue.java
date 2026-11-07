class MyCircularQueue {
    int[] circularQ;
    int size;
    int front;
    int rear;

    public MyCircularQueue(int k) {
        size = k;
        circularQ = new int[size];
        front = -1;
        rear = -1;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if(rear == -1){
            front = 0;
            rear = 0;
        }
        circularQ[rear] = value;
        rear = (rear + 1)% size;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        if((front+1)%size == rear){
            front = -1;
            rear = -1;
        }
        front = (front + 1)%size;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return circularQ[front];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return circularQ[((rear - 1)%size + size)%size];
    }
    
    public boolean isEmpty() {
        if(rear == -1){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(front == rear && rear != -1){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */