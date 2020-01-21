package db;

import java.sql.*;

public class Mysql_Connect {


    private Connection getConnect()throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/d1","root","");
        return con;
    }

    public ResultSet getData() throws Exception {

        Connection con=this.getConnect();
       Statement st= con.createStatement();
       ResultSet rs=st.executeQuery("select * from std");
//
//       while(rs.next())
//       {
//           System.out.println(rs.getInt(1)+" "+rs.getString(2));
//       }
//       con.close();
       return rs;


    }



    public int get() throws Exception {

        Connection con=this.getConnect();
        Statement st= con.createStatement();
        ResultSet rs=st.executeQuery("select count(r_no)from std");
        int i=0;
        while(rs.next())
        {
             i=rs.getInt(1);
        }

        return i;

    }




    public int put(Std s) throws Exception {
        Connection c=this.getConnect();

        PreparedStatement pst=c.prepareStatement("insert into std values (?,?)");
        pst.setInt(1,s.getId());
        pst.setString(2,s.getName());
        int i1=pst.executeUpdate();
        c.close();
        return i1;



    }

    public int edit(Std s) throws Exception {
        Connection c=this.getConnect();

        PreparedStatement pst=c.prepareStatement("UPDATE std SET name=? WHERE r_no=?");
        pst.setInt(2,s.getId());
        pst.setString(1,s.getName());
        int i1=pst.executeUpdate();
        c.close();
        return i1;



    }

    public int delete(int id) throws Exception {
        Connection c=this.getConnect();

        PreparedStatement pst=c.prepareStatement("DELETE FROM `std` WHERE r_no=?");
        pst.setInt(1,id);
//        pst.setString(1,s.getName());
        int i1=pst.executeUpdate();
        c.close();
        return i1;



    }






}
