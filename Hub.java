import java.util.ArrayList;

public class Hub implements Named{
  private String name;
  private ArrayList<Course> courses;
  private ArrayList<String> options;
  private final int AVG_OFFSET = 0;
  private final int ADD_OFFSET = 1;
  private final int REMOVE_OFFSET = 2;
  private final int BACK_OFFSET = 3;
  private final int SAVE_OFFSET = 4;
  private final int EXIT_OFFSET = 5;

  public Hub(String name){
    this.name = name;
    courses = new ArrayList<Course>();
    options = new ArrayList<String>();
    options.add("Get Average Mark");
    options.add("Add Course");
    options.add("Remove Course");
    options.add("Go Back");
    options.add("Save");
    options.add("Exit");
  }

  /**
   * Handles the menu for an instance of a hub
   * @return true if user wishes to exit program, false if they wish to just go back
   */
  public boolean menu(){
    boolean exitAll = false;
    boolean exit = false;
    while(!exitAll && !exit){
      
    }
    return exitAll;
  }

  public String toString(){
    return name;
  }
}
