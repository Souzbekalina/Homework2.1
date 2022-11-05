package Hm1;

public class Main {
    public static void main(String[] args) {
        Dad objectA=new Dad(47,"Nurbek",National.KYRGYZ," Brown","Doctor");
        System.out.println(objectA.getInfo());
        System.out.println("__________________________________________");

        Son objectB=new Son(25,"Aibek",National.KYRGYZ,"Brown","Teacher",185);
        System.out.println(objectB.getInfo());
        System.out.println("___________________________________________");

        Son objectC=new Son(18,"Azamat",National.KYRGYZ,"Black",179);
        System.out.println(objectC.getInfo());







    }


}