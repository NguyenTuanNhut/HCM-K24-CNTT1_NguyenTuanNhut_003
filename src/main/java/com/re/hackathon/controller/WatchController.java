package com.re.hackathon.controller;

import com.re.hackathon.entity.Watch;
import com.re.hackathon.service.WatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/watches")
@RequiredArgsConstructor

public class WatchController {
    private final WatchService watchService;

    @GetMapping
    public ResponseEntity<List<Watch>> getAllWatch(){
        return ResponseEntity.ok(watchService.getAllWatch());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Watch> getWatchById(@PathVariable Long id){
        return ResponseEntity.ok(watchService.getWatchById(id));
    }
    @PostMapping
    public  ResponseEntity<Watch> addWatch(@RequestBody Watch watch){
        return ResponseEntity.status(201).body(watchService.addWatch(watch));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Watch> updateWatch(@PathVariable Long id,@RequestBody Watch watch){
        return ResponseEntity.ok(watchService.updateWatch(id,watch));
    }
    @DeleteMapping
    public ResponseEntity<Void> deleteWatch(@PathVariable Long id){
        watchService.deleteWatch(id);
        return ResponseEntity.noContent().build();
    }
}
