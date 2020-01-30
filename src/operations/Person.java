package operations;

import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;
import dbconnection.DBConnect;
import interfaces.Home;
import interfaces.Profile;
import interfaces.SubjectSelect;
import java.awt.Window;
import java.sql.*;
import java.text.Normalizer.Form;
import javax.swing.JOptionPane;

/**
 *
 * @author Dinet
 */
public class Person extends Authentication {
    private String name,username;
    private int age,id;
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void AddPersonData(String role1, String role2) throws SQLException, ClassNotFoundException {
        try {
            DBConnect dbConnect=new DBConnect();
            conn=dbConnect.getConnection();
            stmt=conn.createStatement();

            String sql="INSERT INTO "+role1+" VALUES (NULL,'"+getName()+"',"+getAge()+", '"+getUser_name()+"', '"+getPassword()+"')";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
            SubjectSelect subjectSelect=new SubjectSelect();
            subjectSelect.setRole1(role1);
            subjectSelect.setRole2(role2);
            subjectSelect.setUsername(getUser_name());
            subjectSelect.setName(name);


            System.gc();
            for (Window window : Window.getWindows()) {
                window.dispose();
            }
            subjectSelect.showSelectSubject();


        }
        catch (ClassNotFoundException a) {
            a.printStackTrace();
        }
        catch (SQLException a) {
            if(a instanceof SQLIntegrityConstraintViolationException){
                JOptionPane.showMessageDialog(null,"Username is already Exist!!!","Duplicate Value",JOptionPane.ERROR_MESSAGE);

            }
            else if(a instanceof MysqlDataTruncation){
                JOptionPane.showMessageDialog(null,"Some Entered Values are too Long!!","Too Long Value",JOptionPane.ERROR_MESSAGE);
            }
            else{
                a.printStackTrace();
            }

        }

    }

    public int LoginPerson(String username,String password,String role1){
        int getID;
        getID=super.compareUsernamePassword(username,password,role1);
        if(getID==-1){
            return 0;
        }
        else{
            return getID;
        }
    }
    public void showPersonDetails(int id,String role1,String role2) throws SQLException{
        try {
            DBConnect dbConnect=new DBConnect();
            conn=dbConnect.getConnection();
            stmt=conn.createStatement();
            String sql="SELECT name,age FROM "+role1+" WHERE id='"+id+"'";
            rs=stmt.executeQuery(sql);
            while (rs.next()){
                name=rs.getString("name");
                age=rs.getInt("age");
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Database is not Connected!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Invalid SQL Expression");
        }

        Profile profile=new Profile();
        profile.setRole1(role1);
        profile.setRole2(role2);
        profile.setId(id);
        profile.setName(name);
        profile.setUsername(username);
        profile.setAge(age);
        profile.showDetails();
    }
    public int takeID(String username,String role1 ){
        try {
            DBConnect dbConnect = new DBConnect();
            conn = dbConnect.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT id FROM " + role1 + " WHERE username='" + username + "'";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                id = rs.getInt("id");
            }
            rs.close();
            stmt.close();
            conn.close();
        }

        catch (ClassNotFoundException b) {
            b.printStackTrace();
        } catch (SQLException b) {
            b.printStackTrace();
        }
        return id;

    }



}
