package cine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmEntradas extends JFrame {

    private int totalButacas;
    private int entradasSeleccionadas = 0;

    private JLabel lblEntradasSeleccionadas;
    private JButton btnContinuar;

    private int entradasGenerales = 0;
    private int entradasMayores70 = 0;
    private int entradasNinos = 0;

    public FrmEntradas(String pelicula, String formato, String idioma, String cine, String fecha, String hora, String sala, int totalButacas) {
        this.totalButacas = totalButacas;

        setTitle("Seleccionar Entradas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Pantalla completa

        // Paneles principales
        JPanel panelIzquierdo = crearPanelIzquierdo(pelicula, formato, idioma, cine, fecha, hora, sala);
        JPanel panelDerecho = crearPanelDerecho();

        // Usar un JSplitPane para dividir la ventana
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelIzquierdo, panelDerecho);
        splitPane.setDividerLocation(400); // Ajustar tamaño de la división
        splitPane.setEnabled(false); // Bloquear el ajuste manual
        add(splitPane);

        setVisible(true);
    }

    private JPanel crearPanelIzquierdo(String pelicula, String formato, String idioma, String cine, String fecha, String hora, String sala) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.LIGHT_GRAY);

        // Imagen de la película
        JLabel lblImagenPelicula = new JLabel(new ImageIcon(getClass().getResource("/imagenes/Batman.jpg")));
        lblImagenPelicula.setHorizontalAlignment(SwingConstants.CENTER);
        lblImagenPelicula.setPreferredSize(new Dimension(300, 300)); // Ajustar tamaño
        panel.add(lblImagenPelicula, BorderLayout.NORTH);

        // Información de la película
        JPanel infoPanel = new JPanel(new GridLayout(7, 1, 5, 15)); // Separación entre elementos
        infoPanel.setBackground(Color.LIGHT_GRAY);

        JLabel lblNombrePelicula = new JLabel("Película: " + pelicula);
        JLabel lblFormato = new JLabel("Formato: " + formato);
        JLabel lblIdioma = new JLabel("Idioma: " + idioma);
        JLabel lblCine = new JLabel("Cine: " + cine);
        JLabel lblFecha = new JLabel("Fecha: " + fecha);
        JLabel lblHora = new JLabel("Hora: " + hora);
        JLabel lblSala = new JLabel("Sala: " + sala);
        JLabel lblButacas = new JLabel("Butacas seleccionadas: " + totalButacas);

        // Estilo para los textos
        for (JLabel label : new JLabel[]{lblNombrePelicula, lblFormato, lblIdioma, lblCine, lblFecha, lblHora, lblSala, lblButacas}) {
            label.setFont(new Font("Arial", Font.BOLD, 14));
            label.setHorizontalAlignment(SwingConstants.CENTER); // Centrar el texto
            infoPanel.add(label);
        }

        panel.add(infoPanel, BorderLayout.CENTER);
        return panel;
    }

    private JPanel crearPanelDerecho() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(245, 245, 245)); // Fondo gris claro para contraste

        JPanel opcionesPanel = new JPanel(new GridBagLayout());
        opcionesPanel.setBorder(BorderFactory.createTitledBorder("Selecciona tus entradas"));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Agregar las opciones de entradas al panel
        agregarOpcionEntrada(opcionesPanel, "General (20 soles)", "General", gbc, 0);
        agregarOpcionEntrada(opcionesPanel, "Mayores de 70 (10 soles)", "Mayor", gbc, 1);
        agregarOpcionEntrada(opcionesPanel, "Niños (10 soles)", "Niño", gbc, 2);

        lblEntradasSeleccionadas = new JLabel("Entradas seleccionadas: 0 de " + totalButacas, SwingConstants.CENTER);
        lblEntradasSeleccionadas.setFont(new Font("Arial", Font.BOLD, 18));
        lblEntradasSeleccionadas.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        btnContinuar = new JButton("Continuar");
        btnContinuar.setEnabled(false);
        btnContinuar.addActionListener(e -> JOptionPane.showMessageDialog(this, "¡Seleccionaste tus entradas con éxito!"));
        btnContinuar.setBackground(new Color(50, 150, 250));
        btnContinuar.setForeground(Color.WHITE);
        btnContinuar.setFont(new Font("Arial", Font.BOLD, 16));
        btnContinuar.setPreferredSize(new Dimension(200, 50)); // Botón grande
        btnContinuar.setFocusPainted(false);

        panel.add(opcionesPanel, BorderLayout.CENTER);
        panel.add(lblEntradasSeleccionadas, BorderLayout.NORTH);
        panel.add(btnContinuar, BorderLayout.SOUTH);

        return panel;
    }

    private void agregarOpcionEntrada(JPanel panel, String descripcion, String tipo, GridBagConstraints gbc, int fila) {
        JLabel lblDescripcion = new JLabel(descripcion);
        lblDescripcion.setFont(new Font("Arial", Font.PLAIN, 16));

        JPanel botonesPanel = crearBotonesEntrada(tipo);

        gbc.gridx = 0;
        gbc.gridy = fila;
        gbc.weightx = 0.6;
        panel.add(lblDescripcion, gbc);

        gbc.gridx = 1;
        gbc.weightx = 0.4;
        panel.add(botonesPanel, gbc);
    }

    private JPanel crearBotonesEntrada(String tipo) {
        JPanel panel = new JPanel(new GridLayout(1, 3, 10, 10));
        panel.setBackground(Color.WHITE);

        JButton btnIncrementar = new JButton("+");
        JButton btnDecrementar = new JButton("-");
        JLabel lblCantidad = new JLabel("0", SwingConstants.CENTER);

        // Configurar estilo de botones
        estilizarBoton(btnIncrementar);
        estilizarBoton(btnDecrementar);

        lblCantidad.setFont(new Font("Arial", Font.BOLD, 18));
        lblCantidad.setOpaque(true);
        lblCantidad.setBackground(Color.LIGHT_GRAY);
        lblCantidad.setPreferredSize(new Dimension(60, 40)); // Tamaño fijo para alineación

        btnIncrementar.addActionListener(e -> {
            if (entradasSeleccionadas < totalButacas) {
                entradasSeleccionadas++;
                actualizarCantidad(lblCantidad, tipo, 1);
            }
        });

        btnDecrementar.addActionListener(e -> {
            if (entradasSeleccionadas > 0 && Integer.parseInt(lblCantidad.getText()) > 0) {
                entradasSeleccionadas--;
                actualizarCantidad(lblCantidad, tipo, -1);
            }
        });

        panel.add(btnDecrementar);
        panel.add(lblCantidad);
        panel.add(btnIncrementar);

        return panel;
    }

    private void estilizarBoton(JButton boton) {
        boton.setFont(new Font("Arial", Font.BOLD, 18));
        boton.setBackground(new Color(100, 200, 100)); // Verde vibrante
        boton.setForeground(Color.WHITE);
        boton.setPreferredSize(new Dimension(60, 40)); // Botón grande
        boton.setFocusPainted(false);
        boton.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2, true)); // Bordes redondeados
    }

    private void actualizarCantidad(JLabel lblCantidad, String tipo, int cambio) {
        int cantidadActual = Integer.parseInt(lblCantidad.getText()) + cambio;
        lblCantidad.setText(String.valueOf(cantidadActual));

        switch (tipo) {
            case "General":
                entradasGenerales += cambio;
                break;
            case "Mayor":
                entradasMayores70 += cambio;
                break;
            case "Niño":
                entradasNinos += cambio;
                break;
        }

        lblEntradasSeleccionadas.setText("Entradas seleccionadas: " + entradasSeleccionadas + " de " + totalButacas);
        btnContinuar.setEnabled(entradasSeleccionadas == totalButacas);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FrmEntradas(
                "Avengers: Endgame", "3D", "Español", "Cinepolis Centro", "2024-12-01", "18:00", "1", 5
        ));
    }
}
