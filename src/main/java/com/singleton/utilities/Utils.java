package com.singleton.utilities;

import org.springframework.stereotype.Service;

@Service
public class Utils {

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}
