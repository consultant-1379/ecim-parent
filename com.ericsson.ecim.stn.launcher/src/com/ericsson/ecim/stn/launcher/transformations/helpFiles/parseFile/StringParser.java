package com.ericsson.ecim.stn.launcher.transformations.helpFiles.parseFile;

import java.util.Scanner;

public class StringParser {
    
    //TypeWithValue methods
    public static String removeNextTypeWithValue(String line) {
        int start = line.indexOf("\"");
        if(start == -1) return null;
        start = line.indexOf("\"", start+1);
        if(start == -1) {
            System.out.println("ERROR, WILL INF LOOP IN REMOVE NEXT TAG for: " + line);
            while(true); //TODO Debugging
        }
        if(line.substring(start+1).startsWith(">")) return null;
        return line.substring(++start);
    }
    
    
    //Type Methods
    public static String getOnlyType(String line) {
        int start = line.indexOf("<");
        int stop = line.indexOf("/>");
        if(stop == -1) stop = line.indexOf(">");
        if(start == -1 || stop == -1) return null;
        if(line.substring(start, stop).contains(" ")) return null;
        return line.substring(++start,stop);
    }
    public static String getFirstType(String line) {
        int start = line.indexOf("<");
        int stop = line.indexOf(" ", start);
        if(start == -1 || stop == -1) return null;
        return line.substring(++start, stop);
    }
    public static String getNextType(String line) {
        int start = line.indexOf(" ");
        int stop = line.indexOf("=");
        if(start == -1 || stop == -1) return null;
        return line.substring(++start, stop);
    }    

    public static String removeOnlyType(String line) {
        int start = line.indexOf(">");
        if(start == -1) return null;
        return line.substring(++start);
    }    
    public static String removeFirstType(String line) {
        int start = line.indexOf("<");
        if(start == -1) return null;
        start = line.indexOf(" ", start);
        if(start == -1) return null;
        return line.substring(start);
    }
    public static String removeEndTag(String line) {
        int end = line.lastIndexOf("<");
        if(end == -1) return null;
        else return line.substring(0, end);
    }
    
    
    //Value Methods
    public static String getOnlyValue(Scanner file, String line) {
        line = removeOnlyType(line);
        String endTag = "</";
        return fixValue(file, line, endTag);
    }
    public static String getOnlyValue(String line) {
        String value = StringParser.removeOnlyType(line);
        value = StringParser.removeEndTag(value);
        value = StringParser.fixValue(value);
        return value;
    }
    public static String getNextValue(String line) {
        int start = line.indexOf("\"");
        int stop = line.indexOf("\"", start+1);
        if(start == -1 || stop == -1) return null;
        return StringParser.fixValue(line.substring(++start, stop));
    }    
    public static String getSpecifiedValue(String line, String type) {
        int start = line.indexOf(type);
        if(start == -1) return null;
        start = line.indexOf("\"", start);
        int stop = line.indexOf("\"", start+1);
        if(start == -1 || stop == -1) return null;
        return StringParser.fixValue(line.substring(++start,stop));
    }

    
    //Help Methods
    
    private static String fixValue(Scanner file, String line, String endTag) {
        String fixedLines = "";
        while(!line.contains(endTag)) {
            fixedLines += StringParser.fixValue(line);
            line = file.nextLine();
        }
        fixedLines += StringParser.fixValue(StringParser.removeEndTag(line));
        return fixedLines;
    }
    private static String fixValue(String line) {
        String fixedLine = "";
        int index = 0;
        while(index<line.length()) {
            if(line.startsWith("&#10;", index)) {        //Unicode for ??
                index += 5;
            }
            else if(line.startsWith("&#13;", index)) {    //Unicode for '\n'
                fixedLine += "\n";
                index += 5;
            }
            else if(line.startsWith("&#9;", index)) {    //Unicode for '\t'
                fixedLine += "\t";
                index += 4;
            }
            else if(line.startsWith("&lt;", index)) {    //Unicode for '<'
                fixedLine += "<";
                index += 4;
            }
            else if(line.startsWith("&gt;", index)) {    //Unicode for '>'
                fixedLine += ">";
                index += 4;
            }
            else if(line.startsWith("&quot;", index)) {    //Unicode for '"'
                fixedLine += "\"";
                index += 6;
            }
            else if(line.startsWith("&amp;", index)) {    //Unicode for '&'
                fixedLine += "&";
                index += 5;
            }
            else if(line.startsWith("â€“", index)) {
                fixedLine += "-";
                index += 3;
            }
            else if(line.startsWith("â€œ", index)) {    //Unicode for '“' //TODO Changed to " instead of “
                fixedLine += "\"";
                index += 3;
            }

            else if(line.startsWith("â€", index)) {    //Unicode for '”' //TODO Changed to " instead of ”
                fixedLine += "\"";
                index += 3;
            }
            //TODO More Unicode?
            else fixedLine += line.charAt(index++);
        }
        return fixedLine;
    }
    
    


    
    
    
}
