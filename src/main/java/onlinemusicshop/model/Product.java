package onlinemusicshop.model;

import jakarta.persistence.*;
import onlinemusicshop.model.enums.SupportType;

@Entity
@Table(name = "product")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "band_name")
    private String bandName;
    @Column(name = "album_name")
    private String albumName;
    @Column(name = "support_type")
    @Enumerated(EnumType.STRING)
    private SupportType supportType;
    @Column(name = "music_type")
    private String musicType;
    @Column(name = "price")
    private Double price;
    @Column(name="promo_price")
    private Double promoPrice;

    @Column(name="main_image_url")
    private String mainImageUrl;

    public Product() {
    }

    public Product(Integer id, String bandName, String albumName, SupportType supportType, String musicType, Double price, Double promoPrice, String mainImageUrl) {
        this.id = id;
        this.bandName = bandName;
        this.albumName = albumName;
        this.supportType = supportType;
        this.musicType = musicType;
        this.price = price;
        this.promoPrice = promoPrice;
        this.mainImageUrl = mainImageUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public SupportType getSupportType() {
        return supportType;
    }

    public void setSupportType(SupportType supportType) {
        this.supportType = supportType;
    }

    public String getMusicType() {
        return musicType;
    }

    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(Double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public String getMainImageUrl() {
        return mainImageUrl;
    }

    public void setMainImageUrl(String mainImageUrl) {
        this.mainImageUrl = mainImageUrl;
    }
}




