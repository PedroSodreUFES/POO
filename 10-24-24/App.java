class Time
{
    private String nome;
    private int nMundiais;
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return this.nome;
    }
    public void incnMundiais()
    {
        this.nMundiais++;
    }
    public int getnMundiais()
    {
        return this.nMundiais;
    }
}


public class App{
    public static void main(String[] args){
        Time flamengo = new Time();
        flamengo.setNome("Flamengo");
        System.out.println(flamengo.getNome());
        flamengo.setNome("Vascaoooooooooooo");
        System.out.println(flamengo.getNome());
        System.out.println(flamengo.getnMundiais());
        flamengo.incnMundiais();
        System.out.println(flamengo.getnMundiais());
    }
}


/*
System.out.println("Hello!");
        if(args.length >= 1)
        {
            System.out.println("Boa cria");
        }
        else
        {
            System.out.println("Malz cria");
        }
*/