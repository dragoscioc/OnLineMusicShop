package onlinemusicshop.model;

import jakarta.persistence.*;

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
    //TODO: create enum
    private String supportType;
    @Column(name = "music_type")
    private String musicType;
    @Column(name = "price")
    private Double price;

    public Product() {
    }

    public Product(String bandName, String albumName, String supportType, String musicType, Double price) {
        this.bandName = bandName;
        this.albumName = albumName;
        this.supportType = supportType;
        this.musicType = musicType;
        this.price = price;
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

    public String getSupportType() {
        return supportType;
    }

    public void setSupportType(String supportType) {
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
}




