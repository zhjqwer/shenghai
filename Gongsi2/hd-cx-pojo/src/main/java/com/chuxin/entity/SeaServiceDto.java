package com.chuxin.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Create BY z on 2019/11/28
 */
public class SeaServiceDto implements Serializable {

    private Integer id;

    private Integer ship_id;

    private Date start_time;

    private Date end_time;

    private Integer booking_time_id;

    private String embark_site;

    private String disembark_site;

    private Integer most_people;

    private String remarks;

    private BigDecimal price;

    private BigDecimal present_price;

    private Integer details_id;

    private String region;

    private String target_island;

    private String spare_one;

    private String spare_two;

    private Date register_time;

    private Date update_time;

    private Integer update_name;
    //-----------------------------------------------------------------------
    private Integer u_id;

    private String ship_name;

    private String ship_img;

    private String ship_type;

    private Integer ship_length;

    private Integer ship_width;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShip_id() {
        return ship_id;
    }

    public void setShip_id(Integer ship_id) {
        this.ship_id = ship_id;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public String getEmbark_site() {
        return embark_site;
    }

    public void setEmbark_site(String embark_site) {
        this.embark_site = embark_site;
    }

    public String getDisembark_site() {
        return disembark_site;
    }

    public void setDisembark_site(String disembark_site) {
        this.disembark_site = disembark_site;
    }

    public Integer getMost_people() {
        return most_people;
    }

    public void setMost_people(Integer most_people) {
        this.most_people = most_people;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPresent_price() {
        return present_price;
    }

    public void setPresent_price(BigDecimal present_price) {
        this.present_price = present_price;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTarget_island() {
        return target_island;
    }

    public void setTarget_island(String target_island) {
        this.target_island = target_island;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getShip_name() {
        return ship_name;
    }

    public void setShip_name(String ship_name) {
        this.ship_name = ship_name;
    }

    public String getShip_img() {
        return ship_img;
    }

    public void setShip_img(String ship_img) {
        this.ship_img = ship_img;
    }

    public String getShip_type() {
        return ship_type;
    }

    public void setShip_type(String ship_type) {
        this.ship_type = ship_type;
    }

    public Integer getShip_length() {
        return ship_length;
    }

    public void setShip_length(Integer ship_length) {
        this.ship_length = ship_length;
    }

    public Integer getShip_width() {
        return ship_width;
    }

    public void setShip_width(Integer ship_width) {
        this.ship_width = ship_width;
    }

    public Integer getBooking_time_id() {
        return booking_time_id;
    }

    public void setBooking_time_id(Integer booking_time_id) {
        this.booking_time_id = booking_time_id;
    }

    public Integer getDetails_id() {
        return details_id;
    }

    public void setDetails_id(Integer details_id) {
        this.details_id = details_id;
    }

    public String getSpare_one() {
        return spare_one;
    }

    public void setSpare_one(String spare_one) {
        this.spare_one = spare_one;
    }

    public String getSpare_two() {
        return spare_two;
    }

    public void setSpare_two(String spare_two) {
        this.spare_two = spare_two;
    }

    public Date getRegister_time() {
        return register_time;
    }

    public void setRegister_time(Date register_time) {
        this.register_time = register_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Integer getUpdate_name() {
        return update_name;
    }

    public void setUpdate_name(Integer update_name) {
        this.update_name = update_name;
    }

    public SeaServiceDto() {
    }

    public SeaServiceDto(Integer id, Integer ship_id, Date start_time, Date end_time, Integer booking_time_id, String embark_site, String disembark_site, Integer most_people, String remarks, BigDecimal price, BigDecimal present_price, Integer details_id, String region, String target_island, String spare_one, String spare_two, Date register_time, Date update_time, Integer update_name, Integer u_id, String ship_name, String ship_img, String ship_type, Integer ship_length, Integer ship_width) {
        this.id = id;
        this.ship_id = ship_id;
        this.start_time = start_time;
        this.end_time = end_time;
        this.booking_time_id = booking_time_id;
        this.embark_site = embark_site;
        this.disembark_site = disembark_site;
        this.most_people = most_people;
        this.remarks = remarks;
        this.price = price;
        this.present_price = present_price;
        this.details_id = details_id;
        this.region = region;
        this.target_island = target_island;
        this.spare_one = spare_one;
        this.spare_two = spare_two;
        this.register_time = register_time;
        this.update_time = update_time;
        this.update_name = update_name;
        this.u_id = u_id;
        this.ship_name = ship_name;
        this.ship_img = ship_img;
        this.ship_type = ship_type;
        this.ship_length = ship_length;
        this.ship_width = ship_width;
    }

    @Override
    public String toString() {
        return "SeaServiceDto{" +
                "id=" + id +
                ", ship_id=" + ship_id +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", booking_time_id=" + booking_time_id +
                ", embark_site='" + embark_site + '\'' +
                ", disembark_site='" + disembark_site + '\'' +
                ", most_people=" + most_people +
                ", remarks='" + remarks + '\'' +
                ", price=" + price +
                ", present_price=" + present_price +
                ", details_id=" + details_id +
                ", region='" + region + '\'' +
                ", target_island='" + target_island + '\'' +
                ", spare_one='" + spare_one + '\'' +
                ", spare_two='" + spare_two + '\'' +
                ", register_time=" + register_time +
                ", update_time=" + update_time +
                ", update_name=" + update_name +
                ", u_id=" + u_id +
                ", ship_name='" + ship_name + '\'' +
                ", ship_img='" + ship_img + '\'' +
                ", ship_type='" + ship_type + '\'' +
                ", ship_length=" + ship_length +
                ", ship_width=" + ship_width +
                '}';
    }
}
