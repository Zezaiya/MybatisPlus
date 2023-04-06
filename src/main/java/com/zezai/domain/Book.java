package com.zezai.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //无参构造
@AllArgsConstructor  //全参构造方法
@TableName("tbl_book")    //设置表名,就可以不用使pojo名和表名一致
public class Book {
   // @TableId(type = IdType.AUTO)
    private Integer id;
    private String type;
    private String name;
    private String description;
}
