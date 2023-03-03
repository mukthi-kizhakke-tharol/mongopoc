/*
package com.example.reactive.mongodb.config;

import com.example.reactive.mongodb.entity.Experiment;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ExperimentConverter implements Converter<Experiment, DBObject> {
    @Override
    public DBObject convert(Experiment experiment) {
        DBObject dbObject = new BasicDBObject();
        dbObject.put("name", experiment.getName());
        dbObject.put("id", experiment.getId());
        return dbObject;
    }
}
*/
