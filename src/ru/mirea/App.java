package ru.mirea;

import java.util.Scanner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
  private static final Scanner IN = new Scanner(System.in);
  private static final String FILE = "/home/ezhik/Documents/Java-MIREA/labs/Java-MIREA-lab-8/out.txt";

  public static void main(String[] args) throws IOException {
    System.out.print("Что записать в файл: ");
    String line = IN.nextLine();

    FileWriter fw = new FileWriter(new File(FILE));
    fw.write(line);

    fw.close();
  }
}
