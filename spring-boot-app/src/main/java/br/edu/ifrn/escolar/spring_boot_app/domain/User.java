package br.edu.ifrn.escolar.spring_boot_app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User {

    private String name;
    private String email;

}
