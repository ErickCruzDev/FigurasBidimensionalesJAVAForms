package figurasbidimensionales;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FigurasBidimensionales extends JFrame implements ActionListener {

    private JComboBox figurasPosibles;
    private JButton btnEnviar;

    public FigurasBidimensionales() {
        setSize(500, 150);
        setTitle("Figuras Bidimencionales");
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        //Opciones del combobox
        String valores[] = {
            "a. Área cuadrado.",
            "b. Perímetro cuadrado.",
            "c. Área círculo.",
            "d. Perímetro círculo.",
            "e. Área triángulo.",
            "f. Perímetro triángulo.",
            "g. Área rectángulo.",
            "h. Perímetro rectángulo.",
            "i. Área rombo.",
            "j. Perímetro rombo.",
            "k. Área pentágono.",
            "l. Perímetro pentágono."
        };

        //instanciando las clases
        figurasPosibles = new JComboBox(valores);
        btnEnviar = new JButton();

        getContentPane().setLayout(null);

        //combobox
        getContentPane().add(figurasPosibles);
        figurasPosibles.setBounds(10, 10, 200, 30);

        //boton
        btnEnviar.setText("Iniciar calculo");
        btnEnviar.setMnemonic('I');
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(230, 10, 200, 30);

        btnEnviar.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                salirDeAplicacion(evt);
            }
        }
        );
    }

    private void salirDeAplicacion(WindowEvent evt) {
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String seleccionUsuario = (String) figurasPosibles.getSelectedItem();
        DecimalFormat df = new DecimalFormat("#.00");
        CalculosBidimensionales cb = new CalculosBidimensionales();

        switch (seleccionUsuario) {
            case "a. Área cuadrado.":
                try {
                    double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Base:"));
                    JOptionPane.showMessageDialog(null, "Área cuadrado: " + cb.areaCuadrado(base));
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "Error en ingreso de datos");
                }
            break;
            case "b. Perímetro cuadrado.":
                try {
                    double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Lado:"));
                    JOptionPane.showMessageDialog(null, "Perímetro cuadrado: " + cb.perimetroCuadrado(lado));
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "Error en ingreso de datos");
                }
            break;
            case "c. Área círculo.":
                try {
                    double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Radio:"));
                    JOptionPane.showMessageDialog(null, "Área círculo: " + df.format(cb.areaCirculo(radio)));
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "Error en ingreso de datos");
                }
            break;
            case "d. Perímetro círculo.":
                try {
                    double radioPP = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Radio:"));
                    JOptionPane.showMessageDialog(null, "Perímetro círculo: " + df.format(cb.perimetroCirculo(radioPP)));
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "Error en ingreso de datos");
                }
            break;
            case "e. Área triángulo.":
                try {
                    double baseTri = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Base:"));
                    double alturaTri = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Altura:"));
                    JOptionPane.showMessageDialog(null, "Área triángulo: " + cb.areaTriangulo(baseTri, alturaTri));
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "Error en ingreso de datos");
                }
            break;
            case "f. Perímetro triángulo.":
                try {
                    double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Lado 1:"));
                    double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Lado 2:"));
                    double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Lado 3:"));
                    JOptionPane.showMessageDialog(null, "Perímetro triángulo: " + cb.perimetroTriangulo(lado1, lado2, lado3));
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "Error en ingreso de datos");
                }
            break;
            case "g. Área rectángulo.":
                try {
                    double baseRec = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Base:"));
                    double alturaRec = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Altura:"));
                    JOptionPane.showMessageDialog(null, "Área rectángulo: " + cb.areaRectangulo(baseRec, alturaRec));
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "Error en ingreso de datos");
                }
            break;
            case "h. Perímetro rectángulo.":
                try {
                    double largoPrec = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Largo:"));
                    double anchoPrec = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Ancho:"));
                    JOptionPane.showMessageDialog(null, "Perímetro rectángulo: " + cb.perimetroRectangulo(largoPrec, anchoPrec));
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "Error en ingreso de datos");
                }
            break;
            case "i. Área rombo.":
                try {
                    double diagonal1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Diagonal 1:"));
                    double diagonal2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Diagonal 2:"));
                    JOptionPane.showMessageDialog(null, "Área rombo: " + cb.areaRombo(diagonal1, diagonal2));
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "Error en ingreso de datos");
                }
            break;
            case "j. Perímetro rombo.":
                try {
                    double n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese N1:"));
                    JOptionPane.showMessageDialog(null, "Perímetro rombo: " + cb.perimetroRombo(n1));
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "Error en ingreso de datos");
                }
            break;
            case "k. Área pentágono.":
                try {
                    double ladoPen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Lado:"));
                    double radioPen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Radio:"));
                    double apotemaPen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Apotema:"));
                    JOptionPane.showMessageDialog(null, "Área pentágono: " + cb.areaPentagono(ladoPen, radioPen, apotemaPen));
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "Error en ingreso de datos");
                }
            break;
            case "l. Perímetro pentágono.":
                try {
                    double longitudPerPen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Longitud:"));
                    double ladoPerPen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Lado:"));
                    JOptionPane.showMessageDialog(null, "Perímetro pentágono: " + cb.perimetroPentagono(longitudPerPen, ladoPerPen));
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "Error en ingreso de datos");
                }
            break;
        }
    }
    public static void main(String[] args) {
        new FigurasBidimensionales().setVisible(true);
    }
}