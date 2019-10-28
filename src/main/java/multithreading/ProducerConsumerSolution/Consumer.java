package multithreading.ProducerConsumerSolution;


//this is one Observable from Observer Pattern
public class Consumer implements Runnable {

    private ProducedElement producedElement;

    private Producer producer;

    public Consumer(Producer producer) {
        this.producer = producer;
    }

    public void readyToConsume(){
        run();
    }

    public void run() {
        producedElement = producer.getProducedElement();
        System.out.println("Got produced element: " + producedElement.getFirstElement() + " " + producedElement.getSecondElement());
    }
}
