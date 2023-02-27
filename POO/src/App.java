public class App {
    public static void main(String[] args) throws Exception {
        Cachorro rex = new Cachorro("Rex", "Pastor Alemão", "Preto", 40f, 5, 'm', 10f, true);
        Cachorro lassie = new Cachorro("Lassie", 3, 23f, 10f, 'f');
        
        rex.description();
        lassie.description();

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

    public Cachorro(String name, int age, float size, float weight, char sex){
        this.name = name;
        this.race = "Vira-lata";
        this.color = "Caramelo";
        this.size = size;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
    }

    public Cachorro(String name, String race, String color, float size, int age, char sex, float weight, boolean hasVaccine){
        this.name = name;
        this.race = race;
        this.color = color;
        this.size = size;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.hasVaccine = hasVaccine;
    }

    public String description(){
        String vacinado;

        if(this.hasVaccine){
            vacinado = "e está com a vacinas em dia";
        }else{
            vacinado = "e não está com as vacinas em dia";
        }

        if(this.sex == 'm'){
            return (
                "Esse é " + this.name +
                ", ele é um cachorro macho da raça " + this.race +
                " da cor " + this.color +
                ", ele tem " + this.age + " anos" +
                " pesa " + this.weight + " kilos " +
                "e tem " + this.size + " centimetros de altura " +
                vacinado
            );
        }else{
            return (
                "Essa é " + this.name +
                ", ela é um cachorro fêmea da raça " + this.race +
                " da cor " + this.color +
                ", ela tem " + this.age + " anos" +
                " pesa " + this.weight + " kilos " +
                "e tem " + this.size + " centimetros de altura " +
                vacinado
            );
        }
    }

    public String imcc(){
        float imcc = this.weight/(this.size*this.size);

        if(imcc <= 18.5f){
            return "Abaixo do peso";
        }else if(imcc <= 25f){
            return "Peso normal";
        }else if(imcc <= 30f){
            return "Acima do peso";
        }else{
            return "Obeso";
        }
    }

}

class Glass{
    private float volume;
    private float liquidVolume;

    public Glass(float volume){
        this.volume = volume;
        this.liquidVolume = 0f;
    }

    public float getLiquidVolume(){
        return liquidVolume;
    }

    public void setLiquidVolume(float liquidVolume){
        if(liquidVolume < 0){
            return;
        }
        if(liquidVolume > this.volume){
            this.liquidVolume = this.volume;
            return;
        }
        this.liquidVolume = liquidVolume;
    }

    public float getVolume(){
        return volume;
    }

    public String description(){
        return ("Volume do copo: " + this.volume + " Volume do liquido: " + this.liquidVolume);
    }
}
