package Views;
import Models.Persona;

public class ViewConsole {
    public  void printPersonsArray(Persona[] personas) {
        for(Persona persona: personas){
            System.out.println(persona.toString());
        }
        }
    
    public void ShowMessage(String message){
        System.out.println(message);
    }
}
