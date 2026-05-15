package lab13;
	import javax.swing.*;
	import java.awt.*;

	public class DensityUI extends JFrame {
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JTextField txtMass, txtVolume, txtResult;
	    private JComboBox<String> comboDensityUnit;
	    private JTextArea areaAnswer;

	    public DensityUI() {
	        setTitle("Density Calculator");
	        setSize(450, 500);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new BorderLayout(10, 10));

	        JPanel topPanel = new JPanel(new GridLayout(2, 1));
	        topPanel.add(new JLabel("Density Calculator", JLabel.CENTER));
	        JLabel lblFormula = new JLabel("ρ = m / V", JLabel.CENTER);
	        lblFormula.setFont(new Font("Serif", Font.ITALIC, 28));
	        topPanel.add(lblFormula);
	        add(topPanel, BorderLayout.NORTH);

	        JPanel centerPanel = new JPanel(new GridLayout(3, 3, 10, 10));
	        centerPanel.add(new JLabel("density ρ = "));
	        txtResult = new JTextField("calculated density");
	        txtResult.setEditable(false);
	        centerPanel.add(txtResult);
	        comboDensityUnit = new JComboBox<>(new String[]{"g/cm³", "kg/m³"});
	        centerPanel.add(comboDensityUnit);

	        centerPanel.add(new JLabel("mass m = "));
	        txtMass = new JTextField();
	        centerPanel.add(txtMass);
	        centerPanel.add(new JLabel("g"));

	        centerPanel.add(new JLabel("volume V = "));
	        txtVolume = new JTextField();
	        centerPanel.add(txtVolume);
	        centerPanel.add(new JLabel("cm³"));

	        add(centerPanel, BorderLayout.CENTER);

	        JPanel bottomPanel = new JPanel(new BorderLayout());
	        JButton btnCalculate = new JButton("Calculate");
	        areaAnswer = new JTextArea(4, 20);
	        areaAnswer.setBorder(BorderFactory.createTitledBorder("Answer:"));
	        
	        bottomPanel.add(btnCalculate, BorderLayout.NORTH);
	        bottomPanel.add(new JScrollPane(areaAnswer), BorderLayout.SOUTH);
	        add(bottomPanel, BorderLayout.SOUTH);

	        btnCalculate.addActionListener(e -> {
	            try {
	                processCalculation();
	            } catch (InvalidInputException ex) {
	                JOptionPane.showMessageDialog(this, ex.getMessage(), "Оролтын алдаа", JOptionPane.WARNING_MESSAGE);
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(this, "Зөвхөн тоон утга оруулна уу!", "Төрлийн алдаа", JOptionPane.ERROR_MESSAGE);
	            }
	        });
	    }

	    private void processCalculation() throws InvalidInputException {
	        String mStr = txtMass.getText();
	        String vStr = txtVolume.getText();

	        if (mStr.isEmpty() || vStr.isEmpty()) {
	            throw new InvalidInputException("Утгуудыг бүрэн бөглөнө үү!");
	        }

	        double mass = Double.parseDouble(mStr);
	        double volume = Double.parseDouble(vStr);

	        if (volume == 0) {
	            throw new InvalidInputException("Эзлэхүүн 0 байж болохгүй! (0-д хуваах алдаа)");
	        }
	        if (mass < 0 || volume < 0) {
	            throw new InvalidInputException("Масс эсвэл эзлэхүүн хасах утгатай байж болохгүй!");
	        }

	        double density = mass / volume;
	        txtResult.setText(String.format("%.2f", density));
	        areaAnswer.setText("Нягт амжилттай тооцоологдлоо.\nҮр дүн: " + String.format("%.2f", density) + " " + comboDensityUnit.getSelectedItem());
	    }
	}

