package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Topic {
    private int id;

    public Topic() {
    }

    public Topic(int id, String tname, String choice, String answer, String cno) {
        this.id = id;
        this.tname = tname;
        this.choice = choice;
        this.answer = answer;
        this.cno = cno;
    }

    private String tname;
    private String choice;
    private String answer;
    private String cno;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Tname")
    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Basic
    @Column(name = "choice")
    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    @Basic
    @Column(name = "answer")
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Basic
    @Column(name = "Cno")
    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topic topic = (Topic) o;
        return id == topic.id &&
                Objects.equals(tname, topic.tname) &&
                Objects.equals(choice, topic.choice) &&
                Objects.equals(answer, topic.answer) &&
                Objects.equals(cno, topic.cno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tname, choice, answer, cno);
    }
}
