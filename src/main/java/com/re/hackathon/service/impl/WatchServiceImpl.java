package com.re.hackathon.service.impl;

import com.re.hackathon.entity.Watch;
import com.re.hackathon.repository.WatchRepostitory;
import com.re.hackathon.service.WatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@RequiredArgsConstructor

public class WatchServiceImpl implements WatchService {
    WatchRepostitory watchRepostitory;
    @Override
    public List<Watch> getAllWatch() {
        return watchRepostitory.findAll();
    }
    @Override
    public Watch getWatchById(@PathVariable Long Id) {
        return watchRepostitory.findById(Id).orElse(null);
    }
    @Override
    public  Watch addWatch(@RequestBody Watch watch) {
        return watchRepostitory.save(watch);
    }
    @Override
    public Watch updateWatch(@PathVariable Long id,@RequestBody Watch watch){
        Watch exiting=getWatchById(id);
        exiting.setId(watch.getId());
        exiting.setModelName(watch.getModelName());
        exiting.setBrand(watch.getBrand());
        exiting.setPrice(watch.getPrice());
        exiting.setMovement_type(watch.getMovement_type());
        exiting.setStatus(watch.getStatus());
        return watchRepostitory.save(exiting);
    }
    @Override
    public void deleteWatch(@PathVariable Long id){
        watchRepostitory.delete(getWatchById(id));
    }
}
