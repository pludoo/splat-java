enum Status { UNSOLVED, WIP, SOLVED, TESTING } // status enum
enum Severity { LOW, MEDIUM, HIGH } // severity enum

public class Bug {
    // initialize private vars
    private String descriptor;
    private Status status;
    private Severity severity;

    // initialize public var
    public int identifier;

    // constructor
    public Bug(String _descriptor, Severity _severity) {
        // setting descriptor to parameter
        descriptor = _descriptor;
        severity = _severity;

        // generate an identifier from descriptor and severity hashcode
        identifier = descriptor.hashCode() + severity.hashCode();
        System.out.println("Added New Bug: " + descriptor + " { " + identifier + " }"); // debugging
    }

    // function to update status and severity of bug
    public void Update(Status _status, Severity _severity) { status = _status; severity = _severity; }

}

