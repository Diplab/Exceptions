import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileWithoutTryWithResource {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		String path = "src/ReadFile.java";
		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			String input = null;
			while ((input = br.readLine()) != null)
				System.out.println(input);
		} finally {
			br.close();
		}
	}

}
