package myjava.homework;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keypad {
	
	private BufferedReader br;
	
	// initializes 
	public Keypad() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	/*
	 *  This function may throw some Exception if the user enters non-integer input.
	 *  You must use try...catch to deal with it.
	 */
	public int getInput() {
	    Keypad keypad = new Keypad();
		/* Fill your code here */
		try{
		    int tmpint =  Integer.parseInt(keypad.br.readLine());
		    /*System.out.println(tmpint);*/
		    return tmpint;
        }catch (Exception e){
            return -1;
        }
	}
	
}
