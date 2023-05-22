package com.btest.service;

import com.btest.model.BRecord;
import com.btest.repository.BRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BService {
    @Autowired
    BRepository brepository;

    public void save(BRecord bRecord) {
        brepository.save(bRecord);
    }
    public Optional<BRecord> get(Long id) {
       return brepository.findById(id);
    }
}
