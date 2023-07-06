package com.gabriel.api.service.mapper;



import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class Mapper {

    private static ModelMapper mapper = new ModelMapper();

    public static <O, D> D parseObjetc(O origin, Class<D> destination){
        return mapper.map(origin, destination);
    }

    public static <O, D> List<D> parseListObjetc(List<O> origin, Class<D> destination){
        List<D> destinationObjects = new ArrayList<>();
        for(O o : origin){
            destinationObjects.add(mapper.map(o, destination));
        }
        return destinationObjects;
    }
}