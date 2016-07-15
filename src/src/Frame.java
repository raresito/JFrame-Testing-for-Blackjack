package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class Frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{170, 170, 170, 170, 0};
		gbl_contentPane.rowHeights = new int[]{187, 0, 27, 164, 19, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		
		ImageIcon cardBack = new ImageIcon(getClass().getResource("Card-Back.png"));
		//Must move to separate Resource Folder 
		JLabel lblDeckimage = new JLabel(new ImageIcon(cardBack.getImage().getScaledInstance(230, 310, java.awt.Image.SCALE_SMOOTH)));
		panel.add(lblDeckimage);
		
		
		int tablePanelwidth = gbl_contentPane.columnWidths[1]+gbl_contentPane.columnWidths[2]+gbl_contentPane.columnWidths[3];
		int tablePanelheight = gbl_contentPane.rowHeights[0];
		ImageIcon dealerTable = new ImageIcon(getClass().getResource("dealer-table.jpg"));
		JLabel lblDealerimage = new JLabel(new ImageIcon(dealerTable.getImage().getScaledInstance(tablePanelwidth, tablePanelheight, java.awt.Image.SCALE_DEFAULT)));
		GridBagConstraints gbc_lblDealerimage = new GridBagConstraints();
		gbc_lblDealerimage.gridwidth = 3;
		gbc_lblDealerimage.insets = new Insets(0, 0, 5, 0);
		gbc_lblDealerimage.gridx = 1;
		gbc_lblDealerimage.gridy = 0;
		contentPane.add(lblDealerimage, gbc_lblDealerimage);
		
		JLabel lblDeck = new JLabel("Deck");
		GridBagConstraints gbc_lblDeck = new GridBagConstraints();
		gbc_lblDeck.insets = new Insets(0, 0, 5, 5);
		gbc_lblDeck.gridx = 0;
		gbc_lblDeck.gridy = 1;
		contentPane.add(lblDeck, gbc_lblDeck);
		
		JLabel lblClientimg = new JLabel("Client1IMG");
		GridBagConstraints gbc_lblClientimg = new GridBagConstraints();
		gbc_lblClientimg.insets = new Insets(0, 0, 5, 5);
		gbc_lblClientimg.gridx = 0;
		gbc_lblClientimg.gridy = 3;
		contentPane.add(lblClientimg, gbc_lblClientimg);
		
		JLabel lblClientimg_2 = new JLabel("Client2IMG");
		GridBagConstraints gbc_lblClientimg_2 = new GridBagConstraints();
		gbc_lblClientimg_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblClientimg_2.gridx = 1;
		gbc_lblClientimg_2.gridy = 3;
		contentPane.add(lblClientimg_2, gbc_lblClientimg_2);
		
		JLabel lblClientimg_1 = new JLabel("Client3IMG");
		GridBagConstraints gbc_lblClientimg_1 = new GridBagConstraints();
		gbc_lblClientimg_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblClientimg_1.gridx = 2;
		gbc_lblClientimg_1.gridy = 3;
		contentPane.add(lblClientimg_1, gbc_lblClientimg_1);
		
		JLabel lblClientimg_3 = new JLabel("Client4IMG");
		GridBagConstraints gbc_lblClientimg_3 = new GridBagConstraints();
		gbc_lblClientimg_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblClientimg_3.gridx = 3;
		gbc_lblClientimg_3.gridy = 3;
		contentPane.add(lblClientimg_3, gbc_lblClientimg_3);
		
		JLabel lblClientlabel = new JLabel("Client1Label");
		GridBagConstraints gbc_lblClientlabel = new GridBagConstraints();
		gbc_lblClientlabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblClientlabel.gridx = 0;
		gbc_lblClientlabel.gridy = 4;
		contentPane.add(lblClientlabel, gbc_lblClientlabel);
		
		JButton btnHit = new JButton("HIT");
		GridBagConstraints gbc_btnHit = new GridBagConstraints();
		gbc_btnHit.insets = new Insets(0, 0, 0, 5);
		gbc_btnHit.gridx = 1;
		gbc_btnHit.gridy = 5;
		contentPane.add(btnHit, gbc_btnHit);
		
		JButton btnStand = new JButton("STAND");
		GridBagConstraints gbc_btnStand = new GridBagConstraints();
		gbc_btnStand.insets = new Insets(0, 0, 0, 5);
		gbc_btnStand.gridx = 2;
		gbc_btnStand.gridy = 5;
		contentPane.add(btnStand, gbc_btnStand);
		
		JLabel lblDeckImg = new JLabel();
		lblDeckImg.setIcon(new ImageIcon("http://www.hearthstonetopdecks.com/wp-content/uploads/2014/06/card-back-default.png"));
	}

}
