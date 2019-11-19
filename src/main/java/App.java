import io.Console;
import services.SneakerService;
import services.WhiskeyService;

public class App {

    private SneakerService sneakerService = new SneakerService();
    private WhiskeyService whiskeyService = new WhiskeyService();

    public static void main (String[] args){
        App application = new App();
        application.init();
    }

    public void init(){

        Console.printWelcome();

        getUserSelection();
    }

    private void getUserSelection(){
        Integer userAnswer;

        do {
            userAnswer = Console.getIntegerInput ("Enter selection");

            if (userAnswer == 1){

            } else if (userAnswer == 2) {

            } else if (userAnswer == 3){
                break;
            } else {
                System.out.println("Error! Not a valid selection.");
            }

        } while (true);
    }

}
