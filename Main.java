import java.util.Formatter;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Golf Package Menu:\n\tRO [Room only]\n\tRM [Room plus meals]\n\tSP [Stay and play]\n\nEnter the menu choice:  ");
    String pack = scan.nextLine();
    //declare and assign values to any additional variables you will need to store data in your program
    double totalPrice = 0.00;
    int golfRounds;
    int persons;

    switch(pack)
    {
      case "SP":
        System.out.print("Enter the number of rounds of golf: ");
        golfRounds = scan.nextInt();
        //should prompt/scan for number of golf rounds
        totalPrice += getGolfPrice(golfRounds);
        //should call getGolfPrice(golfRounds); and update totalPrice
      case "RM":
        System.out.print("Enter the number of persons staying in the room: ");
        persons = scan.nextInt();
        //should prompt/scan for number of people staying in the room
        totalPrice += getPersonPrice(pack, persons);
        //should call getPersonPrice(pack, persons); and update totalPrice  
      case "RO":
        totalPrice += getRoomPrice(pack);
        //should call getRoomPrice(pack); and update totalPrice
        Formatter formatter = new Formatter();
        formatter.format("%.2f", totalPrice);
        System.out.print("\nThe package cost is $" + formatter.toString());
        //Should print "The package cost is $" + totalPrice
        break;

      default:
        System.out.println("\nERROR: This package is unknown");

    }
  }

  public static double getPersonPrice(String selection, int persons)
  {
    double personPrice = 0.00;
    //declare and assign values to any additional variables you will need to store data in your program
    
    switch(selection)
    {
      case "SP":  
        personPrice = (persons*135.25);
        return personPrice;
      case "RM": 
        personPrice = (persons*145.5);
        return personPrice;
      default:
        return 0.00;
    }
    
  }

  public static double getRoomPrice(String selection)
  {
    double roomPrice = 0.00;
    //declare and assign values to any additional variables you will need to store data in your program

    switch(selection)
    {
      case "SP":  
        roomPrice = 224.95;
        return roomPrice;
      case "RM":  
        roomPrice = 249.95;
        return roomPrice;
      case "RO":  
        roomPrice = 264.95;
        return roomPrice;
      default:
        return 0.00;
    }
  }

  public static double getGolfPrice(int golfRounds)
  {
    double golfPrice = 0.00;
    //declare and assign values to any additional variables you will need to store data in your program
    switch(golfRounds)
        {
          case 0:   
            break;
          case 1:  
            golfPrice = 115.40;
            return golfPrice;
          case 2:  
            golfPrice = 230.80;
            return golfPrice;
          default:  
            golfPrice = (golfRounds-2)*95.40 + 230.80;
            return golfPrice;
        }
    return 0.00;
  }
}