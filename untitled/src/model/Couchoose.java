package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Couchoose {
    private int id;
    private String cno;
    private String uno;

    public Couchoose() {
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public Couchoose(int id, String cno, String uno) {
        this.id = id;
        this.cno = cno;
        this.uno = uno;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Cno")
    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    @Basic
    @Column(name = "Uno")
    public String getUno() {
        return uno;
    }

    public void setUno(String uno) {
        this.uno = uno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Couchoose couchoose = (Couchoose) o;
        return id == couchoose.id &&
                Objects.equals(cno, couchoose.cno) &&
                Objects.equals(uno, couchoose.uno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cno, uno);
    }
}
