package com.jdy.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author Mr.jdy
 * @create 2020-05-27 22:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
        private Long id;
        private String serial;
}
