package tareas.contacto_cope;

import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public class MiPanelPersonalizado extends JPanel {
    private JPanel jPanel2;
    private JPanel jPanelCheck;
    private JLabel jLabelCheck;
    private JTextField jTextFieldTarea;
    private boolean completado = false;

    public MiPanelPersonalizado() {
        initComponents();
        // Listener para togglear tachado
        jPanelCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toggleCompletado();
            }
        });
    }

    private void initComponents() {
        jPanel2 = new JPanel();
        jPanelCheck = new JPanel();
        jLabelCheck = new JLabel();
        jTextFieldTarea = new JTextField();

        // Panel principal
        jPanel2.setBackground(new Color(102, 102, 102));
        jPanel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Panel check
        jPanelCheck.setBackground(new Color(51, 51, 51));
        jPanelCheck.setBorder(BorderFactory.createLineBorder(new Color(102, 102, 102)));
        jLabelCheck.setText("  ✓");
        jPanelCheck.add(jLabelCheck);

        // JTextField tarea
        jTextFieldTarea.setBackground(new Color(102, 102, 102));
        jTextFieldTarea.setForeground(new Color(204, 204, 204));
        jTextFieldTarea.setBorder(null);

        // Layout horizontal del panel
        GroupLayout layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelCheck, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldTarea, GroupLayout.PREFERRED_SIZE, 556, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jPanelCheck, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldTarea)
        );

        // Layout del panel principal
        GroupLayout mainLayout = new GroupLayout(this);
        this.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
    }

    private void toggleCompletado() {
        completado = !completado;
        Font font = jTextFieldTarea.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        if (completado) attributes.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
        else attributes.remove(TextAttribute.STRIKETHROUGH);
        jTextFieldTarea.setFont(font.deriveFont(attributes));
    }

    public void setTarea(String tarea) {
        jTextFieldTarea.setText(tarea);
    }
}