public class App {
    public static void main(String[] args) throws Exception {
        Cachorro bimbo = new Cachorro("Bimbo", 'M', 4, 1f, 10f);
        Cachorro maya = new Cachorro("Maya", "Lhasa-Apso", "Branco", 'F', 1, 1f, 3f, true);
        bimbo.description();
        maya.description();
        

        System.out.println(bimbo.Imc());
        System.out.println(maya.Imc());


        System.out.println("Execução Terminada");
        
    }
}

class Cachorro {
    
    private String race;
    private float size;
    private String color;
    private int age;
    private boolean hasVaccine;
    private String name;
    private char sex;
    private float weight;
      

    public Cachorro(String name, char sex, int age, float size, float weight) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.size = size;
        this.weight = weight;
        this.race = "Pinscher";
        this.color = "caramelo";
        this.hasVaccine = false;
    }

    public Cachorro(
            String name,
            String race,
            String color,
            char sex,
            int age,
            float size,
            float weight,
            boolean hasVaccine) {
        this.name = name;
        this.race = race;
        this.color = color;
        this.sex = sex;
        this.age = age;
        this.size = size;
        this.weight = weight;
        this.hasVaccine = hasVaccine;
            }

            public String getName(){
                return this.name;
            }
        
            public void setName(String name){
                if (name == ""){
                    return;
                }
        
                this.name = name;
            }
        
            public boolean getHasVaccine() {
                return this.hasVaccine;
            }
        
            public void setHasVaccine(boolean hasVaccine) {
                this.hasVaccine = hasVaccine;
            }

            public void description() {
                String sexStr = this.sex == 'M' ? "macho" : "fêmea";
                String vaccineStr = this.hasVaccine ? "vacinado" : "não vacinado";
        
                System.out.printf(
                        "%s, %d anos - %s\n%s %s cor %s, de porte %.2f e peso %.2f\n", this.name, this.age, vaccineStr,
                        this.race,
                        sexStr, this.color, this.size, this.weight);
            }



             public String Imc() {

            String imcDescription;

        float imc = this.weight / (this.size * 2);

            if (imc <= 18.5) {
                imcDescription = "Abaixo do peso";
         } else if (imc <= 25.0) {
            imcDescription = "Peso normal";
            } else if (imc <= 30) {
            imcDescription = "Acima do peso";
         } else {
            imcDescription = "Obeso";
        }
    
        return imcDescription;
    


    
    }

}













//class Glass{
    //private float volume;
    //private float liquidVolume;

    //public Glass(float volume){
        //this.volume = volume;
        //this.liquidVolume = 0f;
    //}

    //public float getLiquidVolume(){
        //return liquidVolume;
    //}

    //public void setLiquidVolume(float liquidVolume){
        //if(liquidVolume < 0){
            //return;
       // }
       // if(liquidVolume > this.volume){
        //    this.liquidVolume = this.volume;
         //   return;
     //   }
    //    this.liquidVolume = liquidVolume;
   // }

    //public float getVolume(){
   //     return volume;
   // }

   // public String description(){
   //     return ("Volume do copo: " + this.volume + " Volume do liquido: " + this.liquidVolume);
   // }
//}