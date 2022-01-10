package StateDesignPatternVideo;

public class NoCard implements ATMState {

    AtmMachine atmMachine;

    public NoCard(AtmMachine newATMMachine){

        atmMachine = newATMMachine;

    }

    public void insertCard() {

        System.out.println("Please enter your pin");
        atmMachine.setATMState(atmMachine.getYesCardState());

    }

    public void ejectCard() {

        System.out.println("You didn't enter a card");

    }

    public void requestCash(int cashToWithdraw) {

        System.out.println("You have not entered your card");

    }

    public void insertPin(int pinEntered) {

        System.out.println("You have not entered your card");

    }
}