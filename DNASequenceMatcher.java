public class DNASequenceMatcher {
    public static boolean isValidDNA(String sequence) {
        return sequence != null && sequence.matches("[ATGC]+");
    }

    public static double similarityPercentage(String s1, String s2, int distance) {
        int maxLength = Math.max(s1.length(), s2.length());
        return maxLength == 0 ? 100.0 : 100.0 * (maxLength - distance) / maxLength;
    }

    public static double gcContent(String sequence) {
        int gcCount = 0;
        for (char c : sequence.toCharArray()) {
            if (c == 'G' || c == 'C') gcCount++;
        }
        return 100.0 * gcCount / sequence.length();
    }
}
