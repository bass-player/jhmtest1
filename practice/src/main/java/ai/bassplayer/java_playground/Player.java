package ai.bassplayer.java_playground;

import info.debatty.java.stringsimilarity.Damerau;

/**
 *
 */
public class Player {

    public String s1;

    public String s2;

    Damerau d = new Damerau();

    /**
     *
     * @param s1
     * @param s2
     */
    public Player(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    /**
     *
     * @return
     */
    public double compare() {

        return d.distance("ABCDEF", "ABDCEF");
    }
}
