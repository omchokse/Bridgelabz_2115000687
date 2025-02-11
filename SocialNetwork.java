class User {
    int id, age;
    String name;
    int[] friends;
    User next;

    User(int id, String name, int age, int[] friends) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.friends = friends;
    }
}

class SocialNetwork {
    User head;

    void addUser(int id, String name, int age, int[] friends) {
        User newUser = new User(id, name, age, friends);
        newUser.next = head;
        head = newUser;
    }

    void displayUsers() {
        User temp = head;
        while (temp != null) {
            System.out.print(temp.id + " " + temp.name + " " + temp.age + " Friends: ");
            for (int friend : temp.friends) {
                System.out.print(friend + " ");
            }
            System.out.println();
            temp = temp.next;
        }
    }
}
