// COMP254 Lab 3 - Exercise 3
// Code by Kadin Chawah

import java.io.File;

public class FileFinder {

    // Recursive file search
    public static void find(File path, String filename) {

        if (path == null || !path.exists())  // Base case: invalid path
            return;

        if (path.isDirectory()) {  // If current path is a directory
            File[] files = path.listFiles();

            if (files != null) {
                for (File file : files) {
                    find(file, filename);  // Recursive call
                }
            }
        } else {  // If it's a file
            if (path.getName().equals(filename)) {
                System.out.println("File found: " + path.getAbsolutePath());
            }
        }
    }

    
    
    
    
    public static void main(String[] args) {

        // select a filepath on any computer.
        File startingPath = new File("C:\\Users\\Owner\\OneDrive\\Desktop\\College");

        String targetFile = "1.mathnotes.txt";

        find(startingPath, targetFile);
    }
}
