package beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "articles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Articles.findAll", query = "SELECT a FROM Articles a")
    , @NamedQuery(name = "Articles.findById", query = "SELECT a FROM Articles a WHERE a.id = :id")
    , @NamedQuery(name = "Articles.findByHeader", query = "SELECT a FROM Articles a WHERE a.header = :header")
    , @NamedQuery(name = "Articles.findByThumbnail", query = "SELECT a FROM Articles a WHERE a.thumbnail = :thumbnail")
    , @NamedQuery(name = "Articles.findByBrief", query = "SELECT a FROM Articles a WHERE a.brief = :brief")
    , @NamedQuery(name = "Articles.findByTime", query = "SELECT a FROM Articles a WHERE a.time = :time")
    , @NamedQuery(name = "Articles.findByPostBy", query = "SELECT a FROM Articles a WHERE a.postBy = :postBy")})
public class Articles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "header")
    private String header;
    @Basic(optional = false)
    @Column(name = "thumbnail")
    private String thumbnail;
    @Basic(optional = false)
    @Column(name = "brief")
    private String brief;
    @Basic(optional = false)
    @Lob
    @Column(name = "detail")
    private String detail;
    @Basic(optional = false)
    @Column(name = "time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;
    @Basic(optional = false)
    @Column(name = "post_by")
    private String postBy;

    public Articles() {
    }

    public Articles(Integer id) {
        this.id = id;
    }

    public Articles(Integer id, String header, String thumbnail, String brief, String detail, Date time, String postBy) {
        this.id = id;
        this.header = header;
        this.thumbnail = thumbnail;
        this.brief = brief;
        this.detail = detail;
        this.time = time;
        this.postBy = postBy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPostBy() {
        return postBy;
    }

    public void setPostBy(String postBy) {
        this.postBy = postBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articles)) {
            return false;
        }
        Articles other = (Articles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beans.Articles[ id=" + id + " ]";
    }

}
