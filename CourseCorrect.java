import java.util.ArrayList;

public class CourseCorrect{
  private String name;
  private ArrayList<Hub> hubs;
  private ArrayList<String> options;
  private final int AVG_OFFSET = 0;
  private final int ADD_OFFSET = 1;
  private final int DEL_OFFSET = 2;
  private final int SAVE_OFFSET = 3;
  private final int EXIT_OFFSET = 4;

  public CourseCorrect(String name){
    this.name = name;
    hubs = new ArrayList<Hub>();
    options = new ArrayList<String>();
    options.add("Get Overall Mark");
    options.add("Add Hub");
    options.add("Remove Hub");
    options.add("Save");
    options.add("Exit");
  }

  /**
   * Handles the menu for a CourseCorrect instance
   * @param controller The IO controller of the program
   */
  public void menu(IOController controller){
    boolean exit = false;
    while(!exit){
      System.out.println(name);
      controller.lineBreak();
      ArrayList<Named> items = new ArrayList<Named>();
      for(Hub hub:hubs){
        items.add((Named) hub);
      }
      int hubCount = controller.displayMenu(items, options);
      int optionCount = options.size();
      int selection;
      System.out.print(">");
      selection = controller.selectOption(hubCount + optionCount);
      switch(selection - hubCount){
        case AVG_OFFSET:
          break;
        case ADD_OFFSET:
          addHub(controller);
          break;
        case DEL_OFFSET:
          break;
        case SAVE_OFFSET:
          break;
        case EXIT_OFFSET:
          exit = true;
          break;
        default:
          hubs.get(selection).menu(controller);
          break;
      }
    }
  }

  /**
   * Adds a new hub to the user's set of hubs
   */
  public void addHub(IOController controller){
    String hubName = controller.enterName();
    Hub newHub = new Hub(hubName);
    hubs.add(newHub);
  }

  /**
   * Gets the list of hubs
   * @return The list of hubs
   */
  public ArrayList<Hub> getHubs(){
    return hubs;
  }
}
