package multithreading.ProducerConsumerSolution;

public class ProducerConsumerMain {

    public static void main(String[] args) {

        Producer producer = new Producer();

        Thread producerThread = new Thread(producer);

        Consumer consumer = new Consumer(producer);

        producer.addConsumer(consumer);

        Thread consumerThread = new Thread(consumer);

        producerThread.start();
    }
}
