public class App {
    public static void main(String[] args) throws Exception {
        Cachorro rex = new Cachorro("Rex", "Pastor Alemão", "Preto", 65f , 2018);
        Cachorro lassie = new Cachorro("Lassie");
        Cachorro lion = new Cachorro("Lion");
        Cachorro frederico = new Cachorro("Frederico", "Poodle", "branco", 24f , 2006);
        rex.description();
        lassie.description();
        lion.description();
        frederico.description();
        System.out.println("Execução Terminada");
    }
}

class Cachorro {
    
    private String race;
    private float size;
    private String color;
    private int age;
    private String name;
    private char sex;
    private float weight;
    private float thirstMeter;
    private boolean hasVaccine;

    public Cachorro(String name){
        this.name = name;
        this.race = "Vira-lata";
        this.color = "Caramelo";
        this.size = 40f;
        this.age = 2;
    }

    public Cachorro(String name, String race, String color, float size, int birth){
        this.name = name;
        this.race = race;
        this.color = color;
        this.size = size;
        this.age = 2023 - birth;
    }

    public void description(){
        System.out.println(
        "Esse é " + this.name +
        ", ele é um cachorro da raça " + this.race +
        " de porte " + this.size + 
        " da cor " + this.color +
        " e tem " + this.age + " anos");
    }

}


