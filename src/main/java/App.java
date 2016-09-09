import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to Portland Event Planners! Let's get started by getting some info about your event.");
    System.out.println(" ");
    System.out.println("-----------------------------");
    System.out.println(" ");

    System.out.println("How many people will be attending your event?");
    int userAttendees = Integer.parseInt(scanner.nextLine());
    System.out.println("-----------------------------");
    System.out.println(" ");

    System.out.println("Would you like us to provide catering for your event? Please enter either 'full dinner menu', 'snacks', or 'none'");
    String userFood = scanner.nextLine();
    System.out.println("-----------------------------");
    System.out.println(" ");

    System.out.println("Will you need bar service for you event? Please enter 'yes' or 'no'.");
    String userBar = scanner.nextLine();
    System.out.println("-----------------------------");
    System.out.println(" ");

    System.out.println("We also have a band available that could play at your event. Would you like us to book them? Please enter 'yes' or 'no'.");
    String userBand = scanner.nextLine();
    System.out.println("-----------------------------");
    System.out.println(" ");

    Event newEvent = new Event(userAttendees, userFood);

    System.out.println("Great! Here are the details for your event.");
    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX");
    System.out.println("Total attendees: " + newEvent.getAttendees());
    System.out.println("Food selection: " + newEvent.getFood());
    if (userBar.equalsIgnoreCase("yes")) {
      newEvent.setBarTrue();
      System.out.println("+ Full service bar");
    }
    if (userBand.equalsIgnoreCase("yes")) {
      newEvent.setBandTrue();
      System.out.println("+ Live band");
    }
    System.out.println("----------------------");
    newEvent.setCostPerAttendee();
    System.out.println("Total Cost = " + newEvent.setTotalCost());

  }
}
