package com.userloginregemailVer.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class EmailValidator implements Predicate {
    @Override
    public boolean test(Object o) {
        //  TODO: regex to validate email
        return true;
    }
}
