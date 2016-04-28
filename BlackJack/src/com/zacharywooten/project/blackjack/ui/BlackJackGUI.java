package com.zacharywooten.project.blackjack.ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.zacharywooten.project.blackjack.manager.BlackJackManager;

/**
 * The user interface to create and display the blackjack game on the screen.
 * @author Zachary Wooten
 * @version 1.0
 */
public class BlackJackGUI extends JFrame {
	
	/** The title at the top of the application window. */
	private static final String APP_TITLE = "BlackJack";
	/** The panel that holds the infoPanel and tablePanel. */
	private JPanel containerPanel;
	/** The panel that holds the information about the current game. */
	private InfoPanel infoPanel;
	/** The panel that displays the table and cards. */
	private TablePanel tablePanel;
	/** The container for the application. */
	private Container c;
	/** The BlackJackManager used to run the game model. */
	private BlackJackManager manager;
	
	public BlackJackGUI() {
		super();
	}
	
	public static void main(String[] args) {
		new BlackJackGUI();
	}
	
	private class InfoPanel extends JPanel implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class TablePanel extends JPanel implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
