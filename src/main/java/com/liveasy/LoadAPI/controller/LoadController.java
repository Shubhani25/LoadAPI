package com.liveasy.LoadAPI.controller;

import com.liveasy.LoadAPI.entity.Load;
import com.liveasy.LoadAPI.service.LoadService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/load")
public class LoadController {

    private final LoadService loadService;
    public LoadController(LoadService loadService) {
        this.loadService = loadService;
    }

    @GetMapping("/{load_id}")
    public Load fetchLoadById(@Validated @PathVariable("load_id") Integer id) {
        return loadService.fetchLoadById(id);
    }

    @GetMapping("/fetch_load_by_shipper_id/{shipper_id}")
    public List<Load> fetchLoadByShipperId(@Validated @PathVariable("shipper_id") Integer shipperId) {
        return loadService.fetchLoadByShipperId(shipperId);
    }

    @PostMapping
    public Load saveOrder(@Validated @RequestBody Load load) {
        return loadService.saveLoad(load);
    }

    /*@DeleteMapping("delete_load/{load_id}")
    public void deleteLoad(@Validated @PathVariable("load_id") Integer id) {
        loadService.deleteLoad(id);
    }*/

    @DeleteMapping("/delete_load/{load_id}")
    public void deleteLoad(@Validated @PathVariable("load_id") Integer id) {
        loadService.deleteLoad(id);
    }


}
