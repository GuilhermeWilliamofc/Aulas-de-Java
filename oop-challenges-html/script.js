const challengeData = {
    conceitos: [
        {
            id: 1,
            title: "Portabilidade e Virtualização",
            description: "Como o Java consegue ser executado em qualquer lugar? (Questões de Múltipla Escolha)",
            type: "Conceitos Básicos",
            code: `
O código compilado do Java que é independente de plataforma é conhecido como:
<select class="challenge-input" data-answer="bytecode" style="padding: 5px; margin: 5px; border-radius: 4px; background: #1e293b; color: #f8fafc; border: 1px solid #334155;">
    <option value="">Selecione...</option>
    <option value="bytecode">Bytecode</option>
    <option value="executavel">Executável nativo</option>
</select>

Ele é executado por uma máquina virtual que atua como uma ponte entre o código e o Sistema Operacional, chamada de:
<select class="challenge-input" data-answer="jvm" style="padding: 5px; margin: 5px; border-radius: 4px; background: #1e293b; color: #f8fafc; border: 1px solid #334155;">
    <option value="">Selecione...</option>
    <option value="ide">IDE</option>
    <option value="so">Sistema Operacional</option>
    <option value="jvm">JVM (Java Virtual Machine)</option>
</select>`
        },
        {
            id: 2,
            title: "Kit de Desenvolvimento e Ambientes",
            description: "Identifique as principais ferramentas e siglas.",
            type: "Ferramentas",
            code: `
Para compilar e desenvolver programas completos, precisamos instalar o pacote de desenvolvimento principal, chamado:
<select class="challenge-input" data-answer="jdk" style="padding: 5px; margin: 5px; border-radius: 4px; background: #1e293b; color: #f8fafc; border: 1px solid #334155;">
    <option value="">Selecione...</option>
    <option value="jre">JRE</option>
    <option value="jdk">JDK</option>
</select>
(Se quiséssemos apenas executar, o JRE seria suficiente).

Para escrever código de forma mais produtiva em uma interface educacional ou visual (como o BlueJ), usamos um(a):
<select class="challenge-input" data-answer="ide" style="padding: 5px; margin: 5px; border-radius: 4px; background: #1e293b; color: #f8fafc; border: 1px solid #334155;">
    <option value="">Selecione...</option>
    <option value="ide">IDE (Integrated Dev Environment)</option>
    <option value="cmd">Prompt de Comando</option>
    <option value="jvm">JVM</option>
</select>`
        },
        {
            id: 3,
            title: "Arquivos Fonte e Compilação",
            description: "Qual a extensão de código fonte e o comando de compilação?",
            type: "Arquivos",
            code: `
O arquivo de texto contendo o seu código, chamado de arquivo fonte, deve sempre possuir a extensão:
<select class="challenge-input" data-answer=".java" style="padding: 5px; margin: 5px; border-radius: 4px; background: #1e293b; color: #f8fafc; border: 1px solid #334155;">
    <option value="">Selecione...</option>
    <option value=".java">.java</option>
    <option value=".class">.class</option>
    <option value=".exe">.exe</option>
</select>

Para compilar este arquivo manualmente via terminal criando o bytecode, usamos a ferramenta:
<select class="challenge-input" data-answer="javac" style="padding: 5px; margin: 5px; border-radius: 4px; background: #1e293b; color: #f8fafc; border: 1px solid #334155;">
    <option value="">Selecione...</option>
    <option value="java">java</option>
    <option value="javac">javac</option>
</select>`
        }
    ],
    sintaxe: [
        {
            id: 1,
            title: "A Raiz de Tudo (C vs Java)",
            description: "No C as funções podem ficar soltas no arquivo. No Java, tudo precisa estar dentro de uma estrutura específica.",
            type: "Sintaxe Básica",
            code: `
<span class="kw">public</span> <input type="text" class="challenge-input" data-answer="class" placeholder="..."> <span class="cl">MeuPrograma</span> {
    <span class="co">// Todo código Java vai dentro de uma Classe!</span>
}`,
            explanation: "Java é estritamente Orientado a Objetos. Até mesmo o programa principal é uma classe."
        },
        {
            id: 2,
            title: "Imprimindo no Console",
            description: "No C usávamos printf(), no Java usamos um comando maior para saída padrão (com quebra de linha).",
            type: "Sintaxe Básica",
            code: `
<span class="cl">System</span>.out.<input type="text" class="challenge-input" data-answer="println" placeholder="...">(<span class="st">"Olá Java!"</span>);`
        },
        {
            id: 3,
            title: "Tipo Booleano Explícito",
            description: "No C antigo usávamos inteiros (0 ou 1) para verdadeiro/falso. Java tem um tipo próprio nativo.",
            type: "Tipos de Dados",
            code: `
<input type="text" class="challenge-input" data-answer="boolean" placeholder="tipo..."> ligado = <input type="text" class="challenge-input" data-answer="true" placeholder="valor...">;`
        }
    ],
    variaveis_fluxo: [
        {
            id: 1,
            title: "Variáveis Primitivas",
            description: "Declare os tipos básicos do Java (muito similares aos do C).",
            type: "Variáveis",
            code: `
<span class="co">// Inteiro</span>
<input type="text" class="challenge-input" data-answer="int" placeholder="..."> idade = 20;

<span class="co">// Ponto flutuante duplo (padrão)</span>
<input type="text" class="challenge-input" data-answer="double" placeholder="..."> preco = 19.99;

<span class="co">// Caractere único (aspas simples)</span>
<input type="text" class="challenge-input" data-answer="char" placeholder="..."> letra = 'A';`
        },
        {
            id: 2,
            title: "Controle de Fluxo (If/Else)",
            description: "A estrutura de decisão no Java é idêntica à do C.",
            type: "Condicionais",
            code: `
<span class="kw">if</span> (idade <input type="text" class="challenge-input" data-answer=">=" placeholder="oper."> 18) {
    <span class="cl">System</span>.out.println(<span class="st">"Maior de idade"</span>);
} <input type="text" class="challenge-input" data-answer="else" placeholder="se não..."> {
    <span class="cl">System</span>.out.println(<span class="st">"Menor de idade"</span>);
}`
        },
        {
            id: 3,
            title: "Laços de Repetição (For)",
            description: "O comportamento do loop 'for' é o mesmo, mas no Java você precisa adicionar o tipo da variável do contador se ela for declarada dentro.",
            type: "Loops",
            code: `
<span class="kw">for</span> (<input type="text" class="challenge-input" data-answer="int" placeholder="tipo"> i = 0; i <input type="text" class="challenge-input" data-answer="<" placeholder="condição"> 10; i<input type="text" class="challenge-input" data-answer="++" placeholder="inc">) {
    <span class="cl">System</span>.out.println(i);
}`
        }
    ],
    fundamentos: [
        {
            id: 1,
            title: "O Método Principal (Main)",
            description: "O ponto de entrada de qualquer aplicação Java. Complete a assinatura do método main.",
            type: "Sintaxe Base",
            code: `
<span class="kw">public class</span> <span class="cl">MeuPrograma</span> {
    <span class="kw">public static</span> <span class="kw">void</span> <input type="text" class="challenge-input" data-answer="main" placeholder="metodo?"> (<span class="cl">String</span>[] <input type="text" class="challenge-input" data-answer="args" placeholder="argumentos?">) {
        <span class="cl">System</span>.out.println(<span class="st">"Olá Java!"</span>);
    }
}`,
            explanation: "<b>public</b>: Acessível por todos. <br><b>static</b>: Não precisa instanciar a classe. <br><b>void</b>: Não retorna valor."
        },
        {
            id: 2,
            title: "Criando Atributos",
            description: "Defina atributos para uma classe 'Pessoa'. Nome deve ser String.",
            type: "Classes",
            code: `
<span class="kw">public class</span> <span class="cl">Pessoa</span> {
    <span class="kw">public</span> <span class="cl">String</span> <input type="text" class="challenge-input" data-answer="nome" placeholder="nome?">;
    <span class="kw">public</span> <span class="cl">int</span> <input type="text" class="challenge-input" data-answer="idade" placeholder="idade?">;
}`
        }
    ],
    encapsulamento: [
        {
            id: 3,
            title: "Modificadores de Acesso",
            description: "Proteja o atributo 'senha' para que ele seja privado.",
            type: "Encapsulamento",
            code: `
<span class="kw">public class</span> <span class="cl">Usuario</span> {
    <input type="text" class="challenge-input" data-answer="private" placeholder="visibilidade?"> <span class="cl">String</span> senha;
    <input type="text" class="challenge-input" data-answer="public" placeholder="visibilidade?"> <span class="cl">String</span> login;
}`
        },
        {
            id: 4,
            title: "Método Getter",
            description: "Crie o método para ler o saldo de uma conta privada.",
            type: "Getters/Setters",
            code: `
<span class="kw">public class</span> <span class="cl">Conta</span> {
    <span class="kw">private double</span> saldo;

    <span class="kw">public double</span> <input type="text" class="challenge-input" data-answer="getSaldo" placeholder="...">() {
        <span class="kw">return</span> <span class="kw">this</span>.<input type="text" class="challenge-input" data-answer="saldo" placeholder="...">;
    }
}`
        }
    ],
    construtores: [
        {
            id: 1,
            title: "Construtor Básico",
            description: "Complete o construtor para inicializar os atributos da classe Produto.",
            type: "Construtores",
            code: `
<span class="kw">public class</span> <span class="cl">Produto</span> {
    <span class="kw">private</span> <span class="cl">String</span> nome;
    <span class="kw">private double</span> preco;

    <span class="kw">public</span> <input type="text" class="challenge-input" data-answer="Produto" placeholder="nome do construtor?">(<span class="cl">String</span> nome, <span class="kw">double</span> preco) {
        <span class="kw">this</span>.nome = nome;
        <span class="kw">this</span>.preco = <input type="text" class="challenge-input" data-answer="preco" placeholder="atributo?">;
    }
}`,
            explanation: "O construtor tem o MESMO nome da classe e não tem tipo de retorno."
        },
        {
            id: 2,
            title: "Construtor com This()",
            description: "Um construtor pode chamar outro usando a palavra-chave this().",
            type: "Construtores",
            code: `
<span class="kw">public class</span> <span class="cl">Carro</span> {
    <span class="kw">private</span> <span class="cl">String</span> modelo;
    <span class="kw">private int</span> ano;

    <span class="kw">public</span> Carro(<span class="cl">String</span> modelo) {
        <input type="text" class="challenge-input" data-answer="this" placeholder="...">(modelo, 2024);
    }

    <span class="kw">public</span> Carro(<span class="cl">String</span> modelo, <span class="kw">int</span> ano) {
        <span class="kw">this</span>.modelo = modelo;
        <span class="kw">this</span>.ano = ano;
    }
}`,
            explanation: "this() chama outro construtor da mesma classe. Deve ser a primeira linha do construtor."
        },
        {
            id: 3,
            title: "Método Setter",
            description: "Crie um setter para validar que o valor não seja negativo.",
            type: "Setters",
            code: `
<span class="kw">public class</span> <span class="cl">Conta</span> {
    <span class="kw">private double</span> saldo;

    <span class="kw">public void</span> <input type="text" class="challenge-input" data-answer="setSaldo" placeholder="nome do setter?">(<span class="kw">double</span> saldo) {
        <span class="kw">if</span> (saldo >= 0) {
            <span class="kw">this</span>.saldo = <input type="text" class="challenge-input" data-answer="saldo" placeholder="parametro?">;
        }
    }
}`,
            explanation: "Setters começam com 'set' + NomeDoAtributo em camelCase. Permitem validação ao atribuir."
        }
    ],
    heranca: [
        {
            id: 1,
            title: "Herança Básica",
            description: "Use a palavra-chave para fazer uma classe herdar de outra.",
            type: "Herança",
            code: `
<span class="kw">public class</span> <span class="cl">Animal</span> {
    <span class="kw">protected</span> <span class="cl">String</span> nome;
}

<span class="kw">public class</span> <span class="cl">Cachorro</span> <input type="text" class="challenge-input" data-answer="extends" placeholder="palavra-chave?"> <span class="cl">Animal</span> {
    <span class="co">// Cachorro herda 'nome' de Animal</span>
}`,
            explanation: "Em Java, uma classe só pode HERDAR de uma única classe (herança simples)."
        },
        {
            id: 2,
            title: "Super Construtor",
            description: "Chame o construtor da classe pai usando super().",
            type: "Herança",
            code: `
<span class="kw">public class</span> <span class="cl">Pessoa</span> {
    <span class="kw">protected</span> <span class="cl">String</span> nome;
    <span class="kw">public</span> Pessoa(<span class="cl">String</span> n) { nome = n; }
}

<span class="kw">public class</span> <span class="cl">Aluno</span> <span class="kw">extends</span> <span class="cl">Pessoa</span> {
    <span class="kw">private</span> <span class="kw">int</span> matricula;

    <span class="kw">public</span> Aluno(<span class="cl">String</span> nome, <span class="kw">int</span> mat) {
        <input type="text" class="challenge-input" data-answer="super" placeholder="...">(nome);
        matricula = mat;
    }
}`,
            explanation: "super() chama o construtor da classe pai. Assim como this(), deve ser a primeira linha."
        },
        {
            id: 3,
            title: "Sobrescrita com @Override",
            description: "Sobrescreva o método toString() para uma representação personalizada.",
            type: "Override",
            code: `
<span class="kw">public class</span> <span class="cl">Produto</span> {
    <span class="kw">private</span> <span class="cl">String</span> nome;
    <span class="kw">private double</span> preco;

    @<input type="text" class="challenge-input" data-answer="Override" placeholder="...">
    <span class="kw">public</span> <span class="cl">String</span> toString() {
        <span class="kw">return</span> nome + <span class="st">" - R$"</span> + preco;
    }
}`,
            explanation: "@Override é uma anotação opcional que indica que estamos sobrescrevendo um método da superclasse. O compilador verifica se realmente existe."
        },
        {
            id: 4,
            title: "Polimorfismo",
            description: "O mesmo método pode ter comportamentos diferentes nas subclasses.",
            type: "Polimorfismo",
            code: `
<span class="kw">public class</span> <span class="cl">Animal</span> {
    <span class="kw">public void</span> fazerSom() {
        <span class="cl">System</span>.out.println(<span class="st">"..."</span>);
    }
}

<span class="kw">public class</span> <span class="cl">Gato</span> <span class="kw">extends</span> <span class="cl">Animal</span> {
    <span class="kw">public void</span> fazerSom() {
        <span class="cl">System</span>.out.println(<span class="st">"<input type="text" class="challenge-input" data-answer="Miau!" placeholder="som...">"</span>);
    }
}

Animal a = <span class="kw">new</span> <input type="text" class="challenge-input" data-answer="Gato" placeholder="classe?">();
a.fazerSom(); <span class="co">// Chama o método do Gato!</span>`,
            explanation: "Polimorfismo: uma referência do tipo Animal pode apontar para um objeto Gato, mas o método chamado será o da classe real (Gato). Isso se chama 'dynamic dispatch'."
        }
    ],
    abstracao: [
        {
            id: 1,
            title: "Classe Abstrata",
            description: "Defina uma classe abstrata que não pode ser instanciada diretamente.",
            type: "Abstração",
            code: `
<span class="kw">public</span> <input type="text" class="challenge-input" data-answer="abstract" placeholder="..."> <span class="kw">class</span> <span class="cl">Forma</span> {
    <span class="kw">protected</span> <span class="cl">String</span> cor;

    <span class="co">// Método abstrato: sem corpo, obrigatório nas filhas</span>
    <span class="kw">public abstract</span> <input type="text" class="challenge-input" data-answer="double" placeholder="tipo de retorno?"> <input type="text" class="challenge-input" data-answer="calcularArea" placeholder="nome do método?">();
}`,
            explanation: "Uma classe abstrata pode ter métodos com e sem implementação. Não é possível fazer 'new Forma()'. As filhas DEVEM implementar os métodos abstratos."
        },
        {
            id: 2,
            title: "Interface",
            description: "Defina um contrato (interface) que uma classe deve cumprir.",
            type: "Interface",
            code: `
<span class="kw">public</span> <input type="text" class="challenge-input" data-answer="interface" placeholder="palavra?"> <span class="cl">Desenhavel</span> {
    <span class="kw">void</span> desenhar();  <span class="co">// Implicitamente public e abstract</span>
}

<span class="kw">public class</span> <span class="cl">Circulo</span> <input type="text" class="challenge-input" data-answer="implements" placeholder="palavra?"> <span class="cl">Desenhavel</span> {
    <span class="kw">public void</span> desenhar() {
        <span class="cl">System</span>.out.println(<span class="st">"Desenhando círculo..."</span>);
    }
}`,
            explanation: "Interfaces definem 'o que' fazer, não 'como'. Uma classe pode implementar múltiplas interfaces."
        },
        {
            id: 3,
            title: "Herança Múltipla via Interface",
            description: "Uma classe pode implementar mais de uma interface ao mesmo tempo.",
            type: "Interface",
            code: `
<span class="kw">interface</span> <span class="cl">Comportavel</span> {
    <span class="kw">void</span> comer();
}

<span class="kw">interface</span> <span class="cl">Dorminhoco</span> {
    <span class="kw">void</span> <input type="text" class="challenge-input" data-answer="dormir" placeholder="metodo?">();
}

<span class="kw">public class</span> <span class="cl">Gato</span> <span class="kw">implements</span> <span class="cl">Comportavel</span>, <span class="cl">Dorminhoco</span> {
    <span class="kw">public void</span> comer() {}
    <span class="kw">public void</span> dormir() {}
}`,
            explanation: "Java só permite herança simples de classes, mas múltipla implementação de interfaces. Isso resolve o 'Diamond Problem' do C++."
        }
    ],
    excecoes: [
        {
            id: 1,
            title: "Try-Catch Básico",
            description: "Trate uma exceção para que o programa não quebre.",
            type: "Exceções",
            code: `
<span class="kw">try</span> {
    <span class="kw">int</span> resultado = 10 / <input type="text" class="challenge-input" data-answer="0" placeholder="valor...">; <span class="co">// Causa ArithmeticException!</span>
} <input type="text" class="challenge-input" data-answer="catch" placeholder="..."> (<span class="cl">ArithmeticException</span> e) {
    <span class="cl">System</span>.out.println(<span class="st">"Erro: divisão por zero!"</span>);
}`,
            explanation: "O bloco try-catch permite tratar erros em tempo de execução sem que o programa seja encerrado abruptamente."
        },
        {
            id: 2,
            title: "Finally",
            description: "O bloco finally executa SEMPRE, com ou sem exceção.",
            type: "Exceções",
            code: `
<span class="cl">Scanner</span> sc = <span class="kw">new</span> <span class="cl">Scanner</span>(<span class="cl">System</span>.in);
<span class="kw">try</span> {
    <span class="kw">int</span> n = sc.nextInt();
} <span class="kw">catch</span> (<span class="cl">Exception</span> e) {
    e.<input type="text" class="challenge-input" data-answer="printStackTrace" placeholder="metodo?">();
} <input type="text" class="challenge-input" data-answer="finally" placeholder="..."> {
    sc.close(); <span class="co">// Sempre fecha o recurso!</span>
}`,
            explanation: "Finally é usado para limpeza de recursos (arquivos, conexões, etc). Executa mesmo se houver return no try/catch."
        },
        {
            id: 3,
            title: "Lançando Exceções",
            description: "Crie um método que lança uma exceção personalizada quando algo está errado.",
            type: "Exceções",
            code: `
<span class="kw">public void</span> sacar(<span class="kw">double</span> valor) <input type="text" class="challenge-input" data-answer="throws" placeholder="palavra?"> <span class="cl">IllegalArgumentException</span> {
    <span class="kw">if</span> (valor < 0) {
        <input type="text" class="challenge-input" data-answer="throw" placeholder="palavra?"> <span class="kw">new</span> <span class="cl">IllegalArgumentException</span>(<span class="st">"Valor inválido"</span>);
    }
}`,
            explanation: "throw (minúsculo) lança a exceção. throws (na assinatura) declara que o método pode lançar aquela exceção."
        }
    ],
    colecoes: [
        {
            id: 1,
            title: "ArrayList Básico",
            description: "Use ArrayList para uma lista dinâmica de Strings.",
            type: "Collections",
            code: `
<span class="kw">import</span> java.util.<input type="text" class="challenge-input" data-answer="ArrayList" placeholder="...">;

<span class="cl">ArrayList</span>&lt;<span class="cl">String</span>&gt; nomes = <span class="kw">new</span> <input type="text" class="challenge-input" data-answer="ArrayList" placeholder="...">&lt;&gt;();
nomes.<input type="text" class="challenge-input" data-answer="add" placeholder="metodo?">(<span class="st">"Guilherme"</span>);
nomes.add(<span class="st">"Maria"</span>);

<span class="cl">String</span> primeiro = nomes.<input type="text" class="challenge-input" data-answer="get" placeholder="metodo?">(0);`,
            explanation: "ArrayList é um array redimensionável. Diferente de arrays comuns, não precisa definir tamanho fixo."
        },
        {
            id: 2,
            title: "HashMap",
            description: "Armazene pares chave-valor como um dicionário.",
            type: "Collections",
            code: `
<span class="kw">import</span> java.util.HashMap;

HashMap&lt;<span class="cl">String</span>, <span class="cl">Integer</span>&gt; notas = <span class="kw">new</span> <input type="text" class="challenge-input" data-answer="HashMap" placeholder="...">&lt;&gt;();
notas.put(<span class="st">"João"</span>, <input type="text" class="challenge-input" data-answer="9" placeholder="nota?">);
notas.put(<span class="st">"Maria"</span>, 10);

<span class="kw">int</span> notaJoao = notas.<input type="text" class="challenge-input" data-answer="get" placeholder="metodo?">(<span class="st">"João"</span>);`,
            explanation: "HashMap usa hashCode() para armazenar e buscar elementos rapidamente pela chave."
        },
        {
            id: 3,
            title: "For-Each (Enhanced For)",
            description: "Percorra listas com o for-each, mais legível que o for tradicional.",
            type: "Loops Avançados",
            code: `
<span class="cl">ArrayList</span>&lt;<span class="cl">String</span>&gt; frutas = <span class="kw">new</span> <span class="cl">ArrayList</span>&lt;&gt;();
frutas.add(<span class="st">"Maçã"</span>);
frutas.add(<span class="st">"Banana"</span>);

<span class="kw">for</span> (<span class="cl">String</span> <input type="text" class="challenge-input" data-answer="fruta" placeholder="variavel?"> : frutas) {
    <span class="cl">System</span>.out.println(fruta);
}`,
            explanation: "O for-each funciona com qualquer objeto que implemente a interface Iterable."
        },
        {
            id: 4,
            title: "Wrapper Classes e Generics",
            description: "Collections não aceitam primitivos — use as classes wrapper.",
            type: "Generics",
            code: `
<span class="co">// ArrayList NÃO aceita 'int', precisa do wrapper</span>
<span class="cl">ArrayList</span>&lt;<input type="text" class="challenge-input" data-answer="Integer" placeholder="wrapper?"> numeros = <span class="kw">new</span> <span class="cl">ArrayList</span>&lt;&gt;();
numeros.add(42);     <span class="co">// Autoboxing: int → Integer</span>
<span class="kw">int</span> n = numeros.get(0); <span class="co">// Unboxing: Integer → int</span>

<span class="co">// Outros wrappers:</span>
<span class="cl">ArrayList</span>&lt;<input type="text" class="challenge-input" data-answer="Double" placeholder="wrapper p/ double?"> precos = <span class="kw">new</span> <span class="cl">ArrayList</span>&lt;&gt;();
<span class="cl">ArrayList</span>&lt;<input type="text" class="challenge-input" data-answer="Boolean" placeholder="wrapper p/ boolean?"> flags = <span class="kw">new</span> <span class="cl">ArrayList</span>&lt;&gt;();`,
            explanation: "Autoboxing/Unboxing converte automaticamente entre primitivos e wrappers. Mas use com cuidado em loops grandes por causa do overhead."
        }
    ],
    streams: [
        {
            id: 1,
            title: "Stream API - Filter",
            description: "Filtre elementos de uma lista usando a Stream API (Java 8+).",
            type: "Streams",
            code: `
<span class="cl">List</span>&lt;<span class="cl">String</span>&gt; nomes = <span class="cl">List</span>.of(<span class="st">"Ana"</span>, <span class="st">"Boi"</span>, <span class="st">"Carlos"</span>, <span class="st">"Duda"</span>);

nomes.stream()
    .filter(n -> n.<input type="text" class="challenge-input" data-answer="startsWith" placeholder="metodo?">(<span class="st">"A"</span>))
    .forEach(<span class="cl">System</span>.out::<input type="text" class="challenge-input" data-answer="println" placeholder="metodo?">);
<span class="co">// Imprime apenas "Ana"</span>`,
            explanation: "A Stream API permite operações em estilo funcional. filter() retorna um novo stream com os elementos que passam no teste."
        },
        {
            id: 2,
            title: "Stream API - Map",
            description: "Transforme elementos de uma lista com map().",
            type: "Streams",
            code: `
<span class="cl">List</span>&lt;<span class="cl">Integer</span>&gt; nums = <span class="cl">List</span>.of(1, 2, 3, 4);

List&lt;Integer&gt; dobros = nums.stream()
    .map(n -> n <input type="text" class="challenge-input" data-answer="*" placeholder="operador?"> 2)
    .<input type="text" class="challenge-input" data-answer="toList" placeholder="metodo final?">();
<span class="co">// [2, 4, 6, 8]</span>`,
            explanation: "map() transforma cada elemento. O coletor toList() materializa o stream de volta em uma lista."
        },
        {
            id: 3,
            title: "Expressões Lambda",
            description: "Lambda é uma função anônima. Complete a sintaxe.",
            type: "Lambda",
            code: `
<span class="co">// Interface funcional:</span>
<span class="kw">interface</span> <span class="cl">Calculavel</span> {
    <span class="kw">int</span> calcular(<span class="kw">int</span> a, <span class="kw">int</span> b);
}

<span class="co">// Lambda com -></span>
<span class="cl">Calculavel</span> soma = (<input type="text" class="challenge-input" data-answer="a" placeholder="param?">, b) -> a <input type="text" class="challenge-input" data-answer="+" placeholder="op?"> b;
<span class="cl">Calculavel</span> mult = (x, y) -> x <input type="text" class="challenge-input" data-answer="*" placeholder="op?"> y;`,
            explanation: "Lambda: (parâmetros) -> expressão. Java infere os tipos. Se só tem um parâmetro, os parênteses são opcionais."
        }
    ]
};

let currentCategory = 'conceitos';
let currentChallengeIndex = 0;

// DOM Elements
const progressBar = document.getElementById('progressBar');
const progressPercent = document.getElementById('progressPercent');
const codeDisplay = document.getElementById('code-display');
const challengeTitle = document.getElementById('challenge-title');
const challengeDescription = document.getElementById('challenge-description');
const challengeType = document.getElementById('challenge-type');
const checkBtn = document.getElementById('check-btn');
const nextBtn = document.getElementById('next-btn');
const feedback = document.getElementById('feedback');
const catBtns = document.querySelectorAll('.cat-btn');

function loadChallenge(category, index) {
    const list = challengeData[category];
    if (!list) return;

    const challenge = list[index];
    challengeTitle.textContent = challenge.title;
    challengeDescription.textContent = challenge.description;
    challengeType.textContent = `Tópico: ${category.toUpperCase()} - Desafio #${challenge.id}`;
    codeDisplay.innerHTML = challenge.code;
    
    // Add explanation if exists
    if (challenge.explanation) {
        const expDiv = document.createElement('div');
        expDiv.className = 'explanation';
        expDiv.innerHTML = "💡 Entenda a sintaxe (passe o mouse)";
        expDiv.title = challenge.explanation.replace(/<br>/g, '\n');
        codeDisplay.appendChild(expDiv);
    }

    nextBtn.classList.add('hidden');
    checkBtn.classList.remove('hidden');
    feedback.classList.remove('show', 'success', 'error');
    
    updateProgress();
    
    const firstInput = document.querySelector('.challenge-input');
    if (firstInput) firstInput.focus();
}

function updateProgress() {
    const categories = Object.keys(challengeData);
    
    let total = 0;
    categories.forEach(cat => {
        total += challengeData[cat].length;
    });

    let completed = 0;
    for (let i = 0; i < categories.length; i++) {
        const cat = categories[i];
        if (cat === currentCategory) {
            completed += currentChallengeIndex;
            break;
        } else {
            completed += challengeData[cat].length;
        }
    }

    const progress = (completed / total) * 100;
    progressBar.style.width = `${progress}%`;
    progressPercent.textContent = Math.round(progress);
}

function checkAnswers() {
    const inputs = document.querySelectorAll('.challenge-input');
    let allCorrect = true;

    inputs.forEach(input => {
        const expected = input.getAttribute('data-answer').toLowerCase();
        const value = input.value.trim().toLowerCase();

        if (value === expected) {
            input.classList.remove('wrong');
            input.classList.add('correct');
        } else {
            input.classList.remove('correct');
            input.classList.add('wrong');
            allCorrect = false;
        }
    });

    if (allCorrect) {
        showFeedback("Muito bem! Você acertou.", "success");
        checkBtn.classList.add('hidden');
        nextBtn.classList.remove('hidden');
    } else {
        showFeedback("Ainda não está certo. Tente novamente!", "error");
    }
}

function showFeedback(msg, type) {
    feedback.textContent = msg;
    feedback.className = `feedback-msg show ${type}`;
}

// Category Switching
catBtns.forEach(btn => {
    btn.addEventListener('click', () => {
        if (btn.classList.contains('locked')) return;
        
        catBtns.forEach(b => b.classList.remove('active'));
        btn.classList.add('active');
        
        currentCategory = btn.getAttribute('data-category');
        currentChallengeIndex = 0;
        loadChallenge(currentCategory, currentChallengeIndex);
    });
});

nextBtn.addEventListener('click', () => {
    const list = challengeData[currentCategory];
    if (currentChallengeIndex < list.length - 1) {
        currentChallengeIndex++;
        loadChallenge(currentCategory, currentChallengeIndex);
    } else {
        // Switch to next category automatically if available
        const categories = Object.keys(challengeData);
        const currentIdx = categories.indexOf(currentCategory);
        if (currentIdx >= 0 && currentIdx < categories.length - 1) {
            const nextCat = categories[currentIdx + 1];
            document.querySelector(`[data-category="${nextCat}"]`).click();
        } else {
            showCompletion();
        }
    }
});

function showCompletion() {
    document.getElementById('challenge-container').innerHTML = `
        <div style="text-align:center; padding: 2rem;">
            <h2 style="font-size: 2.5rem; margin-bottom:1rem; color: #10b981;">🏁 Módulo Concluído!</h2>
            <p style="color: #94a3b8; margin-bottom: 2rem;">Você finalizou a trilha de iniciante. Continue praticando!</p>
            <button onclick="location.reload()" class="btn primary">Reiniciar Tudo</button>
        </div>
    `;
}

checkBtn.addEventListener('click', checkAnswers);

document.addEventListener('keydown', (e) => {
    if (e.key === 'Enter') {
        if (!nextBtn.classList.contains('hidden')) nextBtn.click();
        else checkAnswers();
    }
});

loadChallenge(currentCategory, currentChallengeIndex);
