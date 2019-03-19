package br.mp.mpu.escola.cursodeploy;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.commons.lang3.StringUtils;

@ManagedBean(name = "helloWorld")
@SessionScoped
public class HelloWorld {
    private String name;
    private String nameReversed;
    private String jediName;
    private String lastName;

    public String greetings() {
        return "Bem-vindo ao curso de deploy automático e padrões de qualidade!";
    }

    public void clean() {
        this.name = this.nameReversed = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.nameReversed = StringUtils.reverse(name);
    }

    public String getNameReversed() {
        return nameReversed;
    }

    public String getJediName() {
        if(this.jediName == null) {
            this.setJediName(name, lastName);
        }
        return jediName;
    }

    public void setJediName(String name, String lastName) {
        this.jediName = lastName.substring(0,3) + name.substring(0,2);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
