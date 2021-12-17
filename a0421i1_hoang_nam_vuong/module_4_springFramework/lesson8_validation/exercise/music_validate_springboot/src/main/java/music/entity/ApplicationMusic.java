package music.entity;

import org.hibernate.annotations.Parent;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "application_music")
public class ApplicationMusic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Size(max = 300)
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Ten khong chua ky tu dac biet")
    private String nameArtist;

    @NotBlank
    @Size(max = 1000)
    @Pattern(regexp = "^[a-zA-Z0-9,]*$", message = "Ten khong chua ky tu dac biet ngoai tru dau ','")
    private String musicType;


    private String linkMusic;

    public ApplicationMusic() {
    }

    public ApplicationMusic(Long id, String nameArtist, String musicType, String linkMusic) {
        this.id = id;
        this.nameArtist = nameArtist;
        this.musicType = musicType;
        this.linkMusic = linkMusic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameArtist() {
        return nameArtist;
    }

    public void setNameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }

    public String getMusicType() {
        return musicType;
    }

    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }

    public String getLinkMusic() {
        return linkMusic;
    }

    public void setLinkMusic(String linkMusic) {
        this.linkMusic = linkMusic;
    }
}
