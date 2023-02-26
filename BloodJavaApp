import java.util.Scanner;

public class BloodApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your blood type: ");
        String bloodType = sc.next();
        
        // Create User object
        User user = new User(age, bloodType);
        
        // Check if user is 18+ years old
        if (user.isEighteenPlus()) {
            // Create Blood object
            Blood blood = new Blood(bloodType);
            
            // Determine compatible blood groups
            String[] compatibleGroups = blood.getCompatibleBloodGroups();
            
            // Display message
            System.out.print("You can donate blood to: ");
            for (String group : compatibleGroups) {
                System.out.print(group + " "
                );
            }
            System.out.println();
            System.out.print("You can receive blood from: ");
            for (String group : compatibleGroups) {
                System.out.print(group + " "
                );
            }
        } else {
            System.out.println("Sorry, you must be 18 years old or younger than 80 to donate blood.");
        }
        
        sc.close();
    }
}
