package com.itc.dbservice.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by hexad3cimal on 1/3/19.
 */

@Entity
@Table(name = "SCC_VARIABLES")
public class SccVariables implements Serializable{

    @Id
    private String uuid_gener;
    private String G0319_CENNOVAR;
    private String G0319_TIPCOVAR;
    private String G0319_NOMBRVAR;
    private String G0319_NCAMPVAR;
    private String G0319_NORDEVAR;
    private String G0319_EMPNOVAR;

    public String getUuid_gener() {
        return uuid_gener;
    }

    public void setUuid_gener(String uuid_gener) {
        this.uuid_gener = uuid_gener;
    }

    public String getG0319_CENNOVAR() {
        return G0319_CENNOVAR;
    }

    public void setG0319_CENNOVAR(String g0319_CENNOVAR) {
        G0319_CENNOVAR = g0319_CENNOVAR;
    }

    public String getG0319_TIPCOVAR() {
        return G0319_TIPCOVAR;
    }

    public void setG0319_TIPCOVAR(String g0319_TIPCOVAR) {
        G0319_TIPCOVAR = g0319_TIPCOVAR;
    }

    public String getG0319_NOMBRVAR() {
        return G0319_NOMBRVAR;
    }

    public void setG0319_NOMBRVAR(String g0319_NOMBRVAR) {
        G0319_NOMBRVAR = g0319_NOMBRVAR;
    }

    public String getG0319_NCAMPVAR() {
        return G0319_NCAMPVAR;
    }

    public void setG0319_NCAMPVAR(String g0319_NCAMPVAR) {
        G0319_NCAMPVAR = g0319_NCAMPVAR;
    }

    public String getG0319_NORDEVAR() {
        return G0319_NORDEVAR;
    }

    public void setG0319_NORDEVAR(String g0319_NORDEVAR) {
        G0319_NORDEVAR = g0319_NORDEVAR;
    }

    public String getG0319_EMPNOVAR() {
        return G0319_EMPNOVAR;
    }

    public void setG0319_EMPNOVAR(String g0319_EMPNOVAR) {
        G0319_EMPNOVAR = g0319_EMPNOVAR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SccVariables that = (SccVariables) o;

        return uuid_gener != null ? uuid_gener.equals(that.uuid_gener) : that.uuid_gener == null;

    }

    @Override
    public int hashCode() {
        return uuid_gener != null ? uuid_gener.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "SccVariables{" +
                "uuid_gener='" + uuid_gener + '\'' +
                ", G0319_CENNOVAR='" + G0319_CENNOVAR + '\'' +
                ", G0319_TIPCOVAR='" + G0319_TIPCOVAR + '\'' +
                ", G0319_NOMBRVAR='" + G0319_NOMBRVAR + '\'' +
                ", G0319_NCAMPVAR='" + G0319_NCAMPVAR + '\'' +
                ", G0319_NORDEVAR='" + G0319_NORDEVAR + '\'' +
                ", G0319_EMPNOVAR='" + G0319_EMPNOVAR + '\'' +
                '}';
    }
}
