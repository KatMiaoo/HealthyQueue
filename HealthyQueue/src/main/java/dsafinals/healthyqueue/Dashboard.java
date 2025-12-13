
package dsafinals.healthyqueue;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.HashMap;
import java.util.Map;

public class Dashboard extends javax.swing.JFrame {
    // store the logged-in user's email
    // store the logged-in user's email
    private static final Logger logger = Logger.getLogger(Dashboard.class.getName());
    private final List<String> orders = new ArrayList<>();
    private final List<String> pastPurchases = new ArrayList<>();
    private int grandTotal = 0;
    private final Map<String, String> foodDescriptions = new HashMap<>();
    
    
    private void setupFoodDescriptions() {
    foodDescriptions.put("Omelette Rice", "Calories: 350 kcal | Protein-rich meal");
    foodDescriptions.put("Ramen", "Calories: 450 kcal | High energy noodles");
    foodDescriptions.put("Stir Fry", "Calories: 300 kcal | Balanced vegetables & protein");
    foodDescriptions.put("Oatmeal", "Calories: 180 kcal | High fiber, healthy choice");
    foodDescriptions.put("Salmon", "Calories: 250 kcal | Omega-3 rich");
    foodDescriptions.put("Ginataan", "Calories: 320 kcal | Coconut-based dish");
}

    // GUI components
   // Default constructor
    public Dashboard() {
        
        initComponents();
        setupSpinners(); 
        setupFoodDescriptions();
    
    }

    // Constructor with user email
    public Dashboard(String email) {
        
    initComponents();
    setupSpinners();
    setupFoodDescriptions();
    
    }
    
    private void clearOrdersSilent() {
        
    orders.clear();
    grandTotal = 0;
    
}
 
   private void addOrder(String itemName, int qty, int price) {
        if (qty <= 0) return;

    int total = qty * price;
    String description = foodDescriptions.getOrDefault(itemName, "No description available");

    // Keep description only for orders list (used in View Orders)
    orders.add(
        itemName + " x" + qty +
        " = ₱" + total +
        "\n   " + description
    );

    grandTotal += total;
    
    }



    
    private void setupSpinners() {
    Spinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
    Spinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
    Spinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
    Spinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
    Spinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
    Spinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
    
}
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        DashBtnPanel = new javax.swing.JPanel();
        OrderBtn = new javax.swing.JButton();
        ViewBtn = new javax.swing.JButton();
        ReceiptBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        Icon = new javax.swing.JLabel();
        PurchaseBtn = new javax.swing.JButton();
        MenuPanel = new javax.swing.JPanel();
        JMenu = new javax.swing.JLabel();
        FoodPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        OmeletteM4 = new javax.swing.JLabel();
        Price6 = new javax.swing.JLabel();
        Spinner6 = new javax.swing.JSpinner();
        FoodPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        OmeletteM1 = new javax.swing.JLabel();
        Price1 = new javax.swing.JLabel();
        Spinner1 = new javax.swing.JSpinner();
        FoodPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        RamenM2 = new javax.swing.JLabel();
        Price2 = new javax.swing.JLabel();
        Spinner2 = new javax.swing.JSpinner();
        FoodPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        RamenM3 = new javax.swing.JLabel();
        Price3 = new javax.swing.JLabel();
        Spinner3 = new javax.swing.JSpinner();
        FoodPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        OmeletteM2 = new javax.swing.JLabel();
        Price4 = new javax.swing.JLabel();
        Spinner4 = new javax.swing.JSpinner();
        FoodPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        OmeletteM3 = new javax.swing.JLabel();
        Price5 = new javax.swing.JLabel();
        Spinner5 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");

        Main.setPreferredSize(new java.awt.Dimension(800, 500));
        Main.setLayout(null);

        DashBtnPanel.setBackground(new java.awt.Color(102, 153, 0));
        DashBtnPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DashBtnPanel.setPreferredSize(new java.awt.Dimension(120, 500));

        OrderBtn.setText("Order");
        OrderBtn.addActionListener(this::OrderBtnActionPerformed);

        ViewBtn.setText("View Order");
        ViewBtn.setPreferredSize(new java.awt.Dimension(72, 23));
        ViewBtn.addActionListener(this::ViewBtnActionPerformed);

        ReceiptBtn.setText("Receipt");
        ReceiptBtn.addActionListener(this::ReceiptBtnActionPerformed);

        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(this::ExitBtnActionPerformed);

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoNoBGmeduim.png"))); // NOI18N
        Icon.setText("Icon");

        PurchaseBtn.setText("Purchase");
        PurchaseBtn.addActionListener(this::PurchaseBtnActionPerformed);

        javax.swing.GroupLayout DashBtnPanelLayout = new javax.swing.GroupLayout(DashBtnPanel);
        DashBtnPanel.setLayout(DashBtnPanelLayout);
        DashBtnPanelLayout.setHorizontalGroup(
            DashBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DashBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DashBtnPanelLayout.createSequentialGroup()
                        .addComponent(Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(DashBtnPanelLayout.createSequentialGroup()
                        .addGroup(DashBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ExitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addGroup(DashBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ReceiptBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ViewBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OrderBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PurchaseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
                        .addGap(0, 8, Short.MAX_VALUE))))
        );
        DashBtnPanelLayout.setVerticalGroup(
            DashBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(PurchaseBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OrderBtn)
                .addGap(18, 18, 18)
                .addComponent(ViewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ReceiptBtn)
                .addGap(18, 18, 18)
                .addComponent(ExitBtn)
                .addGap(109, 109, 109))
        );

        Main.add(DashBtnPanel);
        DashBtnPanel.setBounds(0, 0, 120, 500);

        MenuPanel.setBackground(new java.awt.Color(204, 204, 204));

        JMenu.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        JMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JMenu.setText("Meal Menu");

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addComponent(JMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 540, Short.MAX_VALUE))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Main.add(MenuPanel);
        MenuPanel.setBounds(120, 0, 680, 50);

        FoodPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_1ginataan.png"))); // NOI18N
        jLabel6.setText("Image4");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        OmeletteM4.setText("Ginataan");

        Price6.setText("₱40");

        javax.swing.GroupLayout FoodPanel6Layout = new javax.swing.GroupLayout(FoodPanel6);
        FoodPanel6.setLayout(FoodPanel6Layout);
        FoodPanel6Layout.setHorizontalGroup(
            FoodPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FoodPanel6Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FoodPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OmeletteM4)
                    .addComponent(Price6)
                    .addComponent(Spinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 66, Short.MAX_VALUE))
        );
        FoodPanel6Layout.setVerticalGroup(
            FoodPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
            .addGroup(FoodPanel6Layout.createSequentialGroup()
                .addComponent(OmeletteM4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Price6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Spinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Main.add(FoodPanel6);
        FoodPanel6.setBounds(470, 350, 250, 105);

        FoodPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_omelette.png"))); // NOI18N
        jLabel1.setText("Image1");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        OmeletteM1.setText("Omelette Rice");

        Price1.setText("₱35");

        javax.swing.GroupLayout FoodPanel1Layout = new javax.swing.GroupLayout(FoodPanel1);
        FoodPanel1.setLayout(FoodPanel1Layout);
        FoodPanel1Layout.setHorizontalGroup(
            FoodPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FoodPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FoodPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OmeletteM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Price1)
                    .addComponent(Spinner1))
                .addGap(0, 70, Short.MAX_VALUE))
        );
        FoodPanel1Layout.setVerticalGroup(
            FoodPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FoodPanel1Layout.createSequentialGroup()
                .addComponent(OmeletteM1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Price1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Main.add(FoodPanel1);
        FoodPanel1.setBounds(180, 80, 250, 104);

        FoodPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_ramen.png"))); // NOI18N
        jLabel2.setText("Image2");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        RamenM2.setText("Ramen");

        Price2.setText("₱50");

        javax.swing.GroupLayout FoodPanel2Layout = new javax.swing.GroupLayout(FoodPanel2);
        FoodPanel2.setLayout(FoodPanel2Layout);
        FoodPanel2Layout.setHorizontalGroup(
            FoodPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FoodPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FoodPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RamenM2)
                    .addComponent(Price2)
                    .addComponent(Spinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 69, Short.MAX_VALUE))
        );
        FoodPanel2Layout.setVerticalGroup(
            FoodPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
            .addGroup(FoodPanel2Layout.createSequentialGroup()
                .addComponent(RamenM2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Price2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Spinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Main.add(FoodPanel2);
        FoodPanel2.setBounds(180, 220, 250, 105);

        FoodPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_1stirfry.png"))); // NOI18N
        jLabel3.setText("Image3");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        RamenM3.setText("Stir Fry");

        Price3.setText("₱40");

        javax.swing.GroupLayout FoodPanel3Layout = new javax.swing.GroupLayout(FoodPanel3);
        FoodPanel3.setLayout(FoodPanel3Layout);
        FoodPanel3Layout.setHorizontalGroup(
            FoodPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FoodPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FoodPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RamenM3)
                    .addComponent(Price3)
                    .addComponent(Spinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 70, Short.MAX_VALUE))
        );
        FoodPanel3Layout.setVerticalGroup(
            FoodPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FoodPanel3Layout.createSequentialGroup()
                .addComponent(RamenM3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Price3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Spinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Main.add(FoodPanel3);
        FoodPanel3.setBounds(180, 350, 250, 104);

        FoodPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_oatmeal.png"))); // NOI18N
        jLabel4.setText("Image4");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        OmeletteM2.setText("Oatmeal");

        Price4.setText("₱20");

        javax.swing.GroupLayout FoodPanel4Layout = new javax.swing.GroupLayout(FoodPanel4);
        FoodPanel4.setLayout(FoodPanel4Layout);
        FoodPanel4Layout.setHorizontalGroup(
            FoodPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FoodPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FoodPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OmeletteM2)
                    .addComponent(Price4)
                    .addComponent(Spinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 72, Short.MAX_VALUE))
        );
        FoodPanel4Layout.setVerticalGroup(
            FoodPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
            .addGroup(FoodPanel4Layout.createSequentialGroup()
                .addComponent(OmeletteM2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Price4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Spinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Main.add(FoodPanel4);
        FoodPanel4.setBounds(470, 80, 250, 105);

        FoodPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_salmon.png"))); // NOI18N
        jLabel5.setText("Image3");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        OmeletteM3.setText("Salmon");

        Price5.setText("₱30");

        javax.swing.GroupLayout FoodPanel5Layout = new javax.swing.GroupLayout(FoodPanel5);
        FoodPanel5.setLayout(FoodPanel5Layout);
        FoodPanel5Layout.setHorizontalGroup(
            FoodPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FoodPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FoodPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OmeletteM3)
                    .addComponent(Price5)
                    .addComponent(Spinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 66, Short.MAX_VALUE))
        );
        FoodPanel5Layout.setVerticalGroup(
            FoodPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FoodPanel5Layout.createSequentialGroup()
                .addComponent(OmeletteM3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Price5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Spinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Main.add(FoodPanel5);
        FoodPanel5.setBounds(470, 220, 250, 104);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderBtnActionPerformed

        int beforeSize = orders.size();

    addOrder("Omelette Rice", (Integer) Spinner1.getValue(), 35);
    addOrder("Ramen", (Integer) Spinner2.getValue(), 50);
    addOrder("Stir Fry", (Integer) Spinner3.getValue(), 40);
    addOrder("Oatmeal", (Integer) Spinner4.getValue(), 20);
    addOrder("Salmon", (Integer) Spinner5.getValue(), 30);
    addOrder("Ginataan", (Integer) Spinner6.getValue(), 40);

    // Reset spinner VALUES only (not models)
    Spinner1.setValue(0);
    Spinner2.setValue(0);
    Spinner3.setValue(0);
    Spinner4.setValue(0);
    Spinner5.setValue(0);
    Spinner6.setValue(0);

    if (orders.size() == beforeSize) {
        JOptionPane.showMessageDialog(this, "No items selected!");
    } else {
        JOptionPane.showMessageDialog(this, "Items added to order!");
    }
    
    }//GEN-LAST:event_OrderBtnActionPerformed

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtnActionPerformed
        
        if (orders.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No orders yet!");
        return;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < orders.size(); i++) {
        sb.append(i + 1).append(". ").append(orders.get(i)).append("\n");
    }

    sb.append("\nEnter the number of the item to remove, or Cancel to exit.");

    String input = JOptionPane.showInputDialog(this, sb.toString(), "Your Orders", JOptionPane.PLAIN_MESSAGE);

    if (input != null) {
        try {
            int index = Integer.parseInt(input) - 1;
            if (index >= 0 && index < orders.size()) {
                orders.remove(index);

                // recalculate grandTotal
                grandTotal = 0;
                for (String order : orders) {
                    String[] parts = order.split("= ₱");
                    if (parts.length > 1) {
                        String pricePart = parts[1].split("\n")[0].trim();
                        grandTotal += Integer.parseInt(pricePart);
                    }
                }

                JOptionPane.showMessageDialog(this, "Item removed!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid number!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number!");
        }
    }
    
    }//GEN-LAST:event_ViewBtnActionPerformed

    private void ReceiptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceiptBtnActionPerformed
        
        if (pastPurchases.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No past purchases!");
        return;
    }

    StringBuilder allReceipts = new StringBuilder();
    for (int i = 0; i < pastPurchases.size(); i++) {
        allReceipts.append("Purchase ").append(i + 1).append(":\n");
        allReceipts.append(pastPurchases.get(i)).append("\n\n");
    }

    JOptionPane.showMessageDialog(this, allReceipts.toString(), "Past Purchases", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_ReceiptBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        
         int confirm = JOptionPane.showConfirmDialog(
            this,
            "Are you sure you want to log out?",
            "Logout",
            JOptionPane.YES_NO_OPTION
    );

    if (confirm == JOptionPane.YES_OPTION) {
        this.dispose();     // close Dashboard only

        Login login = new Login();
        login.setLocationRelativeTo(null); // center Login
        login.setVisible(true);
    }
        
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void PurchaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurchaseBtnActionPerformed
        
        if (orders.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No items in your order to purchase!");
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(
        this,
        "Your total is ₱" + grandTotal + ". Do you want to complete the purchase?",
        "Confirm Purchase",
        JOptionPane.YES_NO_OPTION
    );

    if (confirm == JOptionPane.YES_OPTION) {
        StringBuilder receipt = new StringBuilder();
        receipt.append("Purchase Receipt:\n\n");

        for (String o : orders) {
            // Only show first line (without description)
            String line = o.split("\n")[0]; 
            receipt.append(line).append("\n");
        }

        receipt.append("\n------------------");
        receipt.append("\nTOTAL: ₱").append(grandTotal);

        pastPurchases.add(receipt.toString());

        JOptionPane.showMessageDialog(this, receipt.toString(), "Purchase Successful", JOptionPane.INFORMATION_MESSAGE);

        clearOrdersSilent();
    }
        
    }//GEN-LAST:event_PurchaseBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(() -> new Dashboard("user@example.com").setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DashBtnPanel;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JPanel FoodPanel1;
    private javax.swing.JPanel FoodPanel2;
    private javax.swing.JPanel FoodPanel3;
    private javax.swing.JPanel FoodPanel4;
    private javax.swing.JPanel FoodPanel5;
    private javax.swing.JPanel FoodPanel6;
    private javax.swing.JLabel Icon;
    private javax.swing.JLabel JMenu;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JLabel OmeletteM1;
    private javax.swing.JLabel OmeletteM2;
    private javax.swing.JLabel OmeletteM3;
    private javax.swing.JLabel OmeletteM4;
    private javax.swing.JButton OrderBtn;
    private javax.swing.JLabel Price1;
    private javax.swing.JLabel Price2;
    private javax.swing.JLabel Price3;
    private javax.swing.JLabel Price4;
    private javax.swing.JLabel Price5;
    private javax.swing.JLabel Price6;
    private javax.swing.JButton PurchaseBtn;
    private javax.swing.JLabel RamenM2;
    private javax.swing.JLabel RamenM3;
    private javax.swing.JButton ReceiptBtn;
    private javax.swing.JSpinner Spinner1;
    private javax.swing.JSpinner Spinner2;
    private javax.swing.JSpinner Spinner3;
    private javax.swing.JSpinner Spinner4;
    private javax.swing.JSpinner Spinner5;
    private javax.swing.JSpinner Spinner6;
    private javax.swing.JButton ViewBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
