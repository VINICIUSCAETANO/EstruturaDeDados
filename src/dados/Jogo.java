/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.Objects;

/**
 *
 * @author Vinicius
 */
public class Jogo {
    private String nome;
    private String genero;
    private String produtora;
    private String ano;
    private String plataforma;

    public Jogo(String nome, String genero, String produtora, String ano, String plataforma) {
        this.nome = nome;
        this.genero = genero;
        this.produtora = produtora;
        this.ano = ano;
        this.plataforma = plataforma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    @Override
    public String toString() {
        return "Nome : " + nome + "   Genero : " + genero + "   Produtora : " + produtora + "   Ano : " + ano + "   Plataforma : " + plataforma + '\n';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jogo other = (Jogo) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    
}
