// Exemplo básico de mvc por Moises Kerschner

public class Model 
{
    private String name;
    private String lastname;
    
    public String getFirstName()
    {
        return name;
    }
    
    public String getLastName()
    {
        return lastname;
    }
    
    public void setFirstName(String name)
    {
        this.name = name;
    }
    
    public void setLastName(String lastname)
    {
        this.lastname = lastname;
    }
}
