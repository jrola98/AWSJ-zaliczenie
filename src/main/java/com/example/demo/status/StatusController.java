package com.example.demo.status;

import com.example.demo.status.model.Status;
import com.example.demo.status.repository.StatusRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Slf4j
@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    StatusRepository statusRepository;

    @RequestMapping(method = GET)
    public List<Status> getStatuses() {
        log.info("Return all statuses.");
        return statusRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = GET)
    public Status getStatus(@PathVariable("id") long id) {
        log.info("Get status with id: {}", id);
        return statusRepository.getById(id);
    }
}
