package solarSystem;

public class SolarSystem {
    public static void main(String[] args) {
        SolarSystemBase solar=new SolarSystemBase();
        solar.sun="1";
        solar.planet="2";
        solar.star="2";
        System.out.println("the solar system ");

        //...

        FeatureSun xros=new FeatureSun();
        xros.color="pink";
        xros.temp="24324kv";
        xros.size="0km";

//        ...
        Planet1 renox=new Planet1();
        renox.color="grey";
        renox.size="10km";
        renox.radius="5km";
        


    }
}
