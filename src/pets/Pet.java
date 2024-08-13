package pets;

public abstract class Pet {
    int pawsCount;
    private String voice;

    public Pet(String voice){
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    public void play(){
        System.out.println("Играю");
    }

    public void sleep(){
        System.out.println("Сплю");
    }
}
