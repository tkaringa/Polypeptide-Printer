
public class Codon {

    public static String convertToAminoAcid(String codon) {
        String aminoAcid = "";
        switch (codon) {
            case "GCT":
            case "GCC":
            case "GCA":
            case "GCG":
                aminoAcid = "ALANINE";
                break;
            case "GGT":
            case "GGC":
            case "GGA":
            case "GGG":
                aminoAcid = "GLYCINE";
                break;
            case "ATT":
            case "ATC":
            case "ATA":
                aminoAcid = "ISOLEUCINE";
                break;
            case "CTT":
            case "CTC":
            case "CTA":
            case "CTG":
            case "TTA":
            case "TTG":
                aminoAcid = "LEUCINE";
                break;
            case "CCT":
            case "CCC":
            case "CCA":
            case "CCG":
                aminoAcid = "PROLINE";
                break;
            case "GTT":
            case "GTC":
            case "GTA":
            case "GTG":
                aminoAcid = "VALINE";
                break;
            case "TTT":
            case "TTC":
                aminoAcid = "PHENYLALANINE";
                break;
            case "TGG":
                aminoAcid = "TRYPTOPHAN";
                break;
            case "TAT":
            case "TAC":
                aminoAcid = "TYROSINE";
                break;
            case "GAT":
            case "GAC":
                aminoAcid = "ASPARTIC ACID";
                break;
            case "GAA":
            case "GAG":
                aminoAcid = "GLUTAMIC ACID";
                break;
            case "CGT":
            case "CGC":
            case "CGA":
            case "CGG":
            case "AGA":
            case "AGG":
                aminoAcid = "ARGININE";
                break;
            case "CAT":
            case "CAC":
                aminoAcid = "HISTIDINE";
                break;
            case "AAA":
            case "AAG":
                aminoAcid = "LYSINE";
                break;
            case "TCT":
            case "TCC":
            case "TCA":
            case "TCG":
            case "AGT":
            case "AGC":
                aminoAcid = "SERINE";
                break;
            case "ACT":
            case "ACC":
            case "ACA":
            case "ACG":
                aminoAcid = "THREONINE";
                break;
            case "TGT":
            case "TGC":
                aminoAcid = "CYSTEINE";
                break;
            case "ATG":
                aminoAcid = "METHIONINE";
                break;
            case "AAT":
            case "AAC":
                aminoAcid = "ASPARAGINE";
                break;
            case "CAA":
            case "CAG":
                aminoAcid = "GLUTAMINE";
                break;
            default:
                aminoAcid = "NOT_ESSENTIAL";
        }
        return aminoAcid;
    }
}
