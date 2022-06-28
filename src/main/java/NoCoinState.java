public class NoCoinState implements State{

    private final TicketMachine ticketMachine;

    public NoCoinState(TicketMachine ticketMachine) {
        this.ticketMachine = ticketMachine;
    }

    @Override
    public void insertCoin() {
        // 동전을 넣었다면 동전이 있는 상태로 이동한다.
        ticketMachine.setState(ticketMachine.getCoinState());
    }

    @Override
    public void printTicket() {
        System.out.println("동전이 없습니다. 동전을 넣어주세요.");
    }
}
