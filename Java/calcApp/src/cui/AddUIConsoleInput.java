package cui;

import java.io.*;
import businessRules.*;

public class AddUIConsoleInput {
    private InBoundary inBoundary;
    private PrintWriter stdOut;
    private BufferedReader stdIn;

    public AddUIConsoleInput(InBoundary inBoundary) {
        this.stdOut = new PrintWriter(System.out);
        this.stdIn = new BufferedReader(new InputStreamReader(System.in));
        this.inBoundary = inBoundary;
    }

    public void input() {
        String number1 = "";
        String number2 = "";
        
        try {
            this.stdOut.print("Input number1: ");
            this.stdOut.flush();
            number1 = this.stdIn.readLine();
            this.stdOut.print("Input number2: ");
            this.stdOut.flush();
            number2 = this.stdIn.readLine();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        RequestData requestData = new RequestData(number1, number2);
        this.inBoundary.execute(requestData);
    }
}
