class Process {
    int id, burstTime, priority;
    Process next;

    Process(int id, int burstTime, int priority) {
        this.id = id;
        this.burstTime = burstTime;
        this.priority = priority;
    }
}

class RoundRobin {
    Process head, tail;

    void addProcess(int id, int burstTime, int priority) {
        Process newProcess = new Process(id, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            tail.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
    }

    void displayProcesses() {
        if (head == null)
            return;
        Process temp = head;
        do {
            System.out.println(temp.id + " " + temp.burstTime + " " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }
}
