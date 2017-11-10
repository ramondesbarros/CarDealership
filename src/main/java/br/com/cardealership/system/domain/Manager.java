package br.com.cardealership.system.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

// @Table(schema = "spring_jpa_product")
@Table(name = "manager")
public class Manager implements Serializable {

    private static final long serialVersionUID = 2017092801L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "manager_id")
    private Long idManager;

    @NotEmpty
    private String name;

    @NotEmpty
    private String login;

    @NotEmpty
    private String password;

    public Long getIdManager() {
        return idManager;
    }

    public void setIdManager(Long idManager) {
        this.idManager = idManager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idManager == null) ? 0 : idManager.hashCode());
        result = prime * result + ((login == null) ? 0 : login.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Manager))
            return false;
        Manager other = (Manager) obj;
        if (idManager == null) {
            if (other.idManager != null)
                return false;
        } else if (!idManager.equals(other.idManager))
            return false;
        if (login == null) {
            if (other.login != null)
                return false;
        } else if (!login.equals(other.login))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Manager[" + (idManager != null ? "idManager:" + idManager + "|" : "")
                + (name != null ? "name:" + name + "|" : "") + (login != null ? "login:" + login + "|" : "")
                + (password != null ? "password:" + password : "") + "]";
    }
}
