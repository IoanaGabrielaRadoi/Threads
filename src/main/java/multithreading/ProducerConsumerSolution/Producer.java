package multithreading.ProducerConsumerSolution;


import java.util.ArrayList;
import java.util.List;

//this is Subject from Observer Pattern
public class Producer implements Runnable{

    private ProducedElement producedElement;

    private List<Consumer> consumerList;

    public void addConsumer(Consumer consumer){
        consumerList.add(consumer);
    }

    public Producer() {
        consumerList = new ArrayList<Consumer>();
    }


    public ProducedElement getProducedElement() {
        return producedElement;
    }

    public void run() {
        producedElement = ProducedElement.builder().firstElement("first").secondElement("second").build();
        for (Consumer c : consumerList){
            c.readyToConsume();
        }
    }
}
