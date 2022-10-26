import java.lang.reflect.Array;
import java.util.*;

public class PolypeptideChain {
    private ArrayList<String> polypeptideChain;

    public PolypeptideChain(ArrayList<String> polypeptideChain) {
        this.polypeptideChain = polypeptideChain;
    }

    public ArrayList<String> getPolypeptideChain() {
        return this.polypeptideChain;
    }

    public String toString() {
        String chain = "";
        if (this.polypeptideChain.get(0) != null) {
            chain += String.format("<%s>", this.polypeptideChain.get(0));
            for (int i = 1; i < this.polypeptideChain.size(); i++) {
                if (this.polypeptideChain.get(i) != null) {
                    chain += String.format("\n   |\n<%s>", this.polypeptideChain.get(i));
                }
            }
        }
        return chain;
    }
}
