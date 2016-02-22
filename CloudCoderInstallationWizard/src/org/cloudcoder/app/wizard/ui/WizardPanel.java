package org.cloudcoder.app.wizard.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.cloudcoder.app.wizard.model.Document;

public class WizardPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private Document document;

	public WizardPanel() {
		setPreferredSize(new Dimension(800, 600));

		setLayout(new BorderLayout());
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton prevButton = new JButton("<< Previous");
		JButton nextButton = new JButton("Next >>");
		buttonPanel.add(prevButton);
		buttonPanel.add(nextButton);
		buttonPanel.setPreferredSize(new Dimension(800, 40));
		add(buttonPanel, BorderLayout.PAGE_END);
	}

	public void setDocument(Document document) {
		this.document = document;
		// FIXME: for now, just add a single WizardPagePanel for the first Page
		WizardPagePanel panel = new WizardPagePanel();
		panel.setPage(document.get(1));
		add(panel, BorderLayout.CENTER);
	}
}
