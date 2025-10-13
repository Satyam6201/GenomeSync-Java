ye# 🧬 DNA Insight: Intelligent DNA Sequence Analyzer in Java

## 📌 Description
**DNA Insight** is a console-based Java application that performs advanced DNA sequence analysis. It supports sequence comparison, mutation detection, codon translation, similarity scoring, GC content analysis, and more.

Built with **Core Java only** (no external frameworks), this project showcases string algorithms, file I/O, bioinformatics logic, and performance tracking.

---

## 🚀 Features

### ✅ Basic
- Read DNA sequences from `.txt` files
- Validate sequences (only A, T, G, C allowed)

### 📏 Similarity
- Levenshtein Distance
- Similarity Index (%)
- Longest Common Subsequence (LCS)
---

### 🧬 DNA Tools
- GC Content Calculator
- Mutation Highlighter (detect mismatched bases)
- Complement and Reverse Complement Generator

### 🔍 Pattern Search
- Search user-defined DNA pattern in both sequences using **KMP algorithm**

### 🧠 Codon Translation
- Convert DNA to amino acid sequence using codon table

### 📈 Analysis Tools
- Sliding window GC content (5-base window)

### 📂 Report
- Export result as `report.txt`
- (Optional) Export PDF report

### ⏱ Performance
- Execution time display

---

## 📁 Project Structure
```
DNAInsight/
├── Main.java
├── utils/
│   ├── FileUtil.java
│   ├── TimerUtil.java
│   ├── ReportGenerator.java
├── analysis/
│   ├── DNAValidator.java
│   ├── DNAStatistics.java
│   ├── LevenshteinDistance.java
│   ├── LCSFinder.java
│   ├── KMPMatcher.java
│   ├── SlidingGCContent.java
├── dna_sequences/
│   ├── sequence1.txt
│   └── sequence2.txt
├── report/
│   └── report.txt
```

---

## 📥 Sample Input Files
### dna_sequences/sequence1.txt
```
ATGCCGTTA
```
### dna_sequences/sequence2.txt
```
ATGCGGTTG
```
---

## 📤 Sample Output
```
===============================
   DNA Insight Analyzer Tool
===============================

[✓] DNA sequences loaded
[✓] Sequences valid

--- Analysis Results ---
Levenshtein Distance: 2
Similarity Index: 77.78%
LCS: ATGTT
GC Content (Seq1): 55.56%
GC Content (Seq2): 66.67%
Mutations at: [5, 9]
Complement: TACGGCAAT
Reverse Complement: TAACGGCAT

Pattern Search: ATGC
Found in Seq1: Yes
Found in Seq2: No

Codon Translation (Seq1): Met-Pro-Leu

GC Content Window (size 5):
1–5: 60%
2–6: 80%
3–7: 60%

Execution Time: 41ms

📝 Report saved to report/report.txt
===============================
```

---

## 💡 Future Improvements
- GUI version using JavaFX
- Web version using Java + Spring Boot
- Integrate BLAST or FASTA input parsing
- Export results to PDF

---

## 👨‍💻 Author
**Satyam Kumar Mishra**  
Java Developer | Web Dev Enthusiast
