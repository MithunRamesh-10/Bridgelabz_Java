package dataStructure.linkedList;

/**
 * Problem 7: Social Media Friend Connections
 *
 * Demonstrates singly linked lists with a nested
 * linked list for managing friend connections.
 *
 * Operations:
 * - Add user
 * - Add friend connection
 * - Remove friend connection
 * - Find mutual friends
 * - Display all friends
 * - Search by Name or User ID
 * - Count friends
 *
 * Author : Mithun
 * Date : 08-10-2026
 */
public class SocialMediaFriendConnections {

    // Friend node
    static class Friend {
        private int friendId;
        private Friend next;

        Friend(int friendId) {
            this.friendId = friendId;
        }
    }

    // User node
    static class User {
        private int userId;
        private String name;
        private int age;
        private Friend friends;
        private User next;

        User(int userId, String name, int age) {
            this.userId = userId;
            this.name = name;
            this.age = age;
        }
    }

    private User head;

    // Add user
    public void addUser(int userId,
                        String name,
                        int age) {

        User newUser =
                new User(userId, name, age);

        newUser.next = head;
        head = newUser;
    }

    // Find user by ID
    private User findUserById(int userId) {

        User current = head;

        while (current != null) {

            if (current.userId == userId) {
                return current;
            }

            current = current.next;
        }

        return null;
    }

    // Search user by ID
    public void searchByUserId(int userId) {

        User user = findUserById(userId);

        if (user != null) {
            displayUser(user);
        } else {
            System.out.println("User not found.");
        }
    }

    // Search user by Name
    public void searchByName(String name) {

        User current = head;

        while (current != null) {

            if (current.name.equalsIgnoreCase(name)) {
                displayUser(current);
            }

            current = current.next;
        }
    }

    // Add friend connection
    public void addFriend(int userId1,
                          int userId2) {

        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found.");
            return;
        }

        addFriendToList(user1, userId2);
        addFriendToList(user2, userId1);
    }

    private void addFriendToList(User user,
                                 int friendId) {

        Friend newFriend =
                new Friend(friendId);

        newFriend.next = user.friends;
        user.friends = newFriend;
    }

    // Remove friend connection
    public void removeFriend(int userId1,
                             int userId2) {

        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 != null) {
            removeFriendFromList(
                    user1, userId2
            );
        }

        if (user2 != null) {
            removeFriendFromList(
                    user2, userId1
            );
        }
    }

    private void removeFriendFromList(User user,
                                      int friendId) {

        if (user.friends == null) {
            return;
        }

        if (user.friends.friendId == friendId) {
            user.friends = user.friends.next;
            return;
        }

        Friend current = user.friends;

        while (current.next != null) {

            if (current.next.friendId == friendId) {

                current.next =
                        current.next.next;

                return;
            }

            current = current.next;
        }
    }

    // Display friends
    public void displayFriends(int userId) {

        User user = findUserById(userId);

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println(
                "Friends of " + user.name + ":"
        );

        Friend current = user.friends;

        while (current != null) {

            User friend =
                    findUserById(current.friendId);

            if (friend != null) {
                System.out.println(
                        friend.name
                );
            }

            current = current.next;
        }
    }

    // Find mutual friends
    public void findMutualFriends(int userId1,
                                  int userId2) {

        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            return;
        }

        Friend first = user1.friends;

        while (first != null) {

            Friend second = user2.friends;

            while (second != null) {

                if (first.friendId
                        == second.friendId) {

                    User mutual =
                            findUserById(
                                    first.friendId
                            );

                    if (mutual != null) {
                        System.out.println(
                                mutual.name
                        );
                    }
                }

                second = second.next;
            }

            first = first.next;
        }
    }

    // Count friends
    public int countFriends(int userId) {

        User user = findUserById(userId);

        if (user == null) {
            return 0;
        }

        int count = 0;
        Friend current = user.friends;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    private void displayUser(User user) {

        System.out.println(
                "User ID: " + user.userId +
                        ", Name: " + user.name +
                        ", Age: " + user.age
        );
    }

    public static void main(String[] args) {

        SocialMediaFriendConnections social =
                new SocialMediaFriendConnections();

        social.addUser(1, "Mithun", 21);
        social.addUser(2, "Rahul", 21);
        social.addUser(3, "Arun", 22);
        social.addUser(4, "Karthik", 21);

        social.addFriend(1, 2);
        social.addFriend(1, 3);
        social.addFriend(2, 3);
        social.addFriend(2, 4);

        System.out.println("Mithun's Friends:");
        social.displayFriends(1);

        System.out.println(
                "Mithun's Friend Count: "
                        + social.countFriends(1)
        );

        System.out.println("Mutual Friends:");
        social.findMutualFriends(1, 2);

        System.out.println("Search User:");
        social.searchByName("Mithun");

        social.removeFriend(1, 3);
    }
}