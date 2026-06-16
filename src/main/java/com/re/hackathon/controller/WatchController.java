package com.re.hackathon.controller;

import com.re.hackathon.entity.Watch;
import com.re.hackathon.service.WatchService;
import com.re.hackathon.service.impl.WatchServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/watches")
@RequiredArgsConstructor

public class WatchController {
    WatchService watchService;

    @GetMapping
    public ResponseEntity<List<Watch>> getAllWatch(){
        return ResponseEntity.ok(watchService.getAllWatch());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Watch> getWatchById(Long id){
        return ResponseEntity.ok(watchService.getWatchById(id));
    }
    @PostMapping
    public  ResponseEntity<Watch> addWatch(Watch watch){
        return ResponseEntity.ok(watchService.addWatch(watch));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Watch> updateWatch(Long id, Watch watch){
        return ResponseEntity.ok(watchService.updateWatch(id,watch));
    }
    @DeleteMapping
    public ResponseEntity<Void> deleteWatch(Long id){
        watchService.deleteWatch(id);
        return ResponseEntity.noContent().build();
    }
}
