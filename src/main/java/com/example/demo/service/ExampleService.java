package com.example.demo.service;

import com.example.demo.mapper.OuterToInnerMapper;
import com.example.demo.model.InnerEntity;
import com.example.demo.model.OuterEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExampleService {

  private final OuterToInnerMapper mapper;

  public InnerEntity getInner(OuterEntity outerEntity) {
    return mapper.mapToInner(outerEntity);
  }

}
