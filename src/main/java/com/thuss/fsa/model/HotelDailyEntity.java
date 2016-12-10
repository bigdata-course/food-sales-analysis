package com.thuss.fsa.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by 陈威行 on 2016/12/10.
 */
@Entity
@Table(name = "hotel_daily", schema = "dbo", catalog = "hotel")
public class HotelDailyEntity {
    private long id;
    private Long hotelId;
    private Integer version;
    private Date theDate;
    private Double totalOrders;
    private Double totalNeedMoney;
    private Double totalPeople;
    private Double turningRate;
    private Double avgNeedMoneyP;
    private Double avgNeedMoney;
    private Double maxNeedMoney;
    private Double maxUsedTime;
    private Double avgUsedTime;
    private Double maxPeople;
    private Double avgPeople;

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
    @Column(name = "version", nullable = true)
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Basic
    @Column(name = "the_date", nullable = true)
    public Date getTheDate() {
        return theDate;
    }

    public void setTheDate(Date theDate) {
        this.theDate = theDate;
    }

    @Basic
    @Column(name = "total_orders", nullable = true, precision = 0)
    public Double getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(Double totalOrders) {
        this.totalOrders = totalOrders;
    }

    @Basic
    @Column(name = "total_need_money", nullable = true, precision = 0)
    public Double getTotalNeedMoney() {
        return totalNeedMoney;
    }

    public void setTotalNeedMoney(Double totalNeedMoney) {
        this.totalNeedMoney = totalNeedMoney;
    }

    @Basic
    @Column(name = "total_people", nullable = true, precision = 0)
    public Double getTotalPeople() {
        return totalPeople;
    }

    public void setTotalPeople(Double totalPeople) {
        this.totalPeople = totalPeople;
    }

    @Basic
    @Column(name = "turning_rate", nullable = true, precision = 0)
    public Double getTurningRate() {
        return turningRate;
    }

    public void setTurningRate(Double turningRate) {
        this.turningRate = turningRate;
    }

    @Basic
    @Column(name = "avg_need_money_p", nullable = true, precision = 0)
    public Double getAvgNeedMoneyP() {
        return avgNeedMoneyP;
    }

    public void setAvgNeedMoneyP(Double avgNeedMoneyP) {
        this.avgNeedMoneyP = avgNeedMoneyP;
    }

    @Basic
    @Column(name = "avg_need_money", nullable = true, precision = 0)
    public Double getAvgNeedMoney() {
        return avgNeedMoney;
    }

    public void setAvgNeedMoney(Double avgNeedMoney) {
        this.avgNeedMoney = avgNeedMoney;
    }

    @Basic
    @Column(name = "max_need_money", nullable = true, precision = 0)
    public Double getMaxNeedMoney() {
        return maxNeedMoney;
    }

    public void setMaxNeedMoney(Double maxNeedMoney) {
        this.maxNeedMoney = maxNeedMoney;
    }

    @Basic
    @Column(name = "max_used_time", nullable = true, precision = 0)
    public Double getMaxUsedTime() {
        return maxUsedTime;
    }

    public void setMaxUsedTime(Double maxUsedTime) {
        this.maxUsedTime = maxUsedTime;
    }

    @Basic
    @Column(name = "avg_used_time", nullable = true, precision = 0)
    public Double getAvgUsedTime() {
        return avgUsedTime;
    }

    public void setAvgUsedTime(Double avgUsedTime) {
        this.avgUsedTime = avgUsedTime;
    }

    @Basic
    @Column(name = "max_people", nullable = true, precision = 0)
    public Double getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Double maxPeople) {
        this.maxPeople = maxPeople;
    }

    @Basic
    @Column(name = "avg_people", nullable = true, precision = 0)
    public Double getAvgPeople() {
        return avgPeople;
    }

    public void setAvgPeople(Double avgPeople) {
        this.avgPeople = avgPeople;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HotelDailyEntity that = (HotelDailyEntity) o;

        if (id != that.id) return false;
        if (hotelId != null ? !hotelId.equals(that.hotelId) : that.hotelId != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        if (theDate != null ? !theDate.equals(that.theDate) : that.theDate != null) return false;
        if (totalOrders != null ? !totalOrders.equals(that.totalOrders) : that.totalOrders != null) return false;
        if (totalNeedMoney != null ? !totalNeedMoney.equals(that.totalNeedMoney) : that.totalNeedMoney != null)
            return false;
        if (totalPeople != null ? !totalPeople.equals(that.totalPeople) : that.totalPeople != null) return false;
        if (turningRate != null ? !turningRate.equals(that.turningRate) : that.turningRate != null) return false;
        if (avgNeedMoneyP != null ? !avgNeedMoneyP.equals(that.avgNeedMoneyP) : that.avgNeedMoneyP != null)
            return false;
        if (avgNeedMoney != null ? !avgNeedMoney.equals(that.avgNeedMoney) : that.avgNeedMoney != null) return false;
        if (maxNeedMoney != null ? !maxNeedMoney.equals(that.maxNeedMoney) : that.maxNeedMoney != null) return false;
        if (maxUsedTime != null ? !maxUsedTime.equals(that.maxUsedTime) : that.maxUsedTime != null) return false;
        if (avgUsedTime != null ? !avgUsedTime.equals(that.avgUsedTime) : that.avgUsedTime != null) return false;
        if (maxPeople != null ? !maxPeople.equals(that.maxPeople) : that.maxPeople != null) return false;
        if (avgPeople != null ? !avgPeople.equals(that.avgPeople) : that.avgPeople != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (hotelId != null ? hotelId.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (theDate != null ? theDate.hashCode() : 0);
        result = 31 * result + (totalOrders != null ? totalOrders.hashCode() : 0);
        result = 31 * result + (totalNeedMoney != null ? totalNeedMoney.hashCode() : 0);
        result = 31 * result + (totalPeople != null ? totalPeople.hashCode() : 0);
        result = 31 * result + (turningRate != null ? turningRate.hashCode() : 0);
        result = 31 * result + (avgNeedMoneyP != null ? avgNeedMoneyP.hashCode() : 0);
        result = 31 * result + (avgNeedMoney != null ? avgNeedMoney.hashCode() : 0);
        result = 31 * result + (maxNeedMoney != null ? maxNeedMoney.hashCode() : 0);
        result = 31 * result + (maxUsedTime != null ? maxUsedTime.hashCode() : 0);
        result = 31 * result + (avgUsedTime != null ? avgUsedTime.hashCode() : 0);
        result = 31 * result + (maxPeople != null ? maxPeople.hashCode() : 0);
        result = 31 * result + (avgPeople != null ? avgPeople.hashCode() : 0);
        return result;
    }
}
