package org.designpatterns.structural.decorator;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestDecorator {

    @Test
    public void testEncryptionDecoration() {
        Datasource datasource = new FileDatasource();
        BaseDecorator encryptDecorator = new EncryptDatasourceDecorator(datasource);
        String encryptedData = encryptDecorator.read();

        assertEquals(encryptedData, "Reading data decrypted");
    }

    @Test
    public void testCompressionDecoration() {
        Datasource datasource = new FileDatasource();
        BaseDecorator compressDecorator = new CompressDatasourceDecrator(datasource);

        String compressedData = compressDecorator.read();

        assertEquals(compressedData, "Reading data decompressed");
    }

    @Test
    public void testEncryptionCompressionDecoration() {
        Datasource datasource = new FileDatasource();
        EncryptDatasourceDecorator encryptDatasourceDecorator = new EncryptDatasourceDecorator(datasource);
        CompressDatasourceDecrator compressDatasourceDecrator = new CompressDatasourceDecrator(encryptDatasourceDecorator);

        String encryptedCompressedData = compressDatasourceDecrator.read();

        assertEquals(encryptedCompressedData, "Reading data decrypted decompressed");
    }
}
