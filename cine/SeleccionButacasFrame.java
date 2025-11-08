package cine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SeleccionButacasFrame extends JFrame {

    private Sala sala;
    private JButton[][] botones;
    private int filas = 5;
    private int columnas = 5;

    // Variables para mostrar la información de la película
    private JLabel lblImagenPelicula;
    private JLabel lblNombrePelicula;
    private JLabel lblFormato;
    private JLabel lblIdioma;
    private JLabel lblCine;
    private JLabel lblFecha;
    private JLabel lblHora;
    private JLabel lblSala;
    private JTextArea txtButacasSeleccionadas;
    private JButton btnContinuar; // Botón "Continuar"

    // Simulación de datos seleccionados previamente
    private String pelicula = "Avengers: Endgame";
    private String formato = "3D";
    private String idioma = "Español";
    private String cine = "Cinepolis Centro";
    private String fecha = "2024-12-01";
    private String hora = "18:00";
    private String salaSeleccionada = "1";

    // Contador de butacas seleccionadas
    private int totalButacasSeleccionadas = 0;

    public SeleccionButacasFrame(DBManager dbManager) {
        sala = new Sala(filas, columnas, dbManager);
        botones = new JButton[filas][columnas];

        setTitle("Seleccionar Butacas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Pantalla completa

        // Paneles principales
        JPanel panelIzquierdo = crearPanelIzquierdo();
        JPanel panelDerecho = crearPanelDerecho();

        // Usar un JSplitPane para dividir la ventana
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelIzquierdo, panelDerecho);
        splitPane.setDividerLocation(400); // Ajustar tamaño de la división
        splitPane.setEnabled(false); // Bloquear el ajuste manual
        add(splitPane);

        setVisible(true);
    }

    private JPanel crearPanelIzquierdo() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.LIGHT_GRAY);

        // Imagen de la película
        lblImagenPelicula = new JLabel(new ImageIcon(getClass().getResource("/imagenes/Batman.jpg")));
        lblImagenPelicula.setHorizontalAlignment(SwingConstants.CENTER);
        lblImagenPelicula.setPreferredSize(new Dimension(300, 300)); // Ajustar tamaño
        panel.add(lblImagenPelicula, BorderLayout.NORTH);

        // Información de la película
        JPanel infoPanel = new JPanel(new GridLayout(7, 1, 5, 15)); // Separación entre elementos
        infoPanel.setBackground(Color.LIGHT_GRAY);

        lblNombrePelicula = new JLabel("Película: " + pelicula);
        lblFormato = new JLabel("Formato: " + formato);
        lblIdioma = new JLabel("Idioma: " + idioma);
        lblCine = new JLabel("Cine: " + cine);
        lblFecha = new JLabel("Fecha: " + fecha);
        lblHora = new JLabel("Hora: " + hora);
        lblSala = new JLabel("Sala: " + salaSeleccionada);

        // Estilo para los textos
        for (JLabel label : new JLabel[]{lblNombrePelicula, lblFormato, lblIdioma, lblCine, lblFecha, lblHora, lblSala}) {
            label.setFont(new Font("Arial", Font.BOLD, 14));
            label.setHorizontalAlignment(SwingConstants.CENTER); // Centrar el texto
            infoPanel.add(label);
        }

        // Botón "Continuar"
        btnContinuar = new JButton("Continuar");
        btnContinuar.setFont(new Font("Arial", Font.BOLD, 14));
        btnContinuar.setBackground(new Color(50, 150, 250));
        btnContinuar.setForeground(Color.WHITE);
        btnContinuar.addActionListener(e -> {
            if (totalButacasSeleccionadas > 0) {
                // Guardar las butacas seleccionadas en la base de datos
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (botones[i][j].getBackground() == Color.YELLOW) {
                            sala.ocuparButaca(i, j); // Marca la butaca como ocupada en la base de datos
                            botones[i][j].setBackground(Color.RED); // Actualiza el estado visual
                            botones[i][j].setEnabled(false); // Deshabilita el botón
                        }
                    }
                }
                JOptionPane.showMessageDialog(this, "Selección guardada con éxito.");
                // Abrir la siguiente pantalla y cerrar la actual
                new FrmEntradas(pelicula, formato, idioma, cine, fecha, hora, salaSeleccionada, totalButacasSeleccionadas);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, selecciona al menos una butaca.");
            }
        });

        JPanel contenedorBoton = new JPanel();
        contenedorBoton.setBackground(Color.LIGHT_GRAY);
        contenedorBoton.add(btnContinuar);

        // Agregar información y botón al panel izquierdo
        panel.add(infoPanel, BorderLayout.CENTER);
        panel.add(contenedorBoton, BorderLayout.SOUTH);

        return panel;
    }

    private JPanel crearPanelDerecho() {
        JPanel panel = new JPanel(new BorderLayout());

        // Pantalla del cine
        JLabel pantalla = new JLabel("PANTALLA", SwingConstants.CENTER);
        pantalla.setOpaque(true);
        pantalla.setBackground(Color.BLACK);
        pantalla.setForeground(Color.WHITE);
        pantalla.setFont(new Font("Arial", Font.BOLD, 16));
        pantalla.setPreferredSize(new Dimension(0, 30));

        // Panel de selección de butacas
        JPanel panelButacas = new JPanel(new GridBagLayout());
        panelButacas.setBackground(Color.DARK_GRAY);
        inicializarBotones(panelButacas);

        // Leyenda y selección
        JPanel panelInferior = new JPanel(new GridLayout(2, 1, 5, 5));
        panelInferior.setBackground(Color.LIGHT_GRAY);

        JPanel leyendaPanel = new JPanel(new FlowLayout());
        leyendaPanel.setBackground(Color.LIGHT_GRAY);

        // Leyenda con colores
        leyendaPanel.add(crearEtiquetaLeyenda("Disponible", Color.GREEN));
        leyendaPanel.add(crearEtiquetaLeyenda("Seleccionada", Color.YELLOW));
        leyendaPanel.add(crearEtiquetaLeyenda("Ocupada", Color.RED));

        txtButacasSeleccionadas = new JTextArea();
        txtButacasSeleccionadas.setEditable(false);
        txtButacasSeleccionadas.setBackground(Color.WHITE);
        txtButacasSeleccionadas.setFont(new Font("Arial", Font.PLAIN, 14));
        txtButacasSeleccionadas.setBorder(BorderFactory.createTitledBorder("Butacas seleccionadas:"));

        panelInferior.add(leyendaPanel);
        panelInferior.add(new JScrollPane(txtButacasSeleccionadas));

        // Agregar componentes al lado derecho
        panel.add(pantalla, BorderLayout.NORTH);
        panel.add(panelButacas, BorderLayout.CENTER);
        panel.add(panelInferior, BorderLayout.SOUTH);

        return panel;
    }

    private JPanel crearEtiquetaLeyenda(String texto, Color color) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel colorLabel = new JLabel();
        colorLabel.setOpaque(true);
        colorLabel.setBackground(color);
        colorLabel.setPreferredSize(new Dimension(20, 20));
        panel.add(colorLabel);

        JLabel textoLabel = new JLabel(texto);
        textoLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        panel.add(textoLabel);

        return panel;
    }

    private void inicializarBotones(JPanel panelButacas) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                String etiqueta = (char) ('A' + i) + String.valueOf(j + 1); // Etiquetas: A1, A2, etc.
                JButton btn = new JButton(etiqueta);
                btn.setPreferredSize(new Dimension(50, 50));
                btn.setFont(new Font("Arial", Font.BOLD, 12));

                if (!sala.isDisponible(i, j)) {
                    btn.setEnabled(false);
                    btn.setBackground(Color.RED);
                } else {
                    btn.setBackground(Color.GREEN);
                    btn.addActionListener(new ButacaActionListener(i, j, etiqueta));
                }

                botones[i][j] = btn;
                gbc.gridx = j;
                gbc.gridy = i;
                panelButacas.add(btn, gbc);
            }
        }
    }

    private class ButacaActionListener implements ActionListener {

        private int fila;
        private int columna;
        private String etiqueta;

        public ButacaActionListener(int fila, int columna, String etiqueta) {
            this.fila = fila;
            this.columna = columna;
            this.etiqueta = etiqueta;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            if (btn.getBackground() == Color.GREEN) {
                btn.setBackground(Color.YELLOW);
                txtButacasSeleccionadas.append(etiqueta + ", ");
                totalButacasSeleccionadas++; // Incrementar el total de butacas seleccionadas
            } else {
                btn.setBackground(Color.GREEN);
                txtButacasSeleccionadas.setText(txtButacasSeleccionadas.getText().replace(etiqueta + ", ", ""));
                totalButacasSeleccionadas--; // Decrementar el total de butacas seleccionadas
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SeleccionButacasFrame(
                new DBManager("localhost", "bd_peliculas", "root", "Katiaalfa*2024")
        ));
    }
}
