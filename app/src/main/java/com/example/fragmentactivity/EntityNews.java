package com.example.fragmentactivity;

public class EntityNews {
    String namaTugas;
    String Deskripsi;
    String Deadline;

    public EntityNews(String namaTugas, String deskripsi, String deadline) {
        this.namaTugas = namaTugas;
        this.Deskripsi = deskripsi;
        this.Deadline = deadline;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    public void setNamaTugas(String namaTugas) {
        this.namaTugas = namaTugas;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

    public String getDeadline() {
        return Deadline;
    }

    public void setDeadline(String deadline) {
        Deadline = deadline;
    }
}
