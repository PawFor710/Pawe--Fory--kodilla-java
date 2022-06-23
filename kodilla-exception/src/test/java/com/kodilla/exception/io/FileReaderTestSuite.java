package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {

    @Test
    void testReadFile() {
        //Given
        FileReader fileReader = new FileReader();
        String fileName = "names.txt";
        //When and Then
        assertDoesNotThrow(() -> fileReader.readFile(fileName));
    }

    @Test
    void whenFileDosentExistReadFileShouldThrowException() {
        //Given
        FileReader fileReader = new FileReader();
        String fileName = "taki_plik_nie_istnieje.txt";
        //When and Then
        assertThrows(FileReaderException.class, () -> fileReader.readFile(fileName));
    }

    @Test
    public void testReadFileWithName() {
        //Given
        FileReader fileReader = new FileReader();
        //When and Then
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile("plik_bez_nazwy.txt")),
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile(null)),
                () -> assertDoesNotThrow(() -> fileReader.readFile("names.txt"))
        );
    }
}
