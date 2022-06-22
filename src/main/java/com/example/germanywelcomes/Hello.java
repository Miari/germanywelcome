package com.example.germanywelcomes;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hello {
        @Id
        private int id;

        private String greeting;
}
