package ra.jademy.persistance;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MediaDAO {
	private Properties importFile;
	private static MediaDAO soleInstance = new MediaDAO(); 

	private MediaDAO() {
		importFile = new Properties();
		try {
			FileInputStream stream = new FileInputStream("media-store-database.properties");
			importFile.load(stream);
		} catch (IOException e) {
			throw new RuntimeException("Cannot open user.properties", e);
		}
	}
	public static MediaDAO getInstance() {
		return soleInstance;
	}
}
