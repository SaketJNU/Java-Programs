class SharedBuffer {
    private int data;
    private boolean hasData = false;

    // Producer method
    public synchronized void produce(int value) {
        try {
            while (hasData) {
                wait(); // wait if data is not yet consumed
            }
            data = value;
            hasData = true;
            System.out.println("Produced: " + data);
            notify(); // notify consumer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Consumer method
    public synchronized void consume() {
        try {
            while (!hasData) {
                wait(); // wait if there's no data to consume
            }
            System.out.println("Consumed: " + data);
            hasData = false;
            notify(); // notify producer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Producer extends Thread {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(500); // simulate production time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try {
                Thread.sleep(800); // simulate consumption time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class InterThreadCommunication {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}

