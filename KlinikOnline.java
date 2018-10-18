package mencoba;

import javax.swing.*;
import java.awt.event.*;

public class KlinikOnline extends JFrame
{
    JLabel lbljenis=new JLabel("Jenis Poli");
    JRadioButton umum=new JRadioButton("Umum");
    JRadioButton gigi=new JRadioButton("Gigi");
    ButtonGroup grupjenis=new ButtonGroup();
    JLabel lbldokter=new JLabel("Nama Dokter");
    JTextField txdokter=new JTextField(20);
    JLabel lblpraktek=new JLabel("Waktu Praktek");
    JTextField txpraktek=new JTextField(20);
    JLabel lblpasien=new JLabel("Data Pasien");
    JLabel lblno=new JLabel("No.Pasien");
    JTextField txno=new JTextField(20);
    JLabel lblnama=new JLabel("Nama Pasien");
    JTextField txnama=new JTextField(20); 
    JLabel lbllama=new JLabel("Lama Inap");
    JTextField txlama=new JTextField(20);
    JLabel lblruang=new JLabel("Nama Ruang");
    String[]koderuang={"Kelas 1","Kelas 2","Kelas 3","VIP","VVIP"};
    JLabel lblkelamin=new JLabel("Jenis Kelamin");
    JCheckBox pria=new JCheckBox ("Pria");
    JCheckBox wanita=new JCheckBox ("Wanita");
    JComboBox cbkoderuang=new JComboBox(koderuang);
    JButton tblsimpan=new JButton ("Simpan");
    JButton tblkeluar=new JButton ("Keluar");
    JButton cetak=new JButton("Cetak");
    JTextArea hasil=new JTextArea();
   
       
KlinikOnline()
{
        setTitle("Klinik Kesehatan");
        setLocation(300,150);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
}

void komponenVisual()
{
        
    getContentPane().setLayout(null);
    getContentPane().add(lbljenis);
    lbljenis.setBounds(10,10,70,20);
    getContentPane().add(umum);
    umum.setBounds(10,30,65,20);
    getContentPane().add(gigi);
    gigi.setBounds(75,30,55,20);
    grupjenis.add(umum);
    grupjenis.add(gigi);
    getContentPane().add(lbldokter);
    lbldokter.setBounds(10,40,200,50);
    getContentPane().add(txdokter);
    txdokter.setBounds(110,55,100,20);
    getContentPane().add(lblpraktek);
    lblpraktek.setBounds(10,70,200,50);
    getContentPane().add(txpraktek);
    txpraktek.setBounds(110,85,100,20);
    getContentPane().add(lblpasien);
    lblpasien.setBounds(250,10,200,20);
    getContentPane().add(lblno);
    lblno.setBounds(250,30,200,20);
    getContentPane().add(txno);
    txno.setBounds(350,30,100,20);
    getContentPane().add(lblnama);
    lblnama.setBounds(250,40,100,50);
    getContentPane().add(txnama);
    txnama.setBounds(350,55,100,20);
    getContentPane().add(lbllama);
    lbllama.setBounds(10,100,100,50);
    getContentPane().add(txlama);
    txlama.setBounds(110,115,120,20);
    getContentPane().add(lblruang);
    lblruang.setBounds(10,135,110,50);
    getContentPane().add(cbkoderuang);
    cbkoderuang.setBounds(110,150,120,20);
    getContentPane().add(lblkelamin);
    lblkelamin.setBounds(250,65,100,50);
    getContentPane().add(pria);
    pria.setBounds(350,80,50,20);
    getContentPane().add(wanita);
    wanita.setBounds(400,80,100,20);
    getContentPane().add(tblsimpan);
    tblsimpan.setBounds(330,250,120,20);
    getContentPane().add(tblkeluar);
    tblkeluar.setBounds(330,290,120,20);
    getContentPane().add(cetak);
    cetak.setBounds(10,180,270,20);
    getContentPane().add(hasil);
    hasil.setBounds(10,190,270,200);
 
    
    setVisible(true);
    
}
    void AksiReaksi()
{
cetak.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
if(umum.isSelected()==true)
{
hasil.append(umum.getText()+"\n");
}
else
{
hasil.append(gigi.getText()+"\n");
}
hasil.append(txdokter.getText()+"\n");
hasil.append(txpraktek.getText()+"\n");
hasil.append(txno.getText()+"\n");
hasil.append(txnama.getText()+"\n");
hasil.append(txlama.getText()+"\n");
hasil.append(cbkoderuang.getSelectedItem()+"\n");
if(pria.isSelected()==true)
{
hasil.append(pria.getText()+"\n");
}
if(wanita.isSelected()==true)
{
hasil.append(wanita.getText()+"\n");
}
}
});
}
    public static void main(String args[]){
    KlinikOnline kl=new KlinikOnline();
    kl.komponenVisual();
    kl.AksiReaksi();
}
}



