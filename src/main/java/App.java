import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userAttendees = 0;
    String userFood = "";
    String userBar = "";
    String userBand = "";
    boolean attendeesValid = false;
    boolean foodValid = false;
    boolean barValid = false;
    boolean bandValid = false;

    System.out.println("Welcome to Portland Event Planners! Let's get started by getting some info about your event.");
    System.out.println(" ");
    System.out.println("-----------------------------");
    System.out.println(" ");

    while (!attendeesValid) {
      System.out.println("How many people will be attending your event?");
      userAttendees = Integer.parseInt(scanner.nextLine());
      System.out.println("-----------------------------");
      System.out.println(" ");
      if (userAttendees > 0 && userAttendees <= 500) {
        attendeesValid = true;
      } else {
        System.out.println("Our venue's max capacity is 500 people. Please enter a number between 0 and 500.");
      }
    }

    while (!foodValid) {
      System.out.println("Would you like us to provide catering for your event? Please enter either 'full dinner menu', 'snacks', or 'none'");
      userFood = scanner.nextLine();
      System.out.println("-----------------------------");
      System.out.println(" ");
      if ((userFood.equalsIgnoreCase("none")) || (userFood.equalsIgnoreCase("snacks")) || (userFood.equalsIgnoreCase("full dinner menu"))) {
        foodValid = true;
      } else {
        System.out.println("Sorry, we didn't recognize that option.");
      }
    }

    while (!barValid) {
      System.out.println("Will you need bar service for you event? Please enter 'yes' or 'no'.");
      userBar = scanner.nextLine();
      System.out.println("-----------------------------");
      System.out.println(" ");
      if ((userBar.equalsIgnoreCase("yes")) || userBar.equalsIgnoreCase("no")) {
        barValid = true;
      } else {
        System.out.println("Sorry, we didn't recognize that option.");
      }
    }

    while (!bandValid) {
      System.out.println("We also have a band available that could play at your event. Would you like us to book them? Please enter 'yes' or 'no'.");
      userBand = scanner.nextLine();
      System.out.println("-----------------------------");
      System.out.println(" ");
      if ((userBand.equalsIgnoreCase("yes")) || userBand.equalsIgnoreCase("no")) {
        bandValid = true;
      } else {
        System.out.println("Sorry, we didn't recognize that option.");
      }
    }

    Event newEvent = new Event(userAttendees, userFood);

    System.out.println("Great! Here are the details for your event.");
    System.out.println("=============================");
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
