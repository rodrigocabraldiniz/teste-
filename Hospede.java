package teste;

public class Hospede{
    private String name;
    private String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void main(String[] args){
        Hospede florentino = new Hospede();
        florentino.setName("Florentino");
        florentino.setLastName("Ariza");
        System.out.println("Nome: " + florentino.getName());
        System.out.println("Sobrenome: " + florentino.getLastName());
    }
    
}
