// Exemplo básico de mvc por Moises Kerschner

public class Main 
{
    public static void main(String[] args)
    {
      Model model = new Model();
      View view = new View();
      
      
      Controller controller = new Controller(model, view);
      
      view.setVisible(true);
    }
}
    