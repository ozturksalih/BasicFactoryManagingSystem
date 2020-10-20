
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class employeeOperations {
    private Connection con = null;
    private Statement statement = null;//sql sorgularini calistirmak icin gerekli olan methodlar barindirmaktadir.
    private PreparedStatement preparedStatement = null;
    //ManagerScreen managerscreen = new ManagerScreen();
    ArrayList<Employee> bringEmployees(){
        ArrayList<Employee> output = new ArrayList<Employee>();
        
        try {
            statement = con.createStatement();
            String query = "Select * From calisanlar";
            ResultSet rs = statement.executeQuery(query);
            
            
            while(rs.next()){
                
                int id = rs.getInt("id");
                String name = rs.getString("ad");
                String surname = rs.getString("soyad");
                String departman = rs.getString("departman");
                String salary = rs.getString("maas");
                String username = rs.getString("username");
                String password = rs.getString("password");
                boolean isadmin = rs.getBoolean("is_admin");
                
                output.add(new Employee(id , name , surname , departman , salary , username , password, isadmin));
                
            }
            return output;
        } catch (SQLException ex) {
            Logger.getLogger(employeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
            return null;
        
       
                }
    
    public String employeeName(int id){
        String query = "Select * from calisanlar where id = ?";
        String name = null ; 
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setInt(1, id);
            
            ResultSet rs  = preparedStatement.executeQuery();
            while (rs.next()){
                name = rs.getString("ad");
                
            }
            return name;
            
            
            
            
//        try {
//            preparedStatement = con.prepareStatement(query);
//            
//            preparedStatement.setInt(1, id);
//            
//            ResultSet rs = preparedStatement.executeQuery();
//            while(rs.next()){
//                name = rs.getString("ad");
//                surname = rs.getString("soyad");
//                departman = rs.getString("departman");
//                salary = rs.getString("maas");
//                username = rs.getString("username");
//                password = rs.getString("password");
//                isadmin = rs.getBoolean("is_admin");
//                
//                output.add(name);
//                output.add(surname);
//                output.add(departman);
//                output.add(salary);
//                output.add(username);
//                output.add(password);
//
                
//                id_field.setText(Integer.toString(id));
//                name_field.setText(name);
//                surname_field.setText(surname);
//                departman_field.setText(departman);
//                salary_field.setText(salary);
//                username_field.setText(username);
//                password_field.setText(password);



//            }
//            return output;
//        } catch (SQLException ex) {
//            Logger.getLogger(employeeOperations.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
        } catch (SQLException ex) {
            Logger.getLogger(employeeOperations.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    public String employeeSurname(int id){
        String query = "Select * from calisanlar where id = ?";
        String surname = null;
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setInt(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                surname = rs.getString("soyad");
                
            }
            return surname ;
        } catch (SQLException ex) {
            Logger.getLogger(employeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    public String employeeDepartman(int id){
        String query = "Select * from calisanlar where id = ?";
        String departman = null;
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setInt(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                departman = rs.getString("departman");
                
            }
            return departman ;
        } catch (SQLException ex) {
            Logger.getLogger(employeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    public String employeeSalary(int id){
        String query = "Select * from calisanlar where id = ?";
        String salary = null;
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setInt(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                salary = rs.getString("maas");
                
            }
            return salary ;
        } catch (SQLException ex) {
            Logger.getLogger(employeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    public String employeeUsername(int id){
        String query = "Select * from calisanlar where id = ?";
        String username = null;
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setInt(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                username = rs.getString("username");
                
            }
            return username ;
        } catch (SQLException ex) {
            Logger.getLogger(employeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    public String employeePassword(int id){
        String query = "Select * from calisanlar where id = ?";
        String password = null;
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setInt(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                password = rs.getString("password");
                
            }
            return password ;
        } catch (SQLException ex) {
            Logger.getLogger(employeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    public boolean employeeWages(int id){
        String query = "Select * from calisanlar where id = ?";
        boolean wages = false;
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setInt(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                wages = rs.getBoolean("thisMonth");
                
            }
            return wages ;
        } catch (SQLException ex) {
            Logger.getLogger(employeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }
    public employeeOperations() {
        String url = "jdbc:mysql://"+ Databese.host + ":" + Databese.port + "/" + Databese.db_name;//tarayicida girecegimiz url i buraya yaziyoruz
        try {
            Class.forName("com.mysql.jdbc.Driver");// ilk olarak driver kuruyoruz
            //mysql connector java yi kutuphaneye eklemezsek burada hata aliyoruz
        } catch (ClassNotFoundException e) {
            System.out.println("Driver bulunamadi...");
        }

        try {
            con = DriverManager.getConnection(url , Databese.username , Databese.password);//Connection classinin objesini kullanarak baglanti kuruyoruz
            System.out.println("Baglanti basarili...");
        } catch (SQLException throwables) {
            System.out.println("Baglanti basarisiz...");
        }

    }
    
    public void payWages(){
        String query = "Update calisanlar set thisMonth = ?";
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setBoolean(1, true);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(employeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public void employeeSavingChanges(int id , String new_username , String new_password ){
        String query = "Update calisanlar set username = ? , password = ? where id = ?";
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1, new_username);
            preparedStatement.setString(2, new_password);
            preparedStatement.setInt(3, id);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(employeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void updateEmployee(int id , String new_name , String new_surname , String new_departman
                                ,String new_salary , String new_username , String new_password , boolean isadmin){
        String query = "Update calisanlar set ad = ? , soyad = ? , departman = ? , maas = ? , username = ? , password = ? , is_admin = ? where id = ?";
            
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1, new_name);
            preparedStatement.setString(2, new_surname);
            preparedStatement.setString(3, new_departman);
            preparedStatement.setString(4, new_salary);
            preparedStatement.setString(5, new_username);
            preparedStatement.setString(6, new_password);
            preparedStatement.setBoolean(7, isadmin);
            
            preparedStatement.setInt(8, id);
            
            preparedStatement.executeUpdate();//use executeUpdate instead of executeQuery!
        } catch (SQLException ex) {
            Logger.getLogger(employeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        
    }
    
    public void addEmployee(String name , String surname , String departman , String salary,
                            String username , String password , boolean isadmin){
        
        String query = "Insert into calisanlar(ad , soyad, departman , maas , username , password , is_admin) VALUES(?,?,?,?,?,?,?)";
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, departman);
            preparedStatement.setString(4,salary);
            preparedStatement.setString(5,username);
            preparedStatement.setString(6,password);
            preparedStatement.setBoolean(7, isadmin);
            
            preparedStatement.executeUpdate();//use executeUpdate instead of executeQuery!
        } catch (SQLException ex) {
            Logger.getLogger(employeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
    public void deleteEmployee(int id ){
        String query = "Delete from calisanlar where id = ?";
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();//not executeQuery!!
        } catch (SQLException ex) {
            Logger.getLogger(employeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean signIn(String username , String password){
        String query = "Select * from calisanlar where username = ? and password = ?";
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            
            ResultSet rs = preparedStatement.executeQuery();
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(employeeOperations.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    
    public int idAssignment(String username , String password){//kullanici adi ve sifreyi bilerek id ogrenme
        String query = "Select * from calisanlar where username = ? and password = ? ";
        int id = 0 ;
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            
            
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                
                id = rs.getInt("id");
                }
            return id;

        } catch (SQLException ex) {
            Logger.getLogger(employeeOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id ;
        
        
    }
    
    public boolean is_admin(int id){//true degeri admin , false degeri user.
        String query = "Select * from calisanlar where id = ?";
        boolean isadmin = false;
        try {
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1 , id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()){
                
                isadmin = rs.getBoolean("is_admin");
                }
            //isadmin = rs.getBoolean("is_admin");//this line must be in the loop
            return isadmin;
        } catch (SQLException ex) {
            System.out.println("The problem is function is_admin");
            return isadmin;
        }
        
        
        
        
        
    }
    
}
