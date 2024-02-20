class QueueinJava{
    int[] queue;
        int front,rear;
        int size;

        QueueinJava(int size){
            queue = new int[size];
            front = rear = -1;
            this.size = size;
        }

        void enqueue(int value){
            if(rear == size-1)
            System.out.println("Queue is Full!");
            else{
                if(front==-1){
                    front=0;
                }
                queue[++rear] = value;
            }


            
        }


        void print(){
            for(int i=0;i<=rear;i++){
                System.out.println(queue[i] + "\t");
            }
            System.out.println();
        }

        void dequeue(){
            if(front == -1){
                System.out.println("Empty");
            }else{
                if(front == rear){
                    front=rear=-1;
                }else{
                    front++;
                }
            }
        }
        public static void main(String[] args) {
            QueueinJava  t = new QueueinJava(3);
            t.enqueue(5);
            t.enqueue(8);
            t.enqueue(1);
            t.print();

    }}
    
        
    

    
