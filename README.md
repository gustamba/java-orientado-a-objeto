## Java Orientado a Objeto
Repertório para estudo do Java Orientado a Objeto com base no livro Desbravando Java e Orientação a Objetos de Rodrigo Turini

## Onde parei
página 142 do PDF

## Compila
```bash
javac MeuPrimeiroPrograma.java
```

## Executa
```bash
java MeuPrimeiroPrograma
```

## Método Main
```java
public static void main(String[] args) {
    // seu código aqui
}
```

## Impressão console
```java
public static void main(String[] args) {
    System.out.println("o primeiro de muitos!")
}
```

## IDE
Eclipse 

## Classe
File > New > Class
```java
public class NomeClasse {

}
```

## Atalhos - Ctrl + Espaço
Ctrl + Espaço - Completa código(main, syso)  
Ctrl + F11 - Executa código 


## Operadores

| Operador | Tamanho | Valor Padrão |
|--------------|----------|--------------|
| boolean      | 1 bit    | false        |
| byte         | 1 byte   | 0            |
| short        | 2 bytes  | 0            |
| char         | 2 bytes  | '\u0000'     |
| int          | 4 bytes  | 0            |
| float        | 4 bytes  | 0.0f         |
| long         | 8 bytes  | 0L           |
| double       | 8 bytes  | 0.0d         |


## Operador ternário
Comum
```java
double valor = 0;
if (v1 > v2) {
    valor = 100;
} else {
    valor = 0;
}
```
Ternário
```java
double valor = v1 > v2 ? 100 : 0;
```

## Molde
```java
public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
}
```

## Criar objeto
```java
Livro livro = new Livro();

livro.nome = "Java 8";
livro.descricao = "Novos recursos";
livro.valor = 59.90;
livro.isbn = "978-85-66250-46-6";
```

## Classe X Objeto
Uma classe é apenas um molde. Cada objeto que criamos do tipo Livro terá seus prórprios valores.

## Método
```java
tipoDeRetorno nomeDoComportamento() {
    // código que será executado
}

void mostrarDetalhes() {
    System.out.println(nome);
    System.out.println(descricao);
    System.out.println(valor);
    System.out.println(isbn);
}
```

## Atibuto de classe
this

## Método com retorno
```java
boolean temAutor(){
    return this.autor != null;
}
```

## Encapsulamento
Esconder todos os atributos de suas classes (deixado-os private) e encapsular seus comportamentos em métodos

Getters e Setters
```java
public class Livro{
    private double valor;
    // demais atributos e métodos

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
}
```
No eclipse  
Ctrl + 3 -> ggas (Generate Getters and Setters) -> Finish

## Herança e Plimorfismo

@Override
Anotação de que um método foi reescrito referente a classe pai (superclasse) 