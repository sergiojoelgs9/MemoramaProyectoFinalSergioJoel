/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Sergio
 */
public class Interfaz_GamePlay extends javax.swing.JFrame {

private boolean caraUp = false;
private ImageIcon im1;
private ImageIcon im2;
private JButton[] pbtn = new JButton[2];
private boolean primerc = false;
private int puntaje = 0;
private int tiempo=0;
private int inicio=30;
private Board fondo;
private Validar log = new Validar();
  
  public boolean isCaraUp() {
        return caraUp;
    }

    public void setCaraUp(boolean caraUp) {
        this.caraUp = caraUp;
    }

    public ImageIcon getIm1() {
        return im1;
    }

    public void setIm1(ImageIcon im1) {
        this.im1 = im1;
    }

    public ImageIcon getIm2() {
        return im2;
    }

    public void setIm2(ImageIcon im2) {
        this.im2 = im2;
    }

    public JButton[] getPbtn() {
        return pbtn;
    }

    public void setPbtn(JButton[] pbtn) {
        this.pbtn = pbtn;
    }

    public boolean isPrimerc() {
        return primerc;
    }

    public void setPrimerc(boolean primerc) {
        this.primerc = primerc;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public Board getFondo() {
        return fondo;
    }

    public void setFondo(Board fondo) {
        this.fondo = fondo;
    }

    public Validar getLog() {
        return log;
    }

    public void setLog(Validar log) {
        this.log = log;
    }

    public javax.swing.JButton getReiniciarhijito() {
        return SaliJuego;
    }

    public void setReiniciarhijito(javax.swing.JButton Reiniciarhijito) {
        this.SaliJuego = Reiniciarhijito;
    }

    public javax.swing.JButton getA1() {
        return a1;
    }

    public void setA1(javax.swing.JButton a1) {
        this.a1 = a1;
    }

    public javax.swing.JButton getA10() {
        return a10;
    }

    public void setA10(javax.swing.JButton a10) {
        this.a10 = a10;
    }

    public javax.swing.JButton getA11() {
        return a11;
    }

    public void setA11(javax.swing.JButton a11) {
        this.a11 = a11;
    }

    public javax.swing.JButton getA12() {
        return a12;
    }

    public void setA12(javax.swing.JButton a12) {
        this.a12 = a12;
    }

    public javax.swing.JButton getA13() {
        return a13;
    }

    public void setA13(javax.swing.JButton a13) {
        this.a13 = a13;
    }

    public javax.swing.JButton getA14() {
        return a14;
    }

    public void setA14(javax.swing.JButton a14) {
        this.a14 = a14;
    }

    public javax.swing.JButton getA15() {
        return a15;
    }

    public void setA15(javax.swing.JButton a15) {
        this.a15 = a15;
    }

    public javax.swing.JButton getA16() {
        return a16;
    }

    public void setA16(javax.swing.JButton a16) {
        this.a16 = a16;
    }

    public javax.swing.JButton getA2() {
        return a2;
    }

    public void setA2(javax.swing.JButton a2) {
        this.a2 = a2;
    }

    public javax.swing.JButton getA3() {
        return a3;
    }

    public void setA3(javax.swing.JButton a3) {
        this.a3 = a3;
    }

    public javax.swing.JButton getA4() {
        return a4;
    }

    public void setA4(javax.swing.JButton a4) {
        this.a4 = a4;
    }

    public javax.swing.JButton getA5() {
        return a5;
    }

    public void setA5(javax.swing.JButton a5) {
        this.a5 = a5;
    }

    public javax.swing.JButton getA6() {
        return a6;
    }

    public void setA6(javax.swing.JButton a6) {
        this.a6 = a6;
    }

    public javax.swing.JButton getA7() {
        return a7;
    }

    public void setA7(javax.swing.JButton a7) {
        this.a7 = a7;
    }

    public javax.swing.JButton getA8() {
        return a8;
    }

    public void setA8(javax.swing.JButton a8) {
        this.a8 = a8;
    }

    public javax.swing.JButton getA9() {
        return a9;
    }

    public void setA9(javax.swing.JButton a9) {
        this.a9 = a9;
    }

    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }
    
    public Interfaz_GamePlay() {
        initComponents();
         
         Thread t=new Thread(new Runnable(){
        Mensaje msj=new Mensaje();

            @Override
           
            public void run() {
             while(true){
                 try {
                     Thread.sleep(1000);
                        getjLabel3().setText(""+getInicio());
                        setInicio(getInicio()-1);
                     if(getInicio()==0){
                      msj.setVisible(true);
                         dispose();
                     }
                          
                     
                      } catch (InterruptedException ex) {
                     Logger.getLogger(Interfaz_GamePlay.class.getName()).log(Level.SEVERE, null, ex);
                     msj.setVisible(true);
                 }
             }
            }
            
        });
              t.start();
        fondo = new Board(getWidth(), getHeight());
        add(fondo, BorderLayout.CENTER);
        setCards();
    }       
    
    private void setCards() {
        int[] numbers = log.getCardNumbers();
        
        String ruta="../imagenes/c";
        String png=".png";
        
        
        a1.setDisabledIcon(new ImageIcon(getClass().getResource(ruta+numbers[0]+png)));
        a2.setDisabledIcon(new ImageIcon(getClass().getResource(ruta+numbers[1]+png)));
        a3.setDisabledIcon(new ImageIcon(getClass().getResource(ruta+numbers[2]+png)));
        a4.setDisabledIcon(new ImageIcon(getClass().getResource(ruta+numbers[3]+png)));
        a5.setDisabledIcon(new ImageIcon(getClass().getResource(ruta+numbers[4]+png)));
        a6.setDisabledIcon(new ImageIcon(getClass().getResource(ruta+numbers[5]+png)));
        a7.setDisabledIcon(new ImageIcon(getClass().getResource(ruta+numbers[6]+png)));
        a8.setDisabledIcon(new ImageIcon(getClass().getResource(ruta+numbers[7]+png)));
        a9.setDisabledIcon(new ImageIcon(getClass().getResource(ruta+numbers[8]+png)));
        a10.setDisabledIcon(new ImageIcon(getClass().getResource(ruta+numbers[9]+png)));
        a11.setDisabledIcon(new ImageIcon(getClass().getResource(ruta+numbers[10]+png)));
        a12.setDisabledIcon(new ImageIcon(getClass().getResource(ruta+numbers[11]+png)));
        a13.setDisabledIcon(new ImageIcon(getClass().getResource(ruta+numbers[12]+png)));
        a14.setDisabledIcon(new ImageIcon(getClass().getResource(ruta+numbers[13]+png)));
        a15.setDisabledIcon(new ImageIcon(getClass().getResource(ruta+numbers[14]+png)));
        a16.setDisabledIcon(new ImageIcon(getClass().getResource(ruta+numbers[15]+png)));
    }    

    public Interfaz_GamePlay(ImageIcon im1, ImageIcon im2, Board fondo, JButton Reiniciarhijito, JButton a1, JButton a10, JButton a11, JButton a12, JButton a13, JButton a14, JButton a15, JButton a16, JButton a2, JButton a3, JButton a4, JButton a5, JButton a6, JButton a7, JButton a8, JButton a9, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JPanel jPanel1) throws HeadlessException {
        this.im1 = im1;
        this.im2 = im2;
        this.fondo = fondo;
        this.SaliJuego = Reiniciarhijito;
        this.a1 = a1;
        this.a10 = a10;
        this.a11 = a11;
        this.a12 = a12;
        this.a13 = a13;
        this.a14 = a14;
        this.a15 = a15;
        this.a16 = a16;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
        this.a7 = a7;
        this.a8 = a8;
        this.a9 = a9;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jPanel1 = jPanel1;
    }

    public Interfaz_GamePlay(ImageIcon im1, ImageIcon im2, Board fondo, JButton Reiniciarhijito, JButton a1, JButton a10, JButton a11, JButton a12, JButton a13, JButton a14, JButton a15, JButton a16, JButton a2, JButton a3, JButton a4, JButton a5, JButton a6, JButton a7, JButton a8, JButton a9, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JPanel jPanel1, GraphicsConfiguration gc) {
        super(gc);
        this.im1 = im1;
        this.im2 = im2;
        this.fondo = fondo;
        this.SaliJuego = Reiniciarhijito;
        this.a1 = a1;
        this.a10 = a10;
        this.a11 = a11;
        this.a12 = a12;
        this.a13 = a13;
        this.a14 = a14;
        this.a15 = a15;
        this.a16 = a16;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
        this.a7 = a7;
        this.a8 = a8;
        this.a9 = a9;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jPanel1 = jPanel1;
    }

    public Interfaz_GamePlay(ImageIcon im1, ImageIcon im2, Board fondo, JButton Reiniciarhijito, JButton a1, JButton a10, JButton a11, JButton a12, JButton a13, JButton a14, JButton a15, JButton a16, JButton a2, JButton a3, JButton a4, JButton a5, JButton a6, JButton a7, JButton a8, JButton a9, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JPanel jPanel1, String title) throws HeadlessException {
        super(title);
        this.im1 = im1;
        this.im2 = im2;
        this.fondo = fondo;
        this.SaliJuego = Reiniciarhijito;
        this.a1 = a1;
        this.a10 = a10;
        this.a11 = a11;
        this.a12 = a12;
        this.a13 = a13;
        this.a14 = a14;
        this.a15 = a15;
        this.a16 = a16;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
        this.a7 = a7;
        this.a8 = a8;
        this.a9 = a9;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jPanel1 = jPanel1;
    }

    public Interfaz_GamePlay(ImageIcon im1, ImageIcon im2, Board fondo, JButton Reiniciarhijito, JButton a1, JButton a10, JButton a11, JButton a12, JButton a13, JButton a14, JButton a15, JButton a16, JButton a2, JButton a3, JButton a4, JButton a5, JButton a6, JButton a7, JButton a8, JButton a9, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JPanel jPanel1, String title, GraphicsConfiguration gc) {
        super(title, gc);
        this.im1 = im1;
        this.im2 = im2;
        this.fondo = fondo;
        this.SaliJuego = Reiniciarhijito;
        this.a1 = a1;
        this.a10 = a10;
        this.a11 = a11;
        this.a12 = a12;
        this.a13 = a13;
        this.a14 = a14;
        this.a15 = a15;
        this.a16 = a16;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
        this.a7 = a7;
        this.a8 = a8;
        this.a9 = a9;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jPanel1 = jPanel1;
    }
    
    private void btnEnabled(JButton btn) {
        
        if(!caraUp) {
            btn.setEnabled(false);
            im1 = (ImageIcon) btn.getDisabledIcon();
            pbtn[0] = btn;
            caraUp = true;
            primerc = false;
        }
        else {
            btn.setEnabled(false);
            im2 = (ImageIcon) btn.getDisabledIcon();
            pbtn[1] = btn;
            primerc = true;
            puntaje += 20;
            pregwin();
        }
    }
    
    private void compare() {
        if(caraUp && primerc) {
            
            if(im1.getDescription().compareTo(im2.getDescription()) != 0) {
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
                if(puntaje > 10 ) puntaje -= 10;
            }
            caraUp = false;
        }
    }
    
    private void reiniciar() {
        
        a1.setEnabled(true);
        a2.setEnabled(true);
        a3.setEnabled(true);
        a4.setEnabled(true);
        a5.setEnabled(true);
        a6.setEnabled(true);
        a7.setEnabled(true);
        a8.setEnabled(true);
        a9.setEnabled(true);
        a10.setEnabled(true);
        a11.setEnabled(true);
        a12.setEnabled(true);
        a13.setEnabled(true);
        a14.setEnabled(true);
        a15.setEnabled(true);
        a16.setEnabled(true);
        
        primerc = false;
        caraUp = false;
        puntaje = 0;
    }
    
    private void pregwin() {
        if(!a1.isEnabled() && !a2.isEnabled() && !a3.isEnabled() && !a4.isEnabled() && !a5.isEnabled() && !a6.isEnabled() && 
                !a7.isEnabled() && !a8.isEnabled() && !a9.isEnabled() && !a10.isEnabled() && !a11.isEnabled() && 
                !a12.isEnabled() && !a13.isEnabled() && !a14.isEnabled() && !a15.isEnabled() && !a16.isEnabled()) {
            JOptionPane.showMessageDialog(this,"Puntuacion: "+puntaje, "OK", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        a1 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        a8 = new javax.swing.JButton();
        a7 = new javax.swing.JButton();
        a6 = new javax.swing.JButton();
        a5 = new javax.swing.JButton();
        a12 = new javax.swing.JButton();
        a11 = new javax.swing.JButton();
        a10 = new javax.swing.JButton();
        a9 = new javax.swing.JButton();
        a16 = new javax.swing.JButton();
        a15 = new javax.swing.JButton();
        a14 = new javax.swing.JButton();
        a13 = new javax.swing.JButton();
        SaliJuego = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego Dos Caras");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("S.T.A.L.K.E.R Call of Pripyat");

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        a1.setBorder(null);
        a1.setBorderPainted(false);
        a1.setContentAreaFilled(false);
        a1.setFocusable(false);
        a1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        a1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a1MouseExited(evt);
            }
        });
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        a2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        a2.setBorder(null);
        a2.setBorderPainted(false);
        a2.setContentAreaFilled(false);
        a2.setFocusable(false);
        a2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        a2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a2MouseExited(evt);
            }
        });
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        a3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        a3.setBorder(null);
        a3.setBorderPainted(false);
        a3.setContentAreaFilled(false);
        a3.setFocusable(false);
        a3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        a3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a3MouseExited(evt);
            }
        });
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        a4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        a4.setBorder(null);
        a4.setBorderPainted(false);
        a4.setContentAreaFilled(false);
        a4.setFocusable(false);
        a4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        a4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a4MouseExited(evt);
            }
        });
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });

        a8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        a8.setBorder(null);
        a8.setBorderPainted(false);
        a8.setContentAreaFilled(false);
        a8.setFocusable(false);
        a8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        a8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a8MouseExited(evt);
            }
        });
        a8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8ActionPerformed(evt);
            }
        });

        a7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        a7.setBorder(null);
        a7.setBorderPainted(false);
        a7.setContentAreaFilled(false);
        a7.setFocusable(false);
        a7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        a7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a7MouseExited(evt);
            }
        });
        a7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a7ActionPerformed(evt);
            }
        });

        a6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        a6.setBorder(null);
        a6.setBorderPainted(false);
        a6.setContentAreaFilled(false);
        a6.setFocusable(false);
        a6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        a6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a6MouseExited(evt);
            }
        });
        a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ActionPerformed(evt);
            }
        });

        a5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        a5.setBorder(null);
        a5.setBorderPainted(false);
        a5.setContentAreaFilled(false);
        a5.setFocusable(false);
        a5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        a5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a5MouseExited(evt);
            }
        });
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });

        a12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        a12.setBorder(null);
        a12.setBorderPainted(false);
        a12.setContentAreaFilled(false);
        a12.setFocusable(false);
        a12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        a12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a12MouseExited(evt);
            }
        });
        a12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a12ActionPerformed(evt);
            }
        });

        a11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        a11.setBorder(null);
        a11.setBorderPainted(false);
        a11.setContentAreaFilled(false);
        a11.setFocusable(false);
        a11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        a11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a11MouseExited(evt);
            }
        });
        a11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a11ActionPerformed(evt);
            }
        });

        a10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        a10.setBorder(null);
        a10.setBorderPainted(false);
        a10.setContentAreaFilled(false);
        a10.setFocusable(false);
        a10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        a10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a10MouseExited(evt);
            }
        });
        a10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a10ActionPerformed(evt);
            }
        });

        a9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        a9.setBorder(null);
        a9.setBorderPainted(false);
        a9.setContentAreaFilled(false);
        a9.setFocusable(false);
        a9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        a9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a9MouseExited(evt);
            }
        });
        a9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a9ActionPerformed(evt);
            }
        });

        a16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        a16.setBorder(null);
        a16.setBorderPainted(false);
        a16.setContentAreaFilled(false);
        a16.setFocusable(false);
        a16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        a16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a16MouseExited(evt);
            }
        });
        a16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a16ActionPerformed(evt);
            }
        });

        a15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        a15.setBorder(null);
        a15.setBorderPainted(false);
        a15.setContentAreaFilled(false);
        a15.setFocusable(false);
        a15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        a15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a15MouseExited(evt);
            }
        });
        a15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a15ActionPerformed(evt);
            }
        });

        a14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        a14.setBorder(null);
        a14.setBorderPainted(false);
        a14.setContentAreaFilled(false);
        a14.setFocusable(false);
        a14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        a14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a14MouseExited(evt);
            }
        });
        a14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a14ActionPerformed(evt);
            }
        });

        a13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c0.png"))); // NOI18N
        a13.setBorder(null);
        a13.setBorderPainted(false);
        a13.setContentAreaFilled(false);
        a13.setFocusable(false);
        a13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cr.png"))); // NOI18N
        a13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a13MouseExited(evt);
            }
        });
        a13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(a1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(a5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(a9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(a13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a2)
                    .addComponent(a1)
                    .addComponent(a3)
                    .addComponent(a4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a6)
                    .addComponent(a5)
                    .addComponent(a7)
                    .addComponent(a8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a9)
                    .addComponent(a10)
                    .addComponent(a11)
                    .addComponent(a12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a13)
                    .addComponent(a14)
                    .addComponent(a15)
                    .addComponent(a16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SaliJuego.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SaliJuego.setText("Salir del Juego");
        SaliJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaliJuegoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Tiempo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("--");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SaliJuego)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaliJuego)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(474, 594));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        btnEnabled(a1);
    }//GEN-LAST:event_a1ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        btnEnabled(a2);
    }//GEN-LAST:event_a2ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        btnEnabled(a3);
    }//GEN-LAST:event_a3ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        btnEnabled(a4);
    }//GEN-LAST:event_a4ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
        btnEnabled(a5);
    }//GEN-LAST:event_a5ActionPerformed

    private void a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6ActionPerformed
        btnEnabled(a6);
    }//GEN-LAST:event_a6ActionPerformed

    private void a7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a7ActionPerformed
        btnEnabled(a7);
    }//GEN-LAST:event_a7ActionPerformed

    private void a8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a8ActionPerformed
        btnEnabled(a8);
    }//GEN-LAST:event_a8ActionPerformed

    private void a9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a9ActionPerformed
        btnEnabled(a9);
    }//GEN-LAST:event_a9ActionPerformed

    private void a10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a10ActionPerformed
        btnEnabled(a10);
    }//GEN-LAST:event_a10ActionPerformed

    private void a11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a11ActionPerformed
        btnEnabled(a11);
    }//GEN-LAST:event_a11ActionPerformed

    private void a12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a12ActionPerformed
        btnEnabled(a12);
    }//GEN-LAST:event_a12ActionPerformed

    private void a13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a13ActionPerformed
        btnEnabled(a13);
    }//GEN-LAST:event_a13ActionPerformed

    private void a14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a14ActionPerformed
        btnEnabled(a14);
    }//GEN-LAST:event_a14ActionPerformed

    private void a15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a15ActionPerformed
        btnEnabled(a15);
    }//GEN-LAST:event_a15ActionPerformed

    private void a16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a16ActionPerformed
        btnEnabled(a16);
    }//GEN-LAST:event_a16ActionPerformed

    private void a1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_a1MouseExited

    private void a2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a2MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_a2MouseExited

    private void a3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a3MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_a3MouseExited

    private void a4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a4MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_a4MouseExited

    private void a5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a5MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_a5MouseExited

    private void a6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a6MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_a6MouseExited

    private void a7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a7MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_a7MouseExited

    private void a8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a8MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_a8MouseExited

    private void a9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a9MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_a9MouseExited

    private void a10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a10MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_a10MouseExited

    private void a11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a11MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_a11MouseExited

    private void a12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a12MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_a12MouseExited

    private void a13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a13MouseExited
        // TODO add your handling code here:        
        compare();
    }//GEN-LAST:event_a13MouseExited

    private void a14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a14MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_a14MouseExited

    private void a15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a15MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_a15MouseExited

    private void a16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a16MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_a16MouseExited

    private void SaliJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaliJuegoActionPerformed
        dispose();
    }//GEN-LAST:event_SaliJuegoActionPerformed

    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz_GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_GamePlay().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaliJuego;
    private javax.swing.JButton a1;
    private javax.swing.JButton a10;
    private javax.swing.JButton a11;
    private javax.swing.JButton a12;
    private javax.swing.JButton a13;
    private javax.swing.JButton a14;
    private javax.swing.JButton a15;
    private javax.swing.JButton a16;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JButton a5;
    private javax.swing.JButton a6;
    private javax.swing.JButton a7;
    private javax.swing.JButton a8;
    private javax.swing.JButton a9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    

    
}
