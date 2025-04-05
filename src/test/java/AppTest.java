import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

public class AppTest {

    @Test
	public void appTest() throws IOException {
		// TODO Auto-generated method stub
	     System.out.print("app testing");
	     File source = new File("C:\\Users\\vicky\\jfrog_repo\\jfrog-maven-hello-world\\src\\main\\resources\\source.txt");
	     File dest = new File("C:\\Users\\vicky\\jfrog_repo\\jfrog-maven-hello-world\\src\\main\\resources\\dest.txt");
	     FileUtils.copyFile(source, dest);

	  // 📁 Read file content as String
	  String content = FileUtils.readFileToString(source, "UTF-8");

	}

}
