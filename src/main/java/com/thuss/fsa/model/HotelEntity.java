package com.thuss.fsa.model;

import javax.persistence.*;

/**
 * Created by 陈威行 on 2016/12/10.
 */
@Entity
@Table(name = "hotel", schema = "dbo", catalog = "hotel")
public class HotelEntity {
    private long hotelId;
    private String hotelName;
    private String caixi;
    private String format;
    private String fastHotel;
    private Double numOfTable;
    private Double numOfSeat;
    private Double numOfWaiter;
    private Double numOfFoodcate;
    private Double numOfFood;
    private Double numOfMember;
    private Double numOfPrinter;
    private Double numOfPrinterNet;
    private Double numOfPrinterDrv;

    @Id
    @Column(name = "hotel_id", nullable = false)
    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    @Basic
    @Column(name = "hotel_name", nullable = true, length = 255)
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Basic
    @Column(name = "caixi", nullable = true, length = 255)
    public String getCaixi() {
        return caixi;
    }

    public void setCaixi(String caixi) {
        this.caixi = caixi;
    }

    @Basic
    @Column(name = "format", nullable = true, length = 255)
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Basic
    @Column(name = "fast_hotel", nullable = true, length = 255)
    public String getFastHotel() {
        return fastHotel;
    }

    public void setFastHotel(String fastHotel) {
        this.fastHotel = fastHotel;
    }

    @Basic
    @Column(name = "num_of_table", nullable = true, precision = 0)
    public Double getNumOfTable() {
        return numOfTable;
    }

    public void setNumOfTable(Double numOfTable) {
        this.numOfTable = numOfTable;
    }

    @Basic
    @Column(name = "num_of_seat", nullable = true, precision = 0)
    public Double getNumOfSeat() {
        return numOfSeat;
    }

    public void setNumOfSeat(Double numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    @Basic
    @Column(name = "num_of_waiter", nullable = true, precision = 0)
    public Double getNumOfWaiter() {
        return numOfWaiter;
    }

    public void setNumOfWaiter(Double numOfWaiter) {
        this.numOfWaiter = numOfWaiter;
    }

    @Basic
    @Column(name = "num_of_foodcate", nullable = true, precision = 0)
    public Double getNumOfFoodcate() {
        return numOfFoodcate;
    }

    public void setNumOfFoodcate(Double numOfFoodcate) {
        this.numOfFoodcate = numOfFoodcate;
    }

    @Basic
    @Column(name = "num_of_food", nullable = true, precision = 0)
    public Double getNumOfFood() {
        return numOfFood;
    }

    public void setNumOfFood(Double numOfFood) {
        this.numOfFood = numOfFood;
    }

    @Basic
    @Column(name = "num_of_member", nullable = true, precision = 0)
    public Double getNumOfMember() {
        return numOfMember;
    }

    public void setNumOfMember(Double numOfMember) {
        this.numOfMember = numOfMember;
    }

    @Basic
    @Column(name = "num_of_printer", nullable = true, precision = 0)
    public Double getNumOfPrinter() {
        return numOfPrinter;
    }

    public void setNumOfPrinter(Double numOfPrinter) {
        this.numOfPrinter = numOfPrinter;
    }

    @Basic
    @Column(name = "num_of_printer_net", nullable = true, precision = 0)
    public Double getNumOfPrinterNet() {
        return numOfPrinterNet;
    }

    public void setNumOfPrinterNet(Double numOfPrinterNet) {
        this.numOfPrinterNet = numOfPrinterNet;
    }

    @Basic
    @Column(name = "num_of_printer_drv", nullable = true, precision = 0)
    public Double getNumOfPrinterDrv() {
        return numOfPrinterDrv;
    }

    public void setNumOfPrinterDrv(Double numOfPrinterDrv) {
        this.numOfPrinterDrv = numOfPrinterDrv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HotelEntity that = (HotelEntity) o;

        if (hotelId != that.hotelId) return false;
        if (hotelName != null ? !hotelName.equals(that.hotelName) : that.hotelName != null) return false;
        if (caixi != null ? !caixi.equals(that.caixi) : that.caixi != null) return false;
        if (format != null ? !format.equals(that.format) : that.format != null) return false;
        if (fastHotel != null ? !fastHotel.equals(that.fastHotel) : that.fastHotel != null) return false;
        if (numOfTable != null ? !numOfTable.equals(that.numOfTable) : that.numOfTable != null) return false;
        if (numOfSeat != null ? !numOfSeat.equals(that.numOfSeat) : that.numOfSeat != null) return false;
        if (numOfWaiter != null ? !numOfWaiter.equals(that.numOfWaiter) : that.numOfWaiter != null) return false;
        if (numOfFoodcate != null ? !numOfFoodcate.equals(that.numOfFoodcate) : that.numOfFoodcate != null)
            return false;
        if (numOfFood != null ? !numOfFood.equals(that.numOfFood) : that.numOfFood != null) return false;
        if (numOfMember != null ? !numOfMember.equals(that.numOfMember) : that.numOfMember != null) return false;
        if (numOfPrinter != null ? !numOfPrinter.equals(that.numOfPrinter) : that.numOfPrinter != null) return false;
        if (numOfPrinterNet != null ? !numOfPrinterNet.equals(that.numOfPrinterNet) : that.numOfPrinterNet != null)
            return false;
        if (numOfPrinterDrv != null ? !numOfPrinterDrv.equals(that.numOfPrinterDrv) : that.numOfPrinterDrv != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (hotelId ^ (hotelId >>> 32));
        result = 31 * result + (hotelName != null ? hotelName.hashCode() : 0);
        result = 31 * result + (caixi != null ? caixi.hashCode() : 0);
        result = 31 * result + (format != null ? format.hashCode() : 0);
        result = 31 * result + (fastHotel != null ? fastHotel.hashCode() : 0);
        result = 31 * result + (numOfTable != null ? numOfTable.hashCode() : 0);
        result = 31 * result + (numOfSeat != null ? numOfSeat.hashCode() : 0);
        result = 31 * result + (numOfWaiter != null ? numOfWaiter.hashCode() : 0);
        result = 31 * result + (numOfFoodcate != null ? numOfFoodcate.hashCode() : 0);
        result = 31 * result + (numOfFood != null ? numOfFood.hashCode() : 0);
        result = 31 * result + (numOfMember != null ? numOfMember.hashCode() : 0);
        result = 31 * result + (numOfPrinter != null ? numOfPrinter.hashCode() : 0);
        result = 31 * result + (numOfPrinterNet != null ? numOfPrinterNet.hashCode() : 0);
        result = 31 * result + (numOfPrinterDrv != null ? numOfPrinterDrv.hashCode() : 0);
        return result;
    }
}
