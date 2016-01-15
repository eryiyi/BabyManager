package com.liangxunwang.unimanager.dao;

import com.liangxunwang.unimanager.model.Member;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by liuzwei on 2015/1/29.
 */
@Repository("memberDao")
public interface MemberDao {

    /**
     * 查询所有的萌宝信息
     */
    List<Member> listMemberByName(Map<String,Object> map);
}
