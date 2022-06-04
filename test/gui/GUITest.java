package gui;

import org.junit.Test;

import java.awt.*;
import javax.swing.*;

public class GUITest {
	@Test
	public void testMyFrame() {
		EventQueue.invokeLater(() -> {
			var frame = new MyFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}
