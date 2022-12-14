package com.vmware.ssrs.controller;

import com.vmware.ssrs.service.SpecificationService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping
public class SpecificationController {

    final SpecificationService specificationService;

    @Autowired
    public SpecificationController(SpecificationService specificationService) {
        this.specificationService = specificationService;
    }

    @GetMapping("/host-spec")
    public String getHostSpecification(@RequestHeader(HttpHeaders.HOST) String host) {

        log.info("Getting host repository");

        return specificationService.getHostSpecification(host);
    }

    @GetMapping("/v2/petstore")
    public String getV2PetstoreSpecification() {

        log.info("Getting v2 petstore specification.");

        return specificationService.getV2PetstoreSpecification();
    }

    @GetMapping("/v3/petstore")
    public String getV3PetstoreSpecification() {

        log.info("Getting v3 petstore specification.");

        return specificationService.getV3PetstoreSpecification();
    }
}
