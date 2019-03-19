package com.jing.tong.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * <p></p>
 *
 * @author xujiuhua
 * @since JDK 1.8
 */
@Data
public class User implements Serializable {
    private long id;
    private String username;
    private String password;
}
