package Hm1;

public  final  class Son extends Dad {
    private int hight;

    public int getHight() {
        return hight;
    }

    public Son(int age, String name, National national, String eyesColor, String profession,int hight ) {
        super(age, name, national, eyesColor, profession);
        this.hight = hight;
    }
    public Son(int age, String name, National national, String eyesColor, int hight) {
        super(age, name, national,eyesColor);
        this.hight = hight;
    }

    @Override
    public String getInfo() {
        return super.getInfo()  + "\nHigt " + hight;
    }
}
