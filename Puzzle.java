import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Puzzle {
    private String a;
    private boolean[] b;
    Puzzle() {
        a = "therightword";
        b = new boolean[a.length()];
    }
    Puzzle(String key) {
        a = key;
        b = new boolean[key.length()];
    }
    public void show() {
        for (int i = 0; i < b.length; i++) {
            if (b[i]) {
                System.out.print(a.charAt(i) + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }
    public boolean isUnsolved() {
        for (boolean b : b) {
            if (!b)
                return true;
        }
        return false;
    }
    public boolean makeGuess(String guess) {
        boolean c = false;
        for (int i = 0; i < a.length(); i++) {
            if ((a.charAt(i) + "").equals(guess)) {
                b[i] = true;
                c = true;
            }
        }
        return c;
    }
    public String getWord(){
        return a;
    }
}