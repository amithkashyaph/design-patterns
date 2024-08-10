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
}
