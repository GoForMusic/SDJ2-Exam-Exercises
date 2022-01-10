package StateDesignPatternVideo;

public class Start {

    public static void main(String[] args){

        AtmMachine atmMachine = new AtmMachine();

        atmMachine.insertCard();

        atmMachine.ejectCard();

        atmMachine.insertCard();

        atmMachine.insertPin(1234);

        atmMachine.requestCash(2000);

        atmMachine.insertCard();

        atmMachine.insertPin(1234);

    }
}