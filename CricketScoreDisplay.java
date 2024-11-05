import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class CricketScoreDisplay extends javax.swing.JFrame {

    JLabel L1;
    public CricketScoreDisplay() {
        initComponents();
    }

    @SuppressWarnings("unchecked")                
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel("TEAM 1");
        jLabel2 = new javax.swing.JLabel("TEAM 2");
        tone = new javax.swing.JTextField();
        ttwo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel("Toss WON BY");
        jRadioButton1 = new javax.swing.JRadioButton("TEAM 1");
        jRadioButton2 = new javax.swing.JRadioButton("TEAM 2");
        jLabel4 = new javax.swing.JLabel("CHOSE TO.");
        jRadioButton3 = new javax.swing.JRadioButton("BAT");
        jRadioButton4 = new javax.swing.JRadioButton("BALL");
        jLabel5 = new javax.swing.JLabel("OVERS");
        jRadioButton5 = new javax.swing.JRadioButton("20-20");
        jRadioButton6 = new javax.swing.JRadioButton("50 (ODI)");
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton("1");
        jButton2 = new javax.swing.JButton("2");
        jButton3 = new javax.swing.JButton("3");
        jButton4 = new javax.swing.JButton("4");
        jButton5 = new javax.swing.JButton("5");
        jButton6 = new javax.swing.JButton("6");
        jButton7 = new javax.swing.JButton("NO BALL");
        jButton8 = new javax.swing.JButton("WIDE");
        jButton9 = new javax.swing.JButton("BIES");
        jButton10 = new javax.swing.JButton("WICKET");
        jButton11 = new javax.swing.JButton("0");
        in = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        run = new javax.swing.JTextField();
        wik = new javax.swing.JTextField();
        ovrd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel("RUNS");
        jLabel7 = new javax.swing.JLabel("WICKETS");
        jLabel8 = new javax.swing.JLabel("OVERS");
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel("SCORE");
        ter = new javax.swing.JTextField();
        tert = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel("I");
        jLabel12 = new javax.swing.JLabel("II");
        jLabel10 = new javax.swing.JLabel("CRICKET SCORE DISPLAY");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.textHighlight);
        setForeground(new java.awt.Color(0, 0, 0));
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\83749\\Downloads\\1.jpg")));
        setLayout(new FlowLayout());
        L1 =new JLabel();
        add(L1);
        setSize(3840,2610);

        jPanel1.setBackground(java.awt.Color.orange);
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        
        jLabel2.setBackground(new java.awt.Color(0, 255, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
       
        tone.setBackground(new java.awt.Color(153, 153, 153));
        tone.setFont(new java.awt.Font("Tahoma", 1, 14));

        ttwo.setBackground(new java.awt.Color(153, 153, 153));
        ttwo.setFont(new java.awt.Font("Tahoma", 1, 14));

        jLabel3.setBackground(new java.awt.Color(0, 255, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        
        jRadioButton1.setBackground(java.awt.Color.lightGray);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14));
        
        jRadioButton2.setBackground(java.awt.Color.lightGray);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14));
        

        jLabel4.setBackground(new java.awt.Color(0, 255, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        
        jRadioButton3.setBackground(java.awt.Color.lightGray);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 14));
        

        jRadioButton4.setBackground(java.awt.Color.lightGray);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 14));

        jLabel5.setBackground(new java.awt.Color(0, 255, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));

        jRadioButton5.setBackground(java.awt.Color.lightGray);
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setBackground(java.awt.Color.white);
        jRadioButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ttwo, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(tone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1))))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel5))
                    .addComponent(jRadioButton5))
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ttwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton4))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel2.setBackground(java.awt.Color.green);
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        jButton1.setBackground(java.awt.Color.lightGray);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(java.awt.Color.lightGray);
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton2.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(java.awt.Color.lightGray);
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton3.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(java.awt.Color.lightGray);
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton4.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(java.awt.Color.lightGray);
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton5.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(java.awt.Color.lightGray);
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton6.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(java.awt.Color.lightGray);
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton7.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(java.awt.Color.lightGray);
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton8.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(java.awt.Color.lightGray);
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton9.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(java.awt.Color.lightGray);
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton10.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(java.awt.Color.lightGray);
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton11.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        in.setBackground(new java.awt.Color(153, 153, 153));
        in.setFont(new java.awt.Font("Tahoma", 1, 24));
        in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(in, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton8)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton9))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jButton4)
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton5))
                                            .addGap(21, 21, 21)
                                            .addComponent(jButton6))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jButton1)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton2)
                                            .addGap(21, 21, 21)
                                            .addComponent(jButton3)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(in, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(26, 26, 26)
                .addComponent(jButton11)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(18, 18, 18)
                .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jPanel3.setBackground(java.awt.Color.pink);
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        run.setEditable(false);
        run.setBackground(new java.awt.Color(153, 153, 153));
        run.setFont(new java.awt.Font("Tahoma", 1, 18));

        wik.setEditable(false);
        wik.setBackground(new java.awt.Color(153, 153, 153));
        wik.setFont(new java.awt.Font("Tahoma", 1, 18));

        ovrd.setEditable(false);
        ovrd.setBackground(new java.awt.Color(153, 153, 153));
        ovrd.setFont(new java.awt.Font("Tahoma", 1, 18));

        jLabel6.setBackground(new java.awt.Color(0, 255, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel7.setBackground(new java.awt.Color(0, 255, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel8.setBackground(new java.awt.Color(0, 255, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(wik, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(ovrd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(run))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(run, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ovrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel4.setBackground(java.awt.Color.yellow);
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        jLabel9.setBackground(new java.awt.Color(0, 255, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24));

        ter.setEditable(false);
        ter.setBackground(new java.awt.Color(153, 153, 153));
        ter.setFont(new java.awt.Font("Tahoma", 1, 24));
        ter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terActionPerformed(evt);
            }
        });

        tert.setBackground(new java.awt.Color(153, 153, 153));
        tert.setFont(new java.awt.Font("Tahoma", 1, 24));

        jLabel11.setBackground(new java.awt.Color(0, 255, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12));

        jLabel12.setBackground(new java.awt.Color(0, 255, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); 

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(10, 10, 10)
                .addComponent(ter, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(tert, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(ter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tert))
                .addContainerGap())
        );

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 48));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel10)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        pack();
    }                       
    
    int ovr,tr=0,tw=0,to=0,b=0,a=0,bb=0,c=0,ovrt;
  
    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        ovr=120;
        ovrt=ovr;
         in.setText("INNINGS ONE");
         
    }                                             

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        ovr=300;
        ovrt=ovr;
         in.setText("INNINGS ONE");
         
    }                                             
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        tr=tr+1;
        
       
       b=b+1;
       bb=bb+1;
       if(b==6)
       {
           a=a+1;
           b=0;
       }
       if(bb<=ovr&&b<6&&tw<11)
               {
                  
          run.setText(""+tr);     
       ovrd.setText(""+a);
       
       
               }
      if(bb==ovr)
       {
           bb=0;
           ovr=ovrt;
           in.setText("INNINGS TWO");
           if(c==0)
           {
           ter.setText(""+tr);
           c=1;
           }
           else
           {
               tert.setText(""+tr);
           }
           tr=0;tw=0;to=0;b=0;a=0;
           run.setText("");
           wik.setText("");
           ovrd.setText("");
       }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       tr=tr+2;
        
       
       b=b+1;
       bb=bb+1;
       if(b==6)
       {
           a=a+1;
           b=0;
       }
       if(bb<=ovr&&b<6&&tw<11)
               {
                  
          run.setText(""+tr);     
       ovrd.setText(""+a);
    }                                        
   
    if(bb==ovr)
       {
            bb=0;
           ovr=120;
           in.setText("INNINGS TWO");
           if(c==0)
           {
           ter.setText(""+tr);
           c=1;
           }
           else
           {
               tert.setText(""+tr);
           }
           tr=0;tw=0;to=0;b=0;a=0;
           run.setText("");
           wik.setText("");
           ovrd.setText("");
       }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       tr=tr+3;
        
       
       b=b+1;
       bb=bb+1;
       if(b==6)
       {
           a=a+1;
           b=0;
       }
       if(bb<=ovr&&b<6&&tw<11)
               {
                  
          run.setText(""+tr);     
       ovrd.setText(""+a);
    }                                        
  if(bb==ovr)
       {
           bb=0;
           ovr=ovrt;
           in.setText("INNINGS TWO");
           if(c==0)
           {
           ter.setText(""+tr);
           c=1;
           }
           else
           {
               tert.setText(""+tr);
           }
           tr=0;tw=0;to=0;b=0;a=0;
           run.setText("");
           wik.setText("");
           ovrd.setText("");
       }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        tr=tr+4;
        
       
       b=b+1;
       bb=bb+1;
       if(b==6)
       {
           a=a+1;
           b=0;
       }
       if(bb<=ovr&&b<6&&tw<11)
               {
                  
          run.setText(""+tr);     
       ovrd.setText(""+a);
    }                                        
   if(bb==ovr)
       {
           bb=0;
           ovr=ovrt;
           in.setText("INNINGS TWO");
           if(c==0)
           {
           ter.setText(""+tr);
           c=1;
           }
           else
           {
               tert.setText(""+tr);
           }
           tr=0;tw=0;to=0;b=0;a=0;
           run.setText("");
           wik.setText("");
           ovrd.setText("");
       }
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       tr=tr+5;
        
       
       b=b+1;
       bb=bb+1;
       if(b==6)
       {
           a=a+1;
           b=0;
       }
       if(bb<=ovr&&b<6&&tw<11)
               {
                  
          run.setText(""+tr);     
       ovrd.setText(""+a);
    }                                        
   
    if(bb==ovr)
       {
           bb=0;
           ovr=ovrt;
           in.setText("INNINGS TWO");
           if(c==0)
           {
           ter.setText(""+tr);
           c=1;
           }
           else
           {
               tert.setText(""+tr);
           }
           tr=0;tw=0;to=0;b=0;a=0;
           run.setText("");
           wik.setText("");
           ovrd.setText("");
       }
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       tr=tr+6;
        
       
       b=b+1;
       bb=bb+1;
       if(b==6)
       {
           a=a+1;
           b=0;
       }
       if(bb<=ovr&&b<6&&tw<11)
               {
                  
          run.setText(""+tr);     
       ovrd.setText(""+a);
    }                                        
   if(bb==ovr)
       {
            bb=0;
           ovr=ovrt;
           in.setText("INNINGS TWO");
           if(c==0)
           {
           ter.setText(""+tr);
           c=1;
           }
           else
           {
               tert.setText(""+tr);
           }
           tr=0;tw=0;to=0;b=0;a=0;
           run.setText("");
           wik.setText("");
           ovrd.setText("");
       }
    }
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       tr=tr+0;
        
       
       b=b+1;
       bb=bb+1;
       if(b==6)
       {
           a=a+1;
           b=0;
       }
       if(bb<=ovr&&b<6&&tw<11)
               {
                  
          run.setText(""+tr);     
       ovrd.setText(""+a);
    }                                         
if(bb==ovr)
       {
            bb=0;
           ovr=ovrt;
           in.setText("INNINGS TWO");
           if(c==0)
           {
           ter.setText(""+tr);
           c=1;
           }
           else
           {
               tert.setText(""+tr);
           }
           tr=0;tw=0;to=0;b=0;a=0;
           run.setText("");
           wik.setText("");
           ovrd.setText("");
       }  
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        tr=tr+1;
        run.setText(""+tr);  
        if(a==ovr)
       {
           ter.setText(""+tr);
       }
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        tr=tr+1;
        run.setText(""+tr);
        if(a==ovr)
       {
           ter.setText(""+tr);
       }
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        tr=tr+1;
        
       
       b=b+1;
       bb=bb+1;
       if(b==6)
       {
           a=a+1;
           b=0;
       }
       if(bb<=ovr&&b<6&&tw<11)
               {
                  
          run.setText(""+tr);     
       ovrd.setText(""+a);
       
       
               }
     if(bb==ovr)
       {
          bb=0;
           ovr=ovrt;
           in.setText("INNINGS TWO");
           if(c==0)
           {
           ter.setText(""+tr);
           c=1;
           }
           else
           {
               tert.setText(""+tr);
           }
           tr=0;tw=0;to=0;b=0;a=0;
           run.setText("");
           wik.setText("");
           ovrd.setText("");
       }
    }                                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        tw=tw+1;
        if(tw<=10)
        {
        wik.setText(""+tw);
        }
        
         b=b+1;
         bb=bb+1;
       if(b==6)
       {
           a=a+1;
           b=0;
       }
       if(bb<=ovr&&b<6&&tw<11)
               {
                  
          run.setText(""+tr);     
       ovrd.setText(""+a);
       
       
               }
       if(bb==ovr||tw>=10)
       {
            bb=0;
           ovr=ovrt;
           in.setText("INNINGS TWO");
           if(c==0)
           {
           ter.setText(""+tr);
           c=1;
           c++;
           
           }
           else
           {
               tert.setText(""+tr);
           }
           tr=0;tw=0;to=0;b=0;a=0;
           run.setText("");
           wik.setText("");
           ovrd.setText("");
       }
       
    }                                         

    private void terActionPerformed(java.awt.event.ActionEvent evt) {                                    

    }                                   

    private void inActionPerformed(java.awt.event.ActionEvent evt) {                                   

    }                                  
    
    public static void main(String args[]) {
        new CricketScoreDisplay();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CricketScoreDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CricketScoreDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CricketScoreDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CricketScoreDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CricketScoreDisplay().setVisible(true);
            }
        });
    }
                
    private javax.swing.JTextField in;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JTextField ovrd;
    private javax.swing.JTextField run;
    private javax.swing.JTextField ter;
    private javax.swing.JTextField tert;
    private javax.swing.JTextField tone;
    private javax.swing.JTextField ttwo;
    private javax.swing.JTextField wik;
                    
}