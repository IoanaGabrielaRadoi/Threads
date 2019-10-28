package multithreading.ProducerConsumerSolution;


//todo check if builder is created correctly
public class ProducedElement {

    private String firstElement;
    private String secondElement;

    public String getFirstElement() {
        return firstElement;
    }

    public String getSecondElement() {
        return secondElement;
    }

    public ProducedElement(String firstElement, String secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        public String firstElement;
        public String secondElement;

        public Builder firstElement(String firstElement){
            this.firstElement = firstElement;
            return this;
        }

        public Builder secondElement(String secondElement){
            this.secondElement = secondElement;
            return this;
        }

        public ProducedElement build(){
            return new ProducedElement(firstElement, secondElement);
        }
    }
}
