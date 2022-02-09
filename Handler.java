import java.util.*;

public class Handler {
    // initialize "bugs" and "users" lists
    public List<Bug> bugs = new ArrayList<Bug>();
    public List<User> users = new ArrayList<User>();

    // function to add pre-existing user object to list
    public void AddUser(User user) { users.add(user); }
    // function to add pre-existing bug object to list
    public void AddBug(Bug bug) { bugs.add(bug); }

    // function to assign bug to user
    public void AssignBug(User user, Bug bug) { user.WIP = bug; }

    // function to update bug information
    public void UpdateBug(Bug bug, Status status, Severity severity) { bug.Update(status, severity); }

    // function to update bug as solved and remove it from bugs list (garbage collection will eventually delete)
    public void MarkAsSolved(Bug bug) { bug.Update(Status.SOLVED, Severity.LOW); bugs.remove(bug); }
}
