package com.zezai.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //无参构造
@AllArgsConstructor  //全参构造方法
public class tbl_book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
