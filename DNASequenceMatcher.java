public class DNASequenceMatcher {
    public static boolean isValidDNA(String sequence) {
        return sequence.matches("[ATGC]+");
    }

    public static double similarityPercentage(String s1, String s2, int distance) {
        int maxLength = Math.max(s1.length(), s2.length());
        return 100.0 * (maxLength - distance) / maxLength;
    }
}
