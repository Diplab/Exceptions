import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		String path = "src/ReadFile.java";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String input = null;
			while ((input = br.readLine()) != null)
				System.out.println(input);
		}
	}

}
