package lab8;

import java.util.*;

public class Show {
    private static final Show INSTANCE // armazena uma instancia
            = new Show(); // (esse eh o singleton)
    private Set<String> availableSeats;

    public static Show getInstance() { // que chama obtem
        return INSTANCE; // a instancia
    }

    private Show() { // quem chama nao pode criar
        // diretamente mais
        // deve usar getInstance()
        availableSeats = new HashSet<String>();
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

    public static void main(String[] args) {
        ticketAgentBooks("1A");
        ticketAgentBooks("1A");
    }

    private static void ticketAgentBooks(String seat) {
        Show show = Show.getInstance();
        System.out.println(show.bookSeat(seat));
    }
}