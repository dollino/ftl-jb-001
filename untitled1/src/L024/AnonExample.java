package L024;

import animals.Flight;

public class AnonExample {


    public static void run(){
        Flight flight = new Flight() {
            @Override
            public void takeOff() {

            }

            @Override
            public void landing() {

            }
        };
        flight.landing();
        flight.takeOff();
    }
}
