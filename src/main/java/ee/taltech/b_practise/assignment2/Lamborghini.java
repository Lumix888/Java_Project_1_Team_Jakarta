package ee.taltech.b_practise.assignment2;

public class Lamborghini {

    //DONE: A add 2 instance fields to this class of different Java types
    //DONE: B add a constructor which initializes both of the fields
    //DONE: C add 2 instance methods to this class (other than getters or setters)

    private int maxSpeed;
    private String modelName;

    public Lamborghini(int maxSpeed, String modelName){
        setMaxSpeed(maxSpeed);
        setModelName(modelName);
    }

    public static void main(String[] args) {
        //DONE: D create a new instance of your class
        //DONE: E call 2 of your newly created methods
        Lamborghini lambo = new Lamborghini(200, "Murcielago");
        lambo.getFullSpecs();
        System.out.println("Average Speed: " + lambo.getAverageSpeed());
    }

    public int getAverageSpeed(){
        return this.getMaxSpeed()/2;
    }

    public void getFullSpecs(){
        System.out.println("Car name: Lamborgini " + this.getModelName());
        System.out.println("Max Speed: " + this.getMaxSpeed());
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
