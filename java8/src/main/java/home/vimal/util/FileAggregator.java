package home.vimal.util;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class FileAggregator {

	public static void main(String[] args) {
		
		File file = new File("C:\\Temp\\ae_spufi_input");
		
		if(file.isDirectory()) {
			Arrays.stream(file.list()).forEach(System.out::println);
			
		}
			
		
		
		
	}

}
