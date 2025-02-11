class Task {
    int id, priority;
    String name, dueDate;
    Task next;

    Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

class TaskScheduler {
    Task head, tail;

    void addTask(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            tail.next = head;
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head;
        }
    }

    void deleteTask(int id) {
        Task temp = head, prev = null;
        if (temp != null && temp.id == id) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            prev = temp;
            temp = temp.next;
            if (temp.id == id) {
                prev.next = temp.next;
                if (temp == tail)
                    tail = prev;
                return;
            }
        } while (temp != head);
    }

    void displayTasks() {
        if (head == null)
            return;
        Task temp = head;
        do {
            System.out.println(temp.id + " " + temp.name + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }
}
