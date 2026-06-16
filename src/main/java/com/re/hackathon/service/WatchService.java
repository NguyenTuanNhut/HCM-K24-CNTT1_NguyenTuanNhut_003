package com.re.hackathon.service;

import com.re.hackathon.entity.Watch;
import org.springframework.stereotype.Service;

import java.util.List;


public interface WatchService {
     public List<Watch> getAllWatch();
     public Watch getWatchById(Long id);
     public Watch addWatch(Watch watch);
     public Watch updateWatch(Long id,Watch watch);
     public void deleteWatch(Long id);
}
