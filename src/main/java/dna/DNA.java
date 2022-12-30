// TODO: Implement the DNA datatype from scratch!
// Use the test cases to guide you.
package dna;

public class DNA {
    private final String sequence;
    private String noJunkSequence;
    private int numOfJunk;

    public DNA(String sequence) {
        this.sequence = sequence;
        removeJunk();
    }

    public boolean isProtein() {
        //(use substring)if codon start with ATG,
        if(!noJunkSequence.substring(0, 3).equals("ATG")) {
            return false;
        }
        if(!noJunkSequence.substring(noJunkSequence.length()-3, noJunkSequence.length()).equals("TAA")
        || !noJunkSequence.substring(noJunkSequence.length()-3, noJunkSequence.length()).equals("TAG")
        || !noJunkSequence.substring(noJunkSequence.length()-3, noJunkSequence.length()).equals("TGA")){

        }

        //if codon end with TAA, TAG, or TGA
        //
    }

    public void removeJunk() {
        noJunkSequence = "";
        numOfJunk = 0;

        //remove junk from sequence and save to noJunkSequence
        //count the number of junk and save in numOfJunk
        for (int i = 0; i < sequence.length(); i++) {
            //check every index in sequence
            //check if equals to A, T, G, or C
            if (sequence.charAt(i) == 'A'
                    || sequence.charAt(i) == 'T'
                    || sequence.charAt(i) == 'G'
                    || sequence.charAt(i) == 'C') {
                noJunkSequence = noJunkSequence + sequence.charAt(i);

            } else {
                numOfJunk = numOfJunk + 1;
            }

        }


        //if true, save in noJunkSequence
        //if false, +1 to numOfJunk
    }
}
