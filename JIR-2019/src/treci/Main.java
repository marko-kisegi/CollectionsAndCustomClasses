package treci;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String directory = "D:\\OOP\\";
		Path root = Paths.get(directory);
		DuplicateFileVisitor visitor = new DuplicateFileVisitor();
		try {
			Files.walkFileTree(root, visitor);
		} catch(IOException e) {
			e.printStackTrace();
		}
		Long total = visitor.getDeletedData()
				.entrySet()
				.stream()
				.mapToLong(long::longValue)
				.sum();
		System.out.println("\nFreed disk space %d Deleted files %d", total, visitor.getDeletedData().size());
	}

}
