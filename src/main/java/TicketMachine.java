public class TicketMachine {

    private final State noCoinState;
    private final State coinState;
    private State currentState;

    public TicketMachine() {
        this.noCoinState = new NoCoinState(this);
        this.coinState = new CoinState(this);
        this.currentState = noCoinState;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void setState(State newState) {
        this.currentState = newState;
    }

    public State getCoinState() {
        return coinState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }
}
