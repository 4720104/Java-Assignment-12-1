/**
 * 課題12-1
 * 
 * @author (4720104 伊藤和真)
 * @version (2022/7/11)
 */
public class ProgC1 {

    public static void main(String[] args) {
        DNA dna = new DNA();
        dna.str = "ATTGAACGGTTGTGTTGATGCATCAGAATGGTTT";
        System.out.println(dna.getPair());
    }
}
