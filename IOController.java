import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class IOController{

  private String username;
  private String filename;
  private CourseCorrect model;

  public IOController(String username, CourseCorrect model){
    this.username = username;
    this.filename = String.format("%s.txt",username);
    this.model = model;
  }

  /**
   * Saves the CourseCorrect instance to a file
   * @return True if successful, false otherwise
   */
  public boolean save(){
    return false;
  }

  /**
   * Loads the CourseCorrect instance from a file
   * @return A CourseCorrect instance
   */
  public CourseCorrect load(){
    return null;
  }

  /**
   * handles user input for selecting a number from [0,max)
   * @param max The exclusive upper bound of the selection
   * @return The selected number
   */
  public int selectOption(int max){
    Scanner input = new Scanner(System.in);
    int selection = -1;
    while(selection < 0 || selection >= max){
      input = new Scanner(System.in);
      try{
        selection = input.nextInt();
        if(selection < 0 || selection >= max) System.out.print("Invalid selection.\n>");
      }
      catch(InputMismatchException e){
        System.out.print("Invalid selection.\n>");
        continue;
      }
    }
    return selection;
  }

  /**
   * Displays a menu for a selection-based component (user menu, hub, course)
   * and keeps track of the number of selections that aren't options
   * @param items The entries that aren't options
   * @param options The options one has with the entries
   * @return The number of options in items
   */
  public int displayMenu(ArrayList<Named> items, ArrayList<String> options){
    int i;
    for(i = 0; i < items.size(); i++){
      System.out.println(String.format("%d. %s", i, items.get(i).toString()));
    }
    for(int j = 0; j < options.size(); j++){
      System.out.println(String.format("%d. %s", i+j, options.get(j)));
    }
    System.out.print(">");
    return i;
  }

  public void removeMenu(ArrayList<Named> items){
    System.out.println("Select an item to remove:")
    for (int i = 0; i < items.size(); i++){
      System.out.println(String.format("%d. %s", i, items.get(i).toString()));
    }
    System.out.print(">");
  }

  /**
   * Prompts the user for an item name and gives it to the calling method
   * @return: The name entered
   */
  public String enterName(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a name for the item (no spaces).");
    System.out.print(">");
    return input.next();
  }

  /**
   * Prints a line break. Mostly for formatting.
   */
  public void lineBreak(){
    StringBuilder line = new StringBuilder();
    for(int i = 0; i < 30; i++){
      line.append("-");
    }
    System.out.println(line.toString());
  }
}
