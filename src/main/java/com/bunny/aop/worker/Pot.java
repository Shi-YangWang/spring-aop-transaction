package com.bunny.aop.worker;

import org.springframework.stereotype.Service;

@Service
public class Pot {
    public void feedAnimal() throws Exception {
        if (Math.random() > 0.3d) {
            // resemble the network delay in connecting to e.g. register center.
            Thread.sleep(2000);
            throw new Exception();
        }
        System.out.println("feed animal");
    }

    public void petAnimal() throws Exception {
        if (Math.random() > 0.3d) {
            // resemble the network delay in connecting to e.g. register center.
            Thread.sleep(2000);
            throw new Exception();
        }
        System.out.println("pet animal");
    }
}
