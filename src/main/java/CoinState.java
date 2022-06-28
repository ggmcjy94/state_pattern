public class CoinState implements State{

    private final TicketMachine ticketMachine;

    public CoinState(TicketMachine ticketMachine) {
        this.ticketMachine = ticketMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("이미 동전이 들어있습니다.");
    }

    @Override
    public void printTicket() {
        // 티켓을 출력하고, 동전을 동전 저장소에 추가한 다음, 동전이 없는 상태로 이동한다.
//        TicketPrinter.print();
//        CoinRepository.add(1);
        ticketMachine.setState(ticketMachine.getNoCoinState());
    }
}
