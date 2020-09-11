package com.ViniciusTurquetti.projeto;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/loja")
public class LojaController {

    private List<Produto> produtos = new ArrayList<>();

    @GetMapping
    public List<Produto> getProdutos(){
        return produtos;
    }

    //exibindo os produtos dentro da lista
    @GetMapping("/{id}")
    public Produto recuperarProduto(@PathVariable int id){
        return produtos.get(id-1);
    }

    @GetMapping("/total")
    public Double calculaTotalvenda(){
        Double total = 0.0;
        for(Produto p : produtos){
            total += p.getValorTotal();
        }
        return total;
    }


    //criando novo jogo
    @PostMapping
    public void criarJogo(@RequestBody Jogos novoJogo){
        produtos.add(novoJogo);
    }

    //criando novo livro na lista
    @PostMapping
    public void criarlivro(@RequestBody Livros novoLivro){
        produtos.add(novoLivro);
    }

    //deletando os produtos da lista
    @DeleteMapping("/{id}")
    public void excluirProduto(@PathVariable int id){
        produtos.remove(id-1);
    }
}
