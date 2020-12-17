package com.smallpoxlviv.controller;

import com.smallpoxlviv.service.GeneralService;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GeneralController<T> {
    GeneralService<T> getService();
    ResponseEntity<List<T>> findAll();
    ResponseEntity<T> findById(Long id);
    ResponseEntity<T> create(T entity);
    ResponseEntity<T> update(Long id, T entity);
    ResponseEntity<T> delete(Long id);
}