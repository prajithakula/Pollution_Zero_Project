package com.rentbyke.demo.services;

public @interface Transactional {
    boolean readOnly();
}
