package ai.bassplayer.test_20;

import info.debatty.java.stringsimilarity.Damerau;

public class HelloWorld {
    public String s1;
    public String s2;
    Damerau d = new Damerau();

    public HelloWorld(String s1, String s2){
        this.s1 = s1;
        this.s2 = s2;
    }

    public double compare(){
        return d.distance("ABCDEF","ABDCEF");
    }
}