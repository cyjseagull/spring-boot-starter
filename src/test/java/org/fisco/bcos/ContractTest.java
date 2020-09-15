package org.fisco.bcos;

import static org.junit.Assert.assertTrue;

import org.fisco.bcos.contract.HelloWorld;
import org.junit.Test;

public class ContractTest extends BaseTest {
    @Test
    public void deployAndCallHelloWorld() throws Exception {
        // deploy contract
        HelloWorld helloWorld = HelloWorld.deploy(client, client.getCryptoInterface());
        if (helloWorld != null) {
            System.out.println("HelloWorld address is: " + helloWorld.getContractAddress());
            // call set function
            helloWorld.set("Hello, World!");
            // call get function
            String result = helloWorld.get();
            System.out.println(result);
            assertTrue("Hello, World!".equals(result));
        }
    }
}
