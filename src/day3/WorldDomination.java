package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String answer; 
answer=
JOptionPane.showInputDialog(null,  "Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.

if(answer.equals("yes")) {
JOptionPane.showMessageDialog(null, "Your gonna rule the world");
	
}
		// 3. Otherwise, wish them good luck washing dishes.
if(answer.equals("no")) {
JOptionPane.showMessageDialog(null, "Good luck");}
	}} 

