import java.util.*;
import java.io.*;
import javax.swing.*;
public class PolypeptidePrinter {
    public static void main(String[] args) {
        String dnaSequence = "ATTGGTTATACTTGTTCTATT"; //default DNA sequence
        ArrayList<String> codons = new ArrayList<String>();
        dnaSequence = JOptionPane.showInputDialog("Enter a DNA sequence");
        while (dnaSequence.length() % 3 != 0) {
        dnaSequence += "*";
        }
        System.out.printf("Formatted DNA sequence to be parsed: %s\n", dnaSequence);
        for (int i = 0; i < dnaSequence.length(); i += 3) { //make sure the sequence only uses nucleotide bases
            codons.add(Codon.convertToAminoAcid(dnaSequence.substring(i, i + 3)));
        }
       PolypeptideChain chain = new PolypeptideChain(codons);
        System.out.println(chain);
        JOptionPane.showMessageDialog(null, chain);
        try {
            File file = new File("PolypeptideChain.txt");
            PrintWriter pw = new PrintWriter(new FileWriter(file));
            pw.println(chain);
            pw.flush();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
