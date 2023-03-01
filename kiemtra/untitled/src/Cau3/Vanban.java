package Cau3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Vanban {

    private String input;

    public Vanban() {
    }

    public Vanban(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    public int countWords(String input) {
        StringTokenizer stringTokenizer =new StringTokenizer(input);
        int countWords = stringTokenizer.countTokens();
        return countWords;
    }
    public String standard (String input){
        input.trim();
        input.replace("  "," ");
        return input;
    }
    public String upperCase (String input){
        return input.toUpperCase();
    }
    public String lowerCase (String input){
        return input.toLowerCase();
    }
    public String upperFirstChar (String input){
        String chucaidau = input.substring(0,1);
        String remainingLetters = input.substring(1, input.length());
        chucaidau = chucaidau.toUpperCase();
        input = chucaidau +remainingLetters;
        return input;
    }

    @Override
    public String toString() {
        return "Van ban sau khi sua doi [" +  input + "]";
    }
    public void nhapVanban(Scanner scanner) {
        System.out.print("Van ban: ");
        input = scanner.nextLine();
    }
}
