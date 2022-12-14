package com.vmware.ssrs.service;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;

@Service
public class SpecificationService {
    static final String openAPIv2SpecFile = "src/main/resources/external/SwaggerPetStore_v2.json";
    static final String openAPIv3SpecFile = "src/main/resources/external/SwaggerPetStore_v3.json";

    static final String openAPIHostSpecFile = "src/main/resources/spec/OpenAPIHost.yaml";

    /**
     * This is supposed to come from external service.
     */
    public String getV2PetstoreSpecification() {
        String result = null;

        try {
            result = readFile(openAPIv2SpecFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return result;
    }

    /**
     * This is supposed to come from external service.
     */
    public String getV3PetstoreSpecification() {
        String result = null;

        try {
            result = readFile(openAPIv3SpecFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return result;
    }

    public String getHostSpecification(String host) {
        String result = null;

        try {
            result = readFile(openAPIHostSpecFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // inject the url of the server in the host spec string - this way we always return correct url
        result = result.replace("${hostUrl}", host);

        return result;
    }

    private String readFile(String file) throws IOException {
        return Files.readString(Paths.get(file));
    }
}
