/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Objects;

/**
 *
 * @author Nal
 */
public class giaNuocCN {
    private int id;
    private String luongNuoc;
    private float donGia;
    private int namApdung;

    public giaNuocCN() {
    }

    public giaNuocCN(int id, String luongNuoc, float donGia, int namApdung) {
        this.id = id;
        this.luongNuoc = luongNuoc;
        this.donGia = donGia;
        this.namApdung = namApdung;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLuongNuoc() {
        return luongNuoc;
    }

    public void setLuongNuoc(String luongNuoc) {
        this.luongNuoc = luongNuoc;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public int getNamApdung() {
        return namApdung;
    }

    public void setNamApdung(int namApdung) {
        this.namApdung = namApdung;
    }

    @Override
    public String toString() {
        return "giaNuocCN{" + "id=" + id + ", luongNuoc=" + luongNuoc + ", donGia=" + donGia + ", namApdung=" + namApdung + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final giaNuocCN other = (giaNuocCN) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Float.floatToIntBits(this.donGia) != Float.floatToIntBits(other.donGia)) {
            return false;
        }
        if (this.namApdung != other.namApdung) {
            return false;
        }
        if (!Objects.equals(this.luongNuoc, other.luongNuoc)) {
            return false;
        }
        return true;
    }
    
}
