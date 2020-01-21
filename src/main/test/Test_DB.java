//import db.Mysql_Connect;

//import db.Mysql_Connect;
//import
import db.Mysql_Connect;
import db.Std;

import java.sql.Connection;
import java.sql.ResultSet;

public class Test_DB {

    public static void main(String[] args) throws Exception {
        Mysql_Connect mysql_connect=new Mysql_Connect();
        mysql_connect.put(new Std(143,"HP_Forever"));
//       ResultSet r= mysql_connect.getData();
//       while(r.next())
//       {
//           System.out.println(r.getInt(1));
//       }

//System.out.println(mysql_connect.get());


    }

}
