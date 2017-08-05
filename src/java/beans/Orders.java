package beans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orders.findAll", query = "SELECT o FROM Orders o")
    , @NamedQuery(name = "Orders.findById", query = "SELECT o FROM Orders o WHERE o.id = :id")
    , @NamedQuery(name = "Orders.findByUserId", query = "SELECT o FROM Orders o WHERE o.userId = :userId")
    , @NamedQuery(name = "Orders.findByFullName", query = "SELECT o FROM Orders o WHERE o.fullName = :fullName")
    , @NamedQuery(name = "Orders.findByAddress", query = "SELECT o FROM Orders o WHERE o.address = :address")
    , @NamedQuery(name = "Orders.findByPhone", query = "SELECT o FROM Orders o WHERE o.phone = :phone")
    , @NamedQuery(name = "Orders.findByPrdId", query = "SELECT o FROM Orders o WHERE o.prdId = :prdId")
    , @NamedQuery(name = "Orders.findByPrdName", query = "SELECT o FROM Orders o WHERE o.prdName = :prdName")
    , @NamedQuery(name = "Orders.findByPrdQuan", query = "SELECT o FROM Orders o WHERE o.prdQuan = :prdQuan")
    , @NamedQuery(name = "Orders.findByPrdCost", query = "SELECT o FROM Orders o WHERE o.prdCost = :prdCost")
    , @NamedQuery(name = "Orders.findByStatus", query = "SELECT o FROM Orders o WHERE o.status = :status")})
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "user_id")
    private String userId;
    @Basic(optional = false)
    @Column(name = "full_name")
    private String fullName;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "prd_id")
    private String prdId;
    @Basic(optional = false)
    @Column(name = "prd_name")
    private String prdName;
    @Column(name = "prd_quan")
    private Integer prdQuan;
    @Column(name = "prd_cost")
    private Integer prdCost;
    @Basic(optional = false)
    @Column(name = "status")
    private int status;

    private Products product; //get product object

    public Orders() {
    }

    public Orders(Integer id) {
        this.id = id;
    }

    public Orders(Integer id, String userId, String fullName, String address, String phone, String prdId, String prdName, int status) {
        this.id = id;
        this.userId = userId;
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.prdId = prdId;
        this.prdName = prdName;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPrdId() {
        return prdId;
    }

    public void setPrdId(String prdId) {
        this.prdId = prdId;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    public Integer getPrdQuan() {
        return prdQuan;
    }

    public void setPrdQuan(Integer prdQuan) {
        this.prdQuan = prdQuan;
    }

    public Integer getPrdCost() {
        Integer prdCost = product.getPrice() * prdQuan;
        return prdCost;
    }

    public void setPrdCost(Integer prdCost) {
        this.prdCost = prdCost;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public Products getProduct() {
        return product;
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
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beans.Orders[ id=" + id + " ]";
    }

}
