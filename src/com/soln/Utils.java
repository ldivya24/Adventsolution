package com.soln;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Utils {

    public static ArrayList<String> readFile(String filename) {
        ArrayList<String> res = new ArrayList<>();
        try {
            File file = new File(filename);
            FileInputStream fileStream = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileStream));
            String line;
            try {
                while ((line = reader.readLine()) != null) {
                    res.add(line);
                }
            } catch (IOException e) {
                System.out.printf(e.getMessage());
            }
        }
        catch (FileNotFoundException e) {
            System.out.printf(e.getMessage());
        }
        return res;
    }
}
