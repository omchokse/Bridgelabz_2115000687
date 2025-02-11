class Ticket {
    int id;
    String customerName, movieName, seatNumber, bookingTime;
    Ticket next;

    Ticket(int id, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.id = id;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
    }
}

class TicketSystem {
    Ticket head, tail;

    void addTicket(int id, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(id, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = tail = newTicket;
            tail.next = head;
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }
    }

    void displayTickets() {
        if (head == null)
            return;
        Ticket temp = head;
        do {
            System.out.println(temp.id + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNumber + " "
                    + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }
}
