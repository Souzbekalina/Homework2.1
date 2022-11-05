package Hm1;

import javax.management.BadStringOperationException;

public class Dad extends Grandpa {
    private String eyesColor;
    private String profession;

    public Dad(int age, String name, National national, String eyesColor,String profession) {
        super(age, name, national);
        this.eyesColor = eyesColor;
        this.profession=profession;
    }
    public Dad(int age, String name, National national, String eyesColor){
        super(age,name,national);
        this.eyesColor=eyesColor;
    }



    public String getEyesColor() {
        return eyesColor;
    }

    public String getProfession() {
        return profession;
    }

    public void hobby(String hobby){
        System.out.println(hobby);
    }
    private void phobia(){
        System.out.println("Боится отца");
    }

    @Override
    public String getInfo() {
        return super.getInfo() +"\n EyesColor " + eyesColor+ " \nProfession " + profession;
    }
}
