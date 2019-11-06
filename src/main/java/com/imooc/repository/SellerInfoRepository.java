package com.imooc.repository;

import com.imooc.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 贺永明
 * 2019-07-23 23:04
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {
    SellerInfo findByOpenid(String openid);
}
