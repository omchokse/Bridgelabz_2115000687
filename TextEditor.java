class TextState {
    String content;
    TextState next, prev;

    TextState(String content) {
        this.content = content;
    }
}

class TextEditor {
    TextState current;

    void addState(String content) {
        TextState newState = new TextState(content);
        if (current != null) {
            current.next = newState;
            newState.prev = current;
        }
        current = newState;
    }

    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    void displayCurrentState() {
        if (current != null) {
            System.out.println("Current State: " + current.content);
        }
    }
}
