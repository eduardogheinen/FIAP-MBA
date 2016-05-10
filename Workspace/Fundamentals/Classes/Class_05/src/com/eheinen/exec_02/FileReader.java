package com.eheinen.exec_02;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class FileReader extends SimpleFileVisitor<Path> {
	private Path source;
	private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.txt");

	public FileReader(Path source){
		this.source = source;
	}
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		System.out.println("Searching for (" + file.getFileName() + ")...");
		if (matcher.matches(file.getFileName())){
			System.out.println("Found extension (" + file.getFileName()+ "). Copying...");
			Files.copy(file, source.resolve(file.getFileName()), StandardCopyOption.REPLACE_EXISTING);
		}
		return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		System.out.println("Failed ");
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		System.out.println("Searching in directory " + dir.getFileName()+ "...");
		return FileVisitResult.CONTINUE;
	}
	
}
