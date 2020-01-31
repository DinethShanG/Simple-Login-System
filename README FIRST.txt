										/*READ ME First*/
# University-Management-System
SE/2017/013 OOP Project UMS

***Step to Run University-Management-System***

After Cloning the Git Repository You have to Establish the Database Connection and etc.
	 
	Step 1
		Open your MySql Database Server and import the dump file in following location.
			(<"Project Directory">\University-Management-System\MySql Database Dump File\MYSQL Dump File)
										
									Or
									
		Get the MySQL Quearies from Following Location and Create Database Using your MySQL Server
			(<"Project Directory">\University-Management-System\MySql Database Dump File\MySQL Quaries)
			
			#### Database Name must be "universitymanagementsystem"
			
	Step 2
		Open the Project on IntelliJ idea Ultimate
	
	Step 3
		Import the Libraries to the project in following Location
			(<"Project Directory">\University-Management-System\Libraries to import)
			*MySQL Connector Java
			*Absolute Layout
	
	Step 4
		Establish the Database Connection by Using instructions on following link.
			https://www.jetbrains.com/help/idea/connecting-to-a-database.html
			
			#### Project created for following Credentials
					<Username>-root
					<Password> -root
			
			#### If your Creadentials are different from aboves you have to change code as following.
					*Open project from intellij idea ultimate
					*Go to following directory using intellij project tab (src->dbconnection->DBConnect.java) and open DBConnection.java
					*There in Line 7 and 8 code is as follow
							private String user="root";
							private String pass="root";
					*you have to change is follow
							private String user="your username";
							private String pass="your password";
	Step 5
		Compile the project and run it and enjoy it
		
									/*END OF READ ME*/
										
										
										
										
								