public class Controller{
  private CourseCorrect model;
  private IOController io;

  public Controller(String username){
    model = new CourseCorrect(username);
    io = new IOController(username, model);
  }

  public IOController getIO(){
    return io;
  }

  public CourseCorrect getModel(){
    return model;
  }

  public static void main(String[] args){
    Controller app = new Controller("Ender");
    app.getModel().menu(app.getIO());
  }
}
