# Grafos

## Criando um grafo:

Para criar um __Grafo__, é bem simples:

```Java
 Grafo<Tipo> grafo = new Grafo<>();
```

## Adicionando Nós:

Para adicionar um vértice, aqui chamado por __Nó__, é também muito simples.

```Java
Grafo<Tipo> grafo = new Grafo<>();
No<Tipo> novo = grafo.inserirNo("Novo nó");
```

## Conectando Nós:

Sabendo disso, há 4 tipos de variantes de conexão:

- Unidirecional:
Possui um só caminho.
- Bidirecional: 
Possui caminho de ida e volta (representada internamente por duas conexões).
- Valorada: 
Contém valor dado por um número do tipo *double*.
- Não valorada: 
Não contém valor (representada internamente por valor 0).


Programaticamente:
```Java
Grafo<Tipo> grafo = new Grafo<>();

No<Tipo> A = grafo.inserirNo("A");
No<Tipo> B = grafo.inserirNo("B");

grafo.conectar(A, B);       //Conexão unidirecional não valorada
grafo.conectarEspelho(A, B); //Conexão unidirecional valorada
grafo.conectar(A, B, 1);       //Conexão bidirecional não valorada
grafo.conectarEspelho(A, B, 1); //Conexão bidirecional valorada
```

Note que para conexão deste exemplo foi gerada uma conexão, mesmo já houvendo outras entre os dois nós.

## Documentação completa:
 
#### Classe Grafo:
```Java
new Grafo<Tipo>();
```
Cria um grafo de um tipo *Tipo*.

```Java
inserirNo(Tipo valor);
```
Insere um novo nó ao grafo.

```Java
conectar(No<Tipo> A, No<Tipo> B [, double valor]);
```
Conecta um nó *A* a um nó *B* com um valor opcional.

```Java
conectarEspelho(No<Tipo> A, No<Tipo> B [, double valor]);
```
O mesmo que o anterior, porém conecta também de *B* a *A*.


