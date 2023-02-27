package com.wonderlabs.tms.controller;

import com.wonderlabs.tms.dto.TransactionDetailsDTO;
import com.wonderlabs.tms.service.TransactionDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/tms")
public class TransactionDetailsController {

    @Autowired
    private TransactionDetailsService transactionDetailsService;

    @GetMapping("/transactionDetails/{id}")
    public ResponseEntity<TransactionDetailsDTO> getTransactionDetails(@PathVariable(value = "id") String id) {
        TransactionDetailsDTO TransactionDetailsDTO = transactionDetailsService.findTransactionDetailsById(id);
        return new ResponseEntity<>(TransactionDetailsDTO, HttpStatus.OK);
    }

    @PostMapping("/transactionDetails/create")
    public ResponseEntity createTransactionDetails(@RequestBody TransactionDetailsDTO TransactionDetailsDTO) {
        transactionDetailsService.createTransactionDetails(TransactionDetailsDTO);
        return new ResponseEntity<>(TransactionDetailsDTO, HttpStatus.CREATED);
    }

    @PutMapping("/transactionDetails/update/{id}")
    public ResponseEntity updateComment(@PathVariable("id") String id, @RequestBody TransactionDetailsDTO TransactionDetailsDTO) {
        transactionDetailsService.updateTransactionDetails(id, TransactionDetailsDTO);
        return new ResponseEntity(TransactionDetailsDTO, HttpStatus.OK);
    }

    @DeleteMapping("/transactionDetails/delete/{id}")
    public ResponseEntity<HttpStatus> deleteComment(@PathVariable("id") String id) {
        transactionDetailsService.deleteTransactionDetails(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}