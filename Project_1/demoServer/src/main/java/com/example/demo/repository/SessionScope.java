package com.example.demo.repository;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


import java.io.Serializable;
import java.util.Date;

@Scope("singleton")
@Component
@Data
public class SessionScope implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter @Setter
    private String msg;

    @Getter @Setter
    private Date date;

    public String toString()
    {
        return msg + " : " + date;
    }

}
