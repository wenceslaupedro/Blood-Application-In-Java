public class Blood {
    private String bloodType;
    
    public Blood(String bloodType) {
        this.bloodType = bloodType;
    }        
    
    String[] compatibleGroups = null;

    public String[] getCompatibleBloodGroups() {
    String uppercaseBloodType = this.bloodType.toUpperCase();

    String[] compatibleGroups = null;
        
    // Determine compatible blood groups based on the user's blood type
    
    switch (uppercaseBloodType) {
        case "A+":
            compatibleGroups = new String[] { "A+", "AB+" };
            break;
        case "A-":
            compatibleGroups = new String[] { "A+", "A-", "AB+", "AB-" };
            break;
        case "B+":
            compatibleGroups = new String[] { "B+", "AB+" };
            break;
        case "B-":
            compatibleGroups = new String[] { "B+", "B-", "AB+", "AB-" };
            break;
        case "AB+":
            compatibleGroups = new String[] { "AB+" };
            break;
        case "AB-":
            compatibleGroups = new String[] { "AB+", "AB-" };
            break;
        case "O+":
            compatibleGroups = new String[] { "A+", "B+", "AB+", "O+" };
            break;
        case "O-":
            compatibleGroups = new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" };
            break;
        default:
            System.out.println("Unknown blood type. Please enter a valid blood type (e.g. A+).");
            compatibleGroups = new String[0];
            break;
    }
    
    return compatibleGroups;
}
}
