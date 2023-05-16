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
    private String band_name;
    @Column(name = "album_name")
    private String album_name;
    @Column(name = "support_type")
    private String support_type;
    @Column(name = "music_type")
    private String music_type;
    @Column(name = "price")
    private Double price;

    public Product() {
    }

    public Product(String band_name, String album_name, String support_type, String music_type, Double price) {
        this.band_name = band_name;
        this.album_name = album_name;
        this.support_type = support_type;
        this.music_type = music_type;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBand_name() {
        return band_name;
    }

    public void setBand_name(String band_name) {
        this.band_name = band_name;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getSupport_type() {
        return support_type;
    }

    public void setSupport_type(String s) {
        this.support_type = support_type;
    }
    public String getMusic_type() {
        return music_type;
    }

    public void setMusic_type(String music_type) {
        this.music_type = music_type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", band_name='" + band_name + '\'' +
                ", album_name='" + album_name + '\'' +
                ", support_type='" + support_type + '\'' +
                ", music_type='" + music_type + '\'' +
                ", price=" + price +
                '}';
    }
}


