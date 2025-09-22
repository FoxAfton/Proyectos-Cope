package tareas.contacto_cope;

import javax.swing.*;
import java.awt.*;

public class PanelTareas extends JPanel {
    private JPanel panelPrincipal;
    private JTextField JT_Añdir_Tarea;
    private JTextField JT_añadirPestaña;
    private JButton jButtonAñadirPestaña;
    private JTabbedPane jTabbed;

    public PanelTareas(JTabbedPane jTabbed) {
        this.jTabbed = jTabbed;
        initPanel();
    }

    private void initPanel() {
        this.setLayout(new BorderLayout());

        // Panel principal con tareas
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
        JScrollPane scroll = new JScrollPane(panelPrincipal);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        this.add(scroll, BorderLayout.CENTER);

        // Campo para añadir tarea
        JT_Añdir_Tarea = new JTextField("+ Añadir Tarea");
        JT_Añdir_Tarea.setPreferredSize(new Dimension(700, 34));
        JT_Añdir_Tarea.addActionListener(e -> {
            String texto = JT_Añdir_Tarea.getText().trim();
            if (!texto.isEmpty()) {
                MiPanelPersonalizado todo = new MiPanelPersonalizado();
                todo.setTarea(texto);
                todo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 60));
                addTarea(todo);
                JT_Añdir_Tarea.setText("");
            }
        });

        // Panel inferior para añadir pestaña y campo tarea
        JPanel panelInferior = new JPanel(new BorderLayout());
        JPanel panelAñadirPestaña = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JT_añadirPestaña = new JTextField("Añadir Pestaña", 15);
        jButtonAñadirPestaña = new JButton("Añadir Pestaña");
        jButtonAñadirPestaña.addActionListener(e -> {
            String titulo = JT_añadirPestaña.getText().trim();
            if (titulo.isEmpty()) titulo = "Pestaña " + (jTabbed.getTabCount() + 1);

            PanelTareas nueva = new PanelTareas(jTabbed);
            jTabbed.addTab(titulo, nueva);
            jTabbed.setSelectedComponent(nueva);
        });

        panelAñadirPestaña.add(JT_añadirPestaña);
        panelAñadirPestaña.add(jButtonAñadirPestaña);

        panelInferior.add(panelAñadirPestaña, BorderLayout.NORTH);
        panelInferior.add(JT_Añdir_Tarea, BorderLayout.SOUTH);
        this.add(panelInferior, BorderLayout.SOUTH);
    }

    public void addTarea(MiPanelPersonalizado tarea) {
        panelPrincipal.add(tarea);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }
}