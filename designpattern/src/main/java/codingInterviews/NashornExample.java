package codingInterviews;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornExample {
    public static void main(String[] args) {
        // Create a ScriptEngineManager instance and get the Nashorn engine
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

        // JavaScript code as a string
        String script = "var greeting = 'Hello, world!';" +
                        "var number = 42;" +
                        "greeting + ' The number is ' + number;";

        try {
            // Evaluate the script and print the result
            Object result = engine.eval(script);
            System.out.println("Result: " + result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}