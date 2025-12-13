
package dsafinals.healthyqueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class dashboard extends javax.swing.JFrame {
    
    private String userEmail; // store the logged-in user's email
    private static final Logger logger = Logger.getLogger(dashboard.class.getName());
    private final List<String> orders = new ArrayList<>();
    
    // GUI components
    private JPanel Main, DashBtnPanel, MenuPanel;
    private JButton OrderBtn, ViewBtn, ReceiptBtn, ExitBtn;
    private JLabel Icon, JMenu;
    private JPanel FoodPanel1, FoodPanel2, FoodPanel3, FoodPanel4, FoodPanel5, FoodPanel6;
    private JLabel OmeletteM1, OmeletteM2, OmeletteM3, OmeletteM4;
    private JLabel Price1, Price2, Price3, Price4, Price5, Price6;
    private JLabel RamenM2, RamenM3;
    private JSpinner Spinner1, Spinner2, Spinner3, Spinner4, Spinner5, Spinner6;
    private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6;

   // Default constructor
    public dashboard() {
        initComponents();
    }

    // Constructor with user email
    public dashboard(String email) {
        this.userEmail = email;
        initComponents();
        welcomeUser();
    }

   private void welcomeUser() {
        JOptionPane.showMessageDialog(this, "Welcome " + userEmail + "!");
    }
    
   private void addOrder(String itemName, int qty, int price) {
        if (qty <= 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid quantity!");
            return;
        }

        int total = qty * price;
        String text = itemName + " x" + qty + " = ₱" + total;
        orders.add(text);
        JOptionPane.showMessageDialog(this, "Added to order:\n" + text);
    }

    private void addOrderFromSpinner(String itemName, int qty, int price) {
        if (qty > 0) {
            addOrder(itemName, qty, price);
        }
    }

    private void viewOrders() {
        if (orders.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No orders yet!");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (String o : orders) {
            sb.append(o).append("\n");
        }

        JOptionPane.showMessageDialog(this, "Your Orders:\n\n" + sb);
    }

    private void clearOrders() {
        orders.clear();
        JOptionPane.showMessageDialog(this, "All orders cancelled!");
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Initialize panels
        Main = new JPanel();
        DashBtnPanel = new JPanel();
        MenuPanel = new JPanel();

        // Initialize buttons
        OrderBtn = new JButton("Order");
        ViewBtn = new JButton("View Order");
        ReceiptBtn = new JButton("Receipt");
        ExitBtn = new JButton("Exit");{
    orders.clear();
    javax.swing.JOptionPane.showMessageDialog(this, "All orders cancelled!");
    
    // Initialize labels
        Icon = new JLabel("Icon");
        JMenu = new JLabel("Meal Menu");
        OmeletteM1 = new JLabel("Omelette Rice");
        OmeletteM2 = new JLabel("Oatmeal");
        OmeletteM3 = new JLabel("Salmon");
        OmeletteM4 = new JLabel("Ginataan");
        RamenM2 = new JLabel("Ramen");
        RamenM3 = new JLabel("Stir Fry");
        Price1 = new JLabel("₱35");
        Price2 = new JLabel("₱50");
        Price3 = new JLabel("₱40");
        Price4 = new JLabel("₱20");
        Price5 = new JLabel("₱30");
        Price6 = new JLabel("₱40");
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();

        // Initialize spinners
        Spinner1 = new JSpinner();
        Spinner2 = new JSpinner();
        Spinner3 = new JSpinner();
        Spinner4 = new JSpinner();
        Spinner5 = new JSpinner();
        Spinner6 = new JSpinner();
        
         // Configure Main panel
        Main.setPreferredSize(new java.awt.Dimension(800, 500));
        Main.setLayout(null);

        // Configure DashBtnPanel
        DashBtnPanel.setBackground(new java.awt.Color(51, 153, 0));
        DashBtnPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DashBtnPanel.setBounds(0, 0, 120, 500);

        DashBtnPanel.add(OrderBtn);
        DashBtnPanel.add(ViewBtn);
        DashBtnPanel.add(ReceiptBtn);
        DashBtnPanel.add(ExitBtn);
        DashBtnPanel.add(Icon);

        Main.add(DashBtnPanel);

        // Configure MenuPanel
        MenuPanel.setBackground(new java.awt.Color(204, 204, 204));
        MenuPanel.setBounds(120, 0, 680, 50);
        Main.add(MenuPanel);

        // Add Food Panels (1-6)
        FoodPanel1 = new JPanel(); FoodPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder()); FoodPanel1.setBounds(180, 80, 250, 104); Main.add(FoodPanel1);
        FoodPanel2 = new JPanel(); FoodPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder()); FoodPanel2.setBounds(180, 220, 250, 105); Main.add(FoodPanel2);
        FoodPanel3 = new JPanel(); FoodPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder()); FoodPanel3.setBounds(180, 350, 250, 104); Main.add(FoodPanel3);
        FoodPanel4 = new JPanel(); FoodPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder()); FoodPanel4.setBounds(470, 80, 250, 105); Main.add(FoodPanel4);
        FoodPanel5 = new JPanel(); FoodPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder()); FoodPanel5.setBounds(470, 220, 250, 104); Main.add(FoodPanel5);
        FoodPanel6 = new JPanel(); FoodPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder()); FoodPanel6.setBounds(470, 350, 250, 105); Main.add(FoodPanel6);

        // JFrame setup
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        getContentPane().add(Main);
        pack();

        // Button actions
        OrderBtn.addActionListener(this::OrderBtnActionPerformed);
        ViewBtn.addActionListener(this::ViewBtnActionPerformed);
        ReceiptBtn.addActionListener(this::ReceiptBtnActionPerformed);
        ExitBtn.addActionListener(this::ExitBtnActionPerformed);
        
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

        DashBtnPanel.setBackground(new java.awt.Color(51, 153, 0));
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

        javax.swing.GroupLayout DashBtnPanelLayout = new javax.swing.GroupLayout(DashBtnPanel);
        DashBtnPanel.setLayout(DashBtnPanelLayout);
        DashBtnPanelLayout.setHorizontalGroup(
            DashBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashBtnPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DashBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ReceiptBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(ExitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(DashBtnPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(OrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        DashBtnPanelLayout.setVerticalGroup(
            DashBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
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
        
        orders.clear();

        addOrder("Omelette Rice", (Integer) Spinner1.getValue(), 35);
        addOrder("Ramen", (Integer) Spinner2.getValue(), 50);
        addOrder("Stir Fry", (Integer) Spinner3.getValue(), 40);
        addOrder("Oatmeal", (Integer) Spinner4.getValue(), 20);
        addOrder("Salmon", (Integer) Spinner5.getValue(), 30);
        addOrder("Ginataan", (Integer) Spinner6.getValue(), 40);

        Spinner1.setValue(0);
        Spinner2.setValue(0);
        Spinner3.setValue(0);
        Spinner4.setValue(0);
        Spinner5.setValue(0);
        Spinner6.setValue(0);

        if (orders.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No items selected!");
        } else {
            JOptionPane.showMessageDialog(this, "Order placed successfully!");
        }
    }//GEN-LAST:event_OrderBtnActionPerformed

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtnActionPerformed
        
        viewOrders();
        
    }//GEN-LAST:event_ViewBtnActionPerformed

    private void ReceiptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceiptBtnActionPerformed
        
        if (orders.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No orders to show on receipt!");
        return;
    }
    int totalAmount = 0;
    StringBuilder sb = new StringBuilder();
    for (String o : orders) {
        sb.append(o).append("\n");
        // extract price from string for total calculation
        String[] parts = o.split("₱");
        if (parts.length > 1) {
            totalAmount += Integer.parseInt(parts[1]);
        }
    }
    sb.append("\nTotal: ₱").append(totalAmount);
    JOptionPane.showMessageDialog(this, sb.toString(), "Receipt", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_ReceiptBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", 
                                                "Exit", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        clearOrders(); // Optional: clear orders on exit
        System.exit(0);
    }
        
    }//GEN-LAST:event_ExitBtnActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new dashboard("user@example.com").setVisible(true));
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
