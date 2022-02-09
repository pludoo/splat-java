
// splat-java is a Java implementation of the splat BugTracker framework that makes it easy to lay the
// basics of a BugTracker software. This Main class is an example of class usage and not apart of the framework.

public class Main {

    public static void main(String[] args) {
        Handler handler = new Handler(); // create handler (handles users, bugs and the management of them)

        User user1 = new User("John Doe", AccountType.BASE); // create user object
        User user2 = new User("Mary Anne", AccountType.SYSADMIN); // create user object

        Bug bug1 = new Bug("Button doesn't work when side panel is open", Severity.MEDIUM); // create bug object

        handler.AddUser(user1); // add user to handler list
        handler.AddUser(user2); // add user to handler list
        handler.AddBug(bug1); // add bug to handler list

        handler.AssignBug(user1, bug1); // assign bug1 to user1

        handler.UpdateBug(bug1, Status.WIP, Severity.HIGH); // update bug1's status to work in progress and set it's severity to high
        handler.MarkAsSolved(bug1);
    }
}
