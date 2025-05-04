package FinalExamPrac;

public class ClassesPracAnimal {
    private String name;
    private String Sound;
    private int age;
    private int weight;
    private String color;

    public ClassesPracAnimal(String name, String Sound, int age, int weight, String color){
        this.name = name;
        this.Sound = Sound;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public ClassesPracAnimal(){
        this.name = "No Name";
        this.Sound = "No Sound";
        this.age = 0;
        this.weight = 0;
        this.color = "No Color";
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSound(String Sound){
        this.Sound = Sound;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getName(){
        return this.name;
    }

    public String getSound(){
        return this.Sound;
    }
    public int getAge(){
        return this.age;
    }

    public int getWeight(){
        return this.weight;
    }

    public String getColor(){
        return this.color;
    }

    public String toString(){
        return "Name: " + this.name + "\nSound: " + this.Sound + "\nAge: " +
                this.age + "\nWeight: " + this.weight + "\nColor: " + this.color;
    }
}
