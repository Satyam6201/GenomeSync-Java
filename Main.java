import utils.FileUtil;

public class Main {
    public static void main(String[] args) {
        String seq1 = FileUtil.readSequence("C:\\Users\\satya\\OneDrive\\Desktop\\Project\\DNASequenceMatcher-java\\dna_sequences\\sequence1.txt");
        String seq2 = FileUtil.readSequence("C:\\Users\\satya\\OneDrive\\Desktop\\Project\\DNASequenceMatcher-java\\dna_sequences\\sequence2.txt");

        if (!DNASequenceMatcher.isValidDNA(seq1) || !DNASequenceMatcher.isValidDNA(seq2)) {
            System.out.println("Invalid DNA sequences. Only A, T, G, C allowed.");
            return;
        }

        int distance = LevenshteinDistance.calculate(seq1, seq2);
        double similarity = DNASequenceMatcher.similarityPercentage(seq1, seq2, distance);

        System.out.println("Sequence 1: " + seq1);
        System.out.println("Sequence 2: " + seq2);
        System.out.println("Levenshtein Distance: " + distance);
        System.out.printf("Similarity Index: %.2f%%\n", similarity);
    }
}
