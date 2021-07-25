package com.example.elk;

import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.Id;
import java.util.Date;

@Setter
@Document(indexName = "blog")
public class Blog {

    @Id
    private String id;
    private String title;
    private String content;

    @Field(type = FieldType.Date)
    private Date log_date;

    @Field(type = FieldType.Text)
    private String log_text;

    @Field(type = FieldType.Long)
    private Long price;


}
