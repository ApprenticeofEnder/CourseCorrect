import java.util.ArrayList;

public class CourseCorrect{
  private String name;
  private ArrayList<Hub> hubs;
  private ArrayList<String> options;
  private final int AVG_OFFSET = 0;
  private final int ADD_OFFSET = 1;
  private final int REMOVE_OFFSET = 2;
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

  public boolean menu(IOController controller){
    boolean exit = false;
    while(!exit){
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
        case 0:
          break;
        case 1:

      }
    }
    return exit;
  }

  public void addHub(){
    
  }
}
