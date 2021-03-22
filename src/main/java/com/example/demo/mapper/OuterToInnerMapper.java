package com.example.demo.mapper;

import com.example.demo.model.InnerEntity;
import com.example.demo.model.OuterEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OuterToInnerMapper {

  @Mapping(target = "firstname", constant = "Doe")
  InnerEntity mapToInner(OuterEntity outerEntity);

}
