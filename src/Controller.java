
import java.awt.event.*;

public class Controller 
{
    Model model;
    View view;
    String [] array;
    
    Controller(Model model, View view)
    {
        this.model = model;
        this.view = view;
        
        this.view.listener(new pushAction());
    }
    
    class pushAction implements ActionListener
    {   
        @Override
        public void actionPerformed(ActionEvent e) 
        {
           model.setFirstName(view.getName());
           model.setLastName(view.getLastName());
           
           view.display(model.getFirstName(), model.getLastName());
        }
    }
}
