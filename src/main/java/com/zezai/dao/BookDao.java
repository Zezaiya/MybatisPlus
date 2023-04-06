package com.zezai.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zezai.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {//泛型就是数据库的名称,也是你实体类的名称,两者要一致

}
