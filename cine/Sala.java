package cine;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Sala {
    private Butaca[][] butacas;
    private int filas;
    private int columnas;
    private DBManager dbManager;

    public Sala(int filas, int columnas, DBManager dbManager) {
        this.filas = filas;
        this.columnas = columnas;
        this.dbManager = dbManager;
        butacas = new Butaca[filas][columnas];

        dbManager.inicializarSala(filas, columnas);
        cargarButacasDesdeBD();
    }

    private void cargarButacasDesdeBD() {
    try {
        // Inicializar todas las butacas como disponibles por defecto
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                butacas[i][j] = new Butaca(); // Crear instancia de Butaca
            }
        }

        // Cargar las butacas desde la base de datos
        ResultSet rs = dbManager.obtenerButacas();
        while (rs.next()) {
            int fila = rs.getInt("fila");
            int columna = rs.getInt("columna");
            boolean disponible = rs.getBoolean("disponible");
            if (fila < filas && columna < columnas) {
                if (!disponible) {
                    butacas[fila][columna].ocupar();
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


    public void ocuparButaca(int fila, int columna) {
        butacas[fila][columna].ocupar();
        dbManager.actualizarButaca(fila, columna, false); // Actualizar en la base de datos
    }

    public boolean isDisponible(int fila, int columna) {
        return butacas[fila][columna].isDisponible();
    }
}
