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
        this.name = this.nameReversed = this.lastName = this.jediName = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.nameReversed = StringUtils.reverse(name);
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.setJediName(this.name, lastName);
        this.lastName = lastName;
    }

    public String getNameReversed() {
        return nameReversed;
    }

    public String getJediName() {
        return jediName;
    }

    public void setJediName(String name, String lastName) {
        try {
            this.jediName = (lastName.substring(0,3) + name.substring(0,2));
        } catch (Exception e) {
            this.jediName = "";
        }
        
    }
}
