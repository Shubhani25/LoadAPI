package com.liveasy.LoadAPI.service;

import com.liveasy.LoadAPI.entity.Load;
import com.liveasy.LoadAPI.repository.LoadRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoadService {

    private final LoadRepository loadRepository;
    public LoadService(LoadRepository loadRepository) {
        this.loadRepository = loadRepository;
    }

    public Load fetchLoadById(Integer id) {
        return loadRepository.findById(id).orElse(null);
    }

    public List<Load> fetchLoadByShipperId(Integer shipperId) {
        return loadRepository.findAllByShipperId(shipperId);
    }

    public Load saveLoad(Load load) {
        Load savedLoad = null;
        Optional<Load> existingLoad = loadRepository.findById(load.getId());
        if(null == existingLoad){
            savedLoad = loadRepository.save(load);
        }
        return savedLoad;
    }


    public void deleteLoad(Integer id) {
        Load existingLoad = loadRepository.findById(id).orElse(null);
        if(null != existingLoad){
            loadRepository.delete(existingLoad);
        }
    }

}
