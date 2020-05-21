package com.bunny.aop.service;

import com.bunny.aop.worker.Pot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedAnimalService {
    @Autowired
    Pot pot;

    public void feed() throws Exception {
        pot.feedAnimal();
    }

    public void pet() throws Exception {
        pot.petAnimal();
    }
}
