package com.example.vuemanage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.vuemanage.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper   已由MybatisPlusConfig 配置类 通过@MapperScan 引入
public interface UserMapper extends BaseMapper<User> {

/*
    //    新增
    @Insert("insert into sys_user(username,password,nickname,email,phone,address)" +
            " values(#{username},#{password},#{nickname},#{email},#{phone},#{address})")
//    @Insert("insert into sys_user values(#{id},'zhu','admin','猪八戒','zhu@gmail.com','12345678910','高老庄')")
    public int insert(UserLogin user);

 */


/*
    //    查询所有
    @Select("select * from sys_user")
    public List<UserLogin> findAll();
*/
    //    更新数据
    /** 如果采用这种写死的 SQL 语句 ，在更新数据的 时候，会发生数据丢失的情况
     * 需要使用mapper.xml文件的形式，写动态 SQL
     * @Update("update sys_user set username=#{username},password=#{password},nickname=#{nickname}," +
     * email=#{email},phone=#{phone},address=#{address} where id=#{id}")
     *
     **/

    int update(User user);

    @Delete("delete from sys_user where id = #{id}")
    Integer deleteById(@Param("id") Integer id);

//    简单分页查询
    @Select("select * from sys_user limit #{pageNum}, #{pageSize}")
    List<User> findByPage(Integer pageNum, Integer pageSize);

    @Select("select count(id) from sys_user")
    Integer selectTotal();

//    以下为根据 用户名 模糊查询
//
//    @Select("select * from sys_user where username like #{username} limit #{pageNum}, #{pageSize}")
//    List<UserLogin> findByPage2(Integer pageNum, Integer pageSize,String username);
//
//    @Select("select count(*) from sys_user where username like #{username}")
//    Integer selectTotal2(String username);



    List<User> findByPage3(Integer pageNum, Integer pageSize,String username,String email,String address);

    Integer selectTotal3(String username,String email,String address);
}
