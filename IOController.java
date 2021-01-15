import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStrem;
import java.io.FileOutputStream;
import java.util.Scanner;

public class IOController{

  private String username;
  private String filename;
  private CourseCorrect model;

  public IOController(String username){
    this.username = username;
    this.filename = String.format("%s.txt",username);
  }

  /**
   * Saves the CourseCorrect instance to a file
   * @return true if successful, false otherwise
   */
  public boolean save(){

  }

  /**
   * Loads the CourseCorrect instance from a file
   * @return a CourseCorrect instance
   */
  public CourseCorrect load(){

  }

  /**
   * handles user input for selecting a number from [0,max)
   * @return the selected number
   */
  public int selectOption(int max){
    
  }
}
