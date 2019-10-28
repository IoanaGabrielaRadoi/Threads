package multithreading;

public class CheckThreadIds {

    public static void main(String[] args) throws InterruptedException {
        String [] cities = {"Millano", "Belgrad"};

        for (int i=0; i<cities.length; i++){
            new City(cities[i]).start();
        }
    }

    private static class City extends Thread{

        private String cityName;

        public City(String cityName){
            super("Thread " + cityName);
            this.cityName = cityName;
        }

        public void run(){

            long threadId = getId();

            long threadId2 = Thread.currentThread().getId();

            try {
                Thread.sleep(1000000000);
            } catch (InterruptedException e) {
                //ignore this
            }

            System.out.println("threadId: " + threadId + " \nthreadId2: " + threadId2 + " \ncityName: " + cityName + "\n");
        }

    }
}
