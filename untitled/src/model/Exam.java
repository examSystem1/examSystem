package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Exam {
    private int eno;
    private String ename;
    private String cno;
    private String uno;
    private Date beginDate;

    public Exam() {
    }

    private Date endDate;

    public Exam(int eno, String ename, String cno, String uno, Date beginDate, Date endDate, String etime) {
        this.eno = eno;
        this.ename = ename;
        this.cno = cno;
        this.uno = uno;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.etime = etime;
    }

    private String etime;

    @Id
    @Column(name = "Eno")
    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    @Basic
    @Column(name = "Ename")
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
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

    @Basic
    @Column(name = "beginDate")
    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    @Basic
    @Column(name = "endDate")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "Etime")
    public String getEtime() {
        return etime;
    }

    public void setEtime(String etime) {
        this.etime = etime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exam exam = (Exam) o;
        return eno == exam.eno &&
                Objects.equals(ename, exam.ename) &&
                Objects.equals(cno, exam.cno) &&
                Objects.equals(uno, exam.uno) &&
                Objects.equals(beginDate, exam.beginDate) &&
                Objects.equals(endDate, exam.endDate) &&
                Objects.equals(etime, exam.etime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eno, ename, cno, uno, beginDate, endDate, etime);
    }
}
