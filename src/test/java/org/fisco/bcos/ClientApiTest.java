package org.fisco.bcos;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.math.BigInteger;
import org.junit.Test;

public class ClientApiTest extends BaseTest {
    @Test
    public void getBlockNumber() throws IOException {
        BigInteger blockNumber = client.getBlockNumber().getBlockNumber();
        assertTrue(blockNumber.compareTo(new BigInteger("0")) >= 0);
    }
}
