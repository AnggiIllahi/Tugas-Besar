package com.example.anggi.tubes.Fragment;


public class model_airterjun {
    String deskripsi;
    String judul;
    String link;
    int foto;

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public model_airterjun(String deskripsi, String judul, String link, int foto) {
        this.deskripsi = deskripsi;
        this.judul = judul;
        this.link = link;
        this.foto = foto;

    }



}
