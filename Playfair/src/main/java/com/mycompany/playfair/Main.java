/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.playfair;

import java.awt.Point;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 임미희
 */
public class Main extends javax.swing.JFrame {
        private static char[][] Table = new char[5][5];
	private static Point[] alphabet =new Point[26];
	
	private static String Encryption_end ="";
	private static String Decode_end ="";
	private static String Conversion_Line = "";
	private static String equalsText = "";
    
        private static String KeyWord;
	private static String Line ;
        
        private static boolean isMove =false;
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Key = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Plain = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        Code = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        Encryption = new javax.swing.JButton();
        decode = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Key.setText("암호키");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        Plain.setText("평문");

        Code.setText("암호문");

        Encryption.setBackground(new java.awt.Color(153, 153, 153));
        Encryption.setFont(new java.awt.Font("굴림", 1, 12)); // NOI18N
        Encryption.setText("암호화");
        Encryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptionActionPerformed(evt);
            }
        });

        decode.setBackground(new java.awt.Color(153, 153, 153));
        decode.setFont(new java.awt.Font("굴림", 1, 12)); // NOI18N
        decode.setText("복호화");
        decode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decodeActionPerformed(evt);
            }
        });

        jLabel1.setText("암호화 이후 사용가능");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Code)
                                    .addComponent(Plain)
                                    .addComponent(Key))
                                .addGap(406, 406, 406))
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Encryption, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(decode, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Key)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Plain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Code)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Encryption, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decode, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EncryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptionActionPerformed
        // TODO add your handling code here:
        encryption();
        jTextField2.setText(Encryption_end);
        Result_Frame s = new Result_Frame(Encryption_end);
       
    }//GEN-LAST:event_EncryptionActionPerformed

    private void decodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decodeActionPerformed
        // TODO add your handling code here:
        if(isMove==true){
            Decrypt();
            Result_Frame s = new Result_Frame(Decode_end);
        }else{
            JOptionPane.showConfirmDialog(this, "암호화 이후 버튼을 누르세요","복호화 시도",JOptionPane.ERROR_MESSAGE);    
        }
        
        isMove=false;
        
    }//GEN-LAST:event_decodeActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private static void encryption() {

		 KeyWord = jTextField1.getText();
		 Line = jTextField3.getText();
//		System.out.println(Line);
		
		String result = Deduplication(KeyWord);
//		System.out.println(result);
		string_theorem(Line);
		
		Table(result);
		Encryption_end = Encryption_run(Conversion_Line.toUpperCase(),1);
		System.out.println(Encryption_end);
                isMove=true;
	}
	
	private static void Decrypt() {
                KeyWord = jTextField1.getText();
                
                String result = Deduplication(KeyWord);
                Table(result);
                
		Decode_end = jTextField2.getText();
                System.out.println(Decode_end);
		Decode_end = Encryption_run((Decode_end.replace(" ", "")).toUpperCase(),4).replace(" ", "");
		System.out.println(Decode_end.replace(" ", ""));
	}
	
	
	
	
	
	private static String Deduplication(String Key) {
		String result ="";
		for(int i=0; i < Key.length(); i++) {
			if(! result.contains(String.valueOf(Key.charAt(i)))) {
				result += String.valueOf(Key.charAt(i));
			}
		}
		result = result.replace(" ", "");
		return result;
	}
	
	
	private static void string_theorem (String Key) {
		String result =""; 
		String Temporary = "";
		String Num=""; 
		int len=0;
		
		Key =  Key.replace(" ", "");
		
		if(Key.length() % 2!=0) {
			len = Key.length()-1;
			Temporary = Key.valueOf(Key.charAt(Key.length()-1))+'X';
		}
		System.out.println(Key);
		for(int i=0; i < len; i+=2) {
			Num= Key.substring(i, i+2);
//			System.out.println(Num);
			if(Num.charAt(0)==Num.charAt(1)) {
				Num = Num.valueOf(Num.charAt(0))+'X';
				i -= 1;
				len +=1;
				Temporary="";
			}
			
			result+= Num;
		}
		Conversion_Line = result+Temporary;
		
	}
	
	private static String JQ_replace(String s, boolean changeJtoI) {
	      s = s.toUpperCase().replaceAll("[^A-Z]", "");
	      return changeJtoI ? s.replace("J", "I") : s.replace("Q", "");
	}
	
	
	private static void Table(String Key ) {
		boolean change = (Key.toLowerCase()).contains("z");
		if(change!=true) {
			equalsText="Z";
		}else {
			equalsText="J";
		}
		
		String s = JQ_replace(Key + "ABCDEFGHIJKLMNOPQRSTUVWXYZ", change);
		int len = s.length();
        for (int i = 0, k = 0; i < len; i++) {
            char c = s.charAt(i);
//            System.out.println(c + "  "+ (c - 'A'));
            if (alphabet[c - 'A'] == null) { 
            	Table[k / 5][k % 5] = c; // 0 0 , 0 , 1
            	// 나머지 이므로 뒤에는 계속 0부터  5까지 들어간다.
            	alphabet[c - 'A'] = new Point(k % 5, k / 5);//0, 0 / 1,0
            	// 원래 알파벳 자리에 널어두기 ( 0부터 시작 하므로 -1이다. )
                k++;
            }
        }

        for(int i=0; i<5; i++) {
        	for(int j=0; j<5; j++) {
        		System.out.print(Table[i][j]+"-");
        	}
        	System.out.println();
        }
	}
	
	private static String Encryption_run(String result,int result_num) {
		String text="";
		
		char one;
		char two;
		for(int i=0; i< result.length(); i+=2) {
			one = result.charAt(i);
			two = result.charAt(i+1);
			
//			System.out.println(one);
//			System.out.println(two);
			int r_1 = alphabet[one-'A'].y; // 전에 넣어둔 Y 자리 찾기
			int r_2 = alphabet[two-'A'].y;
			
			int c_1 =  alphabet[one-'A'].x; // 전에 넣어둔 X 자리 찾기
			int c_2 =  alphabet[two-'A'].x; 
			
			if(r_1 == r_2) { // 줄이 같으면
				c_1 = (c_1+result_num)%5;
				c_2 = (c_2+result_num)%5;
			}else if(c_1 ==c_2){ // 행이 같으면
				r_1 = (r_1+result_num)%5;
				r_2 = (r_2+result_num)%5;
			}else { // 행 열 둘다 다르면
				int num = c_1;
				c_1=c_2;
				c_2=num;
			}
			text +=Table[r_1][c_1];
			text +=Table[r_2][c_2]+" ";

		}
		return text;
	}
        public String getDecrypt(){
            return Decode_end;
        }
        public String getencryption(){
            return Decode_end;
        }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Code;
    private javax.swing.JButton Encryption;
    private javax.swing.JLabel Key;
    private javax.swing.JLabel Plain;
    private javax.swing.JButton decode;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField jTextField2;
    private static javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
