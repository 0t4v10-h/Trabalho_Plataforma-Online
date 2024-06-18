/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.br.edu.vianna.plataformaonline;

import com.br.edu.vianna.plataformaonline.model.Administrador;
import com.br.edu.vianna.plataformaonline.model.Aluno;
import com.br.edu.vianna.plataformaonline.model.Professor;
import com.br.edu.vianna.plataformaonline.model.Usuario;

/**
 *
 * @author aluno
 */

public class PlataformaOnline {

    public static void main(String[] args) {

    }

    public static void cadastroProfessor(Professor professor){
        Professor pro1 = new Professor(1, "Zé", "ze@mail", "ze01", "1111");
        Usuario.adicionarUsuario(pro1);

        Professor pro2 = new Professor(2, "Jão", "jao@mail", "jao02", "2222");
        Usuario.adicionarUsuario(pro2);

        Professor pro3 = new Professor(3, "Tião", "tiao@mail", "tiao03", "3333");
        Usuario.adicionarUsuario(pro3);
    }

    public static void cadastroAluno(Aluno aluno){
        Aluno aluno1 = new Aluno(1, "Luffy", "luffy@mail", "luffy", "1111", "1111");
        Usuario.adicionarUsuario(aluno1);

        Aluno aluno2 = new Aluno(2, "Zoro", "zoro@mail", "zoro", "2222", "2222");
        Usuario.adicionarUsuario(aluno2);

        Aluno aluno3 = new Aluno(3, "Sanji", "sanji@mail", "sanji", "3333", "3333");
        Usuario.adicionarUsuario(aluno3);

        Aluno aluno4 = new Aluno(4, "Nami", "nami@mail", "nami", "4444", "4444");
        Usuario.adicionarUsuario(aluno4);

        Aluno aluno5 = new Aluno(5, "Usopp", "usopp@mail", "usopp", "5555", "5555");
        Usuario.adicionarUsuario(aluno5);
    }

    public static void cadastrarAdiministrador(Administrador adiministrador){
        Administrador adm = new Administrador(1, "Fulano", "fulano@mail", "fulano", "0000");
    }
}
