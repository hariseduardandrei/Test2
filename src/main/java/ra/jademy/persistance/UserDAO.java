package ra.jademy.persistance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ra.jademy.domain.User;



public class UserDAO {

	private Properties importFile;
	private static UserDAO soleInstance = new UserDAO(); 

	private UserDAO() {
		importFile = new Properties();
		try {
			FileInputStream stream = new FileInputStream("user.properties");
			importFile.load(stream);
		} catch (IOException e) {
			throw new RuntimeException("Cannot open user.properties", e);
		}
	}
	public static UserDAO getInstance() {
		return soleInstance;
	}
	
	public User getUserByUsername(String username) {
		int i=0;
		while (true) {
			i++;
			String dbUsername = importFile.getProperty("user["+i+"].username");
			if (dbUsername==null){
				return null;
			}
			if (dbUsername.equals(username)){
				String dbPassword = importFile.getProperty("user["+i+"].password");
				return new User (dbUsername, dbPassword);
			}
		}
		
		
	}
	

}
