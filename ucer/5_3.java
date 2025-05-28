import java.io.*;

class FileMerge {

    public static void mergeFiles(String file1, String file2, String mergedFile) {
        BufferedReader reader1 = null;
        BufferedReader reader2 = null;
        BufferedWriter writer = null;

        try {
            // Create readers for input files
            reader1 = new BufferedReader(new FileReader(file1));
            reader2 = new BufferedReader(new FileReader(file2));

            // Create writer for output file
            writer = new BufferedWriter(new FileWriter(mergedFile));

            String line;

            // Read from first file and write to merged file
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Read from second file and write to merged file
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Files merged successfully into: " + mergedFile);

        } catch (FileNotFoundException e) {
            System.out.println("Error: One of the input files was not found.");
        } catch (IOException e) {
            System.out.println("Error reading or writing files: " + e.getMessage());
        } finally {
            // Close all resources safely
            try {
                if (reader1 != null) reader1.close();
                if (reader2 != null) reader2.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.out.println("Error closing files: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        // Replace these with your actual file paths or names
        String inputFile1 = "file1.txt";
        String inputFile2 = "file2.txt";
        String outputFile = "merged_output.txt";

        mergeFiles(inputFile1, inputFile2, outputFile);
    }
}

