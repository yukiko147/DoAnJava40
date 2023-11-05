
package main;

import frm.frmDangNhap;
import frm.frmTrangChu;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class hungnguyen {
  public static  frm.frmTrangChu frmTC=new frmTrangChu();
     public static database.clsConnectDB connection = new  database.clsConnectDB ();

    public static void main(String[] args) {
       frm.frmDangNhap frmDN= new   frm.frmDangNhap();
  
       frmDN.show();
    }
   
    
}
