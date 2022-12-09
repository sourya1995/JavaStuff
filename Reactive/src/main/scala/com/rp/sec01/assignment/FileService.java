package com.rp.sec01.assignment;

import reactor.core.publisher.Mono;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class FileService {
    private static final Path PATH = Paths.get("src/main/resources/assignment/sec01");

    public static Mono<String> read(String fileName){
        return Mono.fromSupplier(() -> {
            try {
                return readFile(fileName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public static Mono<Void> write(String fileName, String content){
        return Mono.fromRunnable(() -> {
            try {
                writeFile(fileName, content);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public static Mono<Void> delete(String fileName){
        return Mono.fromRunnable(() -> {
            try {
                deleteFile(fileName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private static String readFile(String fileName) throws IOException {
        return Files.readString(PATH.resolve(fileName));
    }

    private static void writeFile(String fileName, String content) throws IOException {
        Files.writeString(PATH.resolve(fileName), content);
    }

    private static void deleteFile(String fileName) throws IOException {
        Files.delete(PATH.resolve(fileName));
    }
}
