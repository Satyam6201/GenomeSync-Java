import java.util.Scanner;
import utils.FileUtil;

public class Main {
    public static void main(String[] args) {
        TimerUtil timer = new TimerUtil();
        timer.start();

        String seq1 = FileUtil.readSequence("C:\\Users\\satya\\OneDrive\\Desktop\\Project\\DNASequenceMatcher-java\\dna_sequences\\sequence1.txt");
        String seq2 = FileUtil.readSequence("C:\\Users\\satya\\OneDrive\\Desktop\\Project\\DNASequenceMatcher-java\\dna_sequences\\sequence2.txt");

        if (!DNASequenceMatcher.isValidDNA(seq1) || !DNASequenceMatcher.isValidDNA(seq2)) {
            System.out.println("Invalid DNA sequences.");
            return;
        }

        int distance = LevenshteinDistance.calculate(seq1, seq2);
        double similarity = DNASequenceMatcher.similarityPercentage(seq1, seq2, distance);
        double gc1 = DNASequenceMatcher.gcContent(seq1);
        double gc2 = DNASequenceMatcher.gcContent(seq2);
        String lcs = LCSFinder.findLCS(seq1, seq2);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a DNA pattern to search: ");
        String pattern = sc.nextLine().toUpperCase();
        boolean foundInSeq1 = KMPMatcher.contains(seq1, pattern);
        boolean foundInSeq2 = KMPMatcher.contains(seq2, pattern);

        long duration = timer.stop();

        // Print & save
        StringBuilder report = new StringBuilder();
        report.append("Sequence 1: ").append(seq1).append("\n");
        report.append("Sequence 2: ").append(seq2).append("\n");
        report.append("Levenshtein Distance: ").append(distance).append("\n");
        report.append(String.format("Similarity Index: %.2f%%\n", similarity));
        report.append(String.format("GC Content Seq1: %.2f%%\n", gc1));
        report.append(String.format("GC Content Seq2: %.2f%%\n", gc2));
        report.append("Longest Common Subsequence: ").append(lcs).append("\n");
        report.append("Pattern found in Seq1: ").append(foundInSeq1).append("\n");
        report.append("Pattern found in Seq2: ").append(foundInSeq2).append("\n");
        report.append("Execution Time: ").append(duration).append(" ms\n");

        System.out.println(report);
        ReportGenerator.saveReport(report.toString(), "report/report.txt");
    }
}
