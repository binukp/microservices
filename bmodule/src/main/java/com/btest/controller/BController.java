package com.btest.controller;

import com.btest.model.BRecord;
import com.btest.service.BService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RestController
public class BController {

    @Autowired
    BService bService;

    @GetMapping("/btest")
    public String getData(){
        return "b1";
    }

    @PostMapping("/bsave")
    public BRecord saveBData(@RequestBody BRecord bRecord)
    {
        bService.save(bRecord);
        return bRecord;
    }

    @GetMapping("/bget/{id}")
    public Optional<BRecord> findById(@PathVariable Long id) {
        log.info("BRecord find: id={}", id);
        return bService.get(id);
    }
}
