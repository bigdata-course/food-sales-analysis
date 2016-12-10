package com.thuss.fsa.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by 陈威行 on 2016/12/10.
 */
@Entity
@Table(name = "food", schema = "dbo", catalog = "hotel")
public class FoodEntity {
    private long id;
    private Long hotelId;
    private String foodName;
    private Double unitMoney;
    private Long cateCode;
    private String cateName;
    private Timestamp createTime;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "hotel_id", nullable = true)
    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    @Basic
    @Column(name = "food_name", nullable = true, length = 255)
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Basic
    @Column(name = "unit_money", nullable = true, precision = 0)
    public Double getUnitMoney() {
        return unitMoney;
    }

    public void setUnitMoney(Double unitMoney) {
        this.unitMoney = unitMoney;
    }

    @Basic
    @Column(name = "cate_code", nullable = true)
    public Long getCateCode() {
        return cateCode;
    }

    public void setCateCode(Long cateCode) {
        this.cateCode = cateCode;
    }

    @Basic
    @Column(name = "cate_name", nullable = true, length = 255)
    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FoodEntity that = (FoodEntity) o;

        if (id != that.id) return false;
        if (hotelId != null ? !hotelId.equals(that.hotelId) : that.hotelId != null) return false;
        if (foodName != null ? !foodName.equals(that.foodName) : that.foodName != null) return false;
        if (unitMoney != null ? !unitMoney.equals(that.unitMoney) : that.unitMoney != null) return false;
        if (cateCode != null ? !cateCode.equals(that.cateCode) : that.cateCode != null) return false;
        if (cateName != null ? !cateName.equals(that.cateName) : that.cateName != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (hotelId != null ? hotelId.hashCode() : 0);
        result = 31 * result + (foodName != null ? foodName.hashCode() : 0);
        result = 31 * result + (unitMoney != null ? unitMoney.hashCode() : 0);
        result = 31 * result + (cateCode != null ? cateCode.hashCode() : 0);
        result = 31 * result + (cateName != null ? cateName.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
