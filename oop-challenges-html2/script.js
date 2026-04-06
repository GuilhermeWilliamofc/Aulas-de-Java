function generateChallenges() {
    function rnd(arr) { return arr[Math.floor(Math.random() * arr.length)]; }
    function rndInt(min, max) { return Math.floor(Math.random() * (max - min + 1)) + min; }

    const cls1 = rnd(["Principal", "App", "Main", "Sistema", "Executavel"]);
    const cls2 = rnd(["Produto", "Cliente", "Filme", "Carro", "Livro"]);
    const varTipo1 = rnd([{t: "int", v: "42"}, {t: "double", v: "9.99"}, {t: "boolean", v: "true"}]);
    const varName1 = rnd(["quantidade", "total", "saldo", "indice"]);
    const varName2 = rnd(["peso", "idade", "codigo"]);
    const math1 = rndInt(2, 9);
    const math2 = rndInt(2, 9);
    const opCond = rnd([">", "<", ">=", "<="]);
    const maxLoop = rndInt(3, 7);
    const methodRet = rnd(["int", "double", "float"]);
    const methodName = rnd(["calcular", "processar", "obterValor", "validar"]);
    const paramName = rnd(["x", "valor", "entrada"]);

    return {
        estrutura: [
            {
                id: 1,
                title: "Estruturação Básica de Arquivo Java",
                description: "Todo código Java precisa estar dentro de uma classe, e para executar, precisamos do método principal. Complete a estrutura chamando a classe de '" + cls1 + "'.",
                type: "Completar Lacunas",
                code: `
<span class="kw">public class</span> <input type="text" class="challenge-input" data-answer="${cls1}" placeholder="nome da classe"> {
    <input type="text" class="challenge-input" data-answer="public static void main" placeholder="assinatura do método principal..." style="width: 250px;"> (String[] args) {
        <span class="co">// Código inicial</span>
    }
}`
            },
            {
                id: 2,
                title: "Assinatura do Método Principal",
                description: "O método responsável por inicializar a aplicação Java exige uma assinatura exata e memorizável. Escreva a linha completa da declaração dele aqui:",
                type: "Escrever Código",
                code: `
<span class="kw">public class</span> ${cls1} {
    <input type="text" class="challenge-input" data-answer="public static void main(String[] args)" placeholder="Escreva a linha do public static... aqui." style="width: 100%;"> {
    }
}`
            },
            {
                id: 3,
                title: "Regra de Ouro: Nome da Classe vs Arquivo",
                description: "Se o seu arquivo salvo no computador se chama '" + cls2 + ".java', como DEVE ser a assinatura de declaração da classe principal dentro dele?",
                type: "Completar Lacunas",
                code: `
<span class="co">// No arquivo ${cls2}.java</span>
<input type="text" class="challenge-input" data-answer="public class" placeholder="modificadores e tipo"> <input type="text" class="challenge-input" data-answer="${cls2}" placeholder="nome da classe"> {
    <span class="co">// ...</span>
}`
            }
        ],
        variaveis: [
            {
                id: 1,
                title: "Declaração de Variáveis Primitivas",
                description: `Identifique o tipo primitivo correto para armazenar o valor '${varTipo1.v}' na variável '${varName1}'.`,
                type: "Inferir Tipo",
                code: `
<span class="kw">public class</span> Main {
    <span class="kw">public static void</span> main(String[] args) {
        <input type="text" class="challenge-input" data-answer="${varTipo1.t}" placeholder="tipo..."> ${varName1} = ${varTipo1.v};
    }
}`
            },
            {
                id: 2,
                title: "Variáveis de Ponto Flutuante",
                description: "Em Java, 'float x = 5.0;' tem um erro de compilação comum porque literais decimais são outro tipo por padrão. Informe o tipo correto que a variável deveria ter para aceitar decimais diretos sem sintaxe extra.",
                type: "Inferir Tipo Decimal",
                code: `
<span class="co">// Certo:</span>
<input type="text" class="challenge-input" data-answer="double" placeholder="tipo..."> x = 5.0;`
            },
            {
                id: 3,
                title: "O Padrão Oculto de Java",
                description: `Considere que a variável de classe (atributo) '${varName2}' do tipo int foi declarada, mas *NÃO* foi inicializada com = antes de ser usada. Qual é o valor padrão gerado automaticamente?`,
                type: "Prever Valor Padrão",
                code: `<input type="text" class="challenge-input" data-answer="0" placeholder="Digite apenas o valor numérico">`
            }
        ],
        io: [
            {
                id: 1,
                title: "Ordem de Operações e Concatenação (Com Parênteses)",
                description: "Preveja exatamente o que aparecerá no console ao executarmos a linha abaixo. Lembre das regras matemáticas!",
                type: "Prever Saída",
                code: `
System.out.println("Soma: " + (${math1} + ${math2}));
<br><br>Console: <input type="text" class="challenge-input" data-answer="Soma:${math1 + math2}" placeholder="Digite a saída exata">`
            },
            {
                id: 2,
                title: "Concatenação Direta (Contexto de String)",
                description: "Java resolve as operações da esquerda para a direita. O que essa linha de código imprime no console se não temos parênteses de prioridade?",
                type: "Prever Variante de Saída",
                code: `
System.out.println("Soma: " + ${math1} + ${math2});
<br><br>Console: <input type="text" class="challenge-input" data-answer="Soma:${math1}${math2}" placeholder="Digite a saída exata">`
            },
            {
                id: 3,
                title: "Matemática Antes da String",
                description: "Com a avaliação da esquerda para a direita, como o Java lidará se a soma acontecer antes de encontrar textos?",
                type: "Prever Matemática+Concatenação",
                code: `
int a = ${math1};
int b = ${math2};
System.out.println(a + b + " total");
<br><br>Console: <input type="text" class="challenge-input" data-answer="${math1 + math2}total" placeholder="Digite a saída exata">`
            }
        ],
        condicionais: [
            {
                id: 1,
                title: "Sintaxe do If/Else",
                description: "O básico do controle de fluxo no Java: condicional sempre leva parênteses e escopos usam chaves.",
                type: "Completar Estrutura",
                code: `
<input type="text" class="challenge-input" data-answer="if" placeholder="..."> (${varName1} ${opCond} ${math1}) {
    System.out.println("Condição confirmada.");
} <input type="text" class="challenge-input" data-answer="else" placeholder="..."> {
    System.out.println("Deu falso.");
}`
            },
            {
                id: 2,
                title: "Operadores Lógicos no Fluxo",
                description: "Dado este código de curta execução (short-circuit), o que será impresso?",
                type: "Prever Fluxo",
                code: `
boolean flag = false;
if (!flag || (${math2} < 0)) {
    System.out.print("X");
}
System.out.print("Y");
<br><br>Console: <input type="text" class="challenge-input" data-answer="XY" placeholder="Ex: XX, XY...">`
            },
            {
                id: 3,
                title: "Corrigir Erro Frequente (Comparação)",
                description: "O if abaixo usando '=' não compila em Java. O que deve ser escrito na lacuna para realizar uma igualdade verificada e consertá-lo?",
                type: "Substituir Operador",
                code: `
int k = ${math1};
// if (k = ${math1}) {  <span class="co"><-- Errado</span>
if (k <input type="text" class="challenge-input" data-answer="==" placeholder="?"> ${math1}) { <span class="co">// Correto</span>
    System.out.println("OK");
}`
            }
        ],
        lacos: [
            {
                id: 1,
                title: "A Anatomia do FOR",
                description: "O laço for clássico exige três partes na sua estrutura. Complete a declaração iterativa:",
                type: "Estruturar Laço",
                code: `
<input type="text" class="challenge-input" data-answer="for" placeholder="comando"> (int i = 0; i < ${maxLoop}; <input type="text" class="challenge-input" data-answer="i++" placeholder="incremento...">) {
    System.out.println(i);
}`
            },
            {
                id: 2,
                title: "Rastreio de Variável no While",
                description: "Faça o teste de mesa iterativo em mente, avançando o laço. Qual o valor final exato atribuído para k ao parar o loop?",
                type: "Prever Variável de Laço",
                code: `
int k = ${math1};
while (k <= ${math1 + 2}) {
    k += 2;
}
<br><br>Valor de k final: <input type="text" class="challenge-input" data-answer="${math1 + 4}" placeholder="Apenas o número">`
            },
            {
                id: 3,
                title: "Soma Cumulativa no Laço FOR",
                description: "O que ocorre na variável sum iterativamente? Note que o laço começa em 1.",
                type: "Cálculo de Iterações",
                code: `
int sum = 0;
for (int i = 1; i <= 3; i++) {
    sum += ${math2};
}
System.out.println(sum);
<br><br>Valor no Console: <input type="text" class="challenge-input" data-answer="${math2 * 3}" placeholder="Apenas o número">`
            }
        ],
        metodos: [
            {
                id: 1,
                title: "Assinaturas e Retornos",
                description: `Conclua a assinatura para o método publico chamado '${methodName}' que obrigatoriamente deve retornar e receber no parâmetro o tipo primitivo apontado de ${methodRet}.`,
                type: "Assinatura Metódica",
                code: `
public <input type="text" class="challenge-input" data-answer="${methodRet}" placeholder="retorno"> ${methodName}(<input type="text" class="challenge-input" data-answer="${methodRet}" placeholder="parâmetro"> ${paramName}) {
    return ${paramName} * 2;
}`
            },
            {
                id: 2,
                title: "O Problema de Tipagem do Retorno",
                description: "O código falha com 'incompatible types' porque promete int e entrega String. Preencha apenas o valor numérico que corresponda de verdade e solucione o erro de compatibilidade.",
                type: "Restaurar Lógica de Tipos",
                code: `
public int obterIndice() {
    return "${math1}"; <span class="co">// Erro! Tipo incorreto</span>
}

<span class="co">// Corrigido:</span>
return <input type="text" class="challenge-input" data-answer="${math1}" placeholder="valor numérico">;`
            },
            {
                id: 3,
                title: "Chamando Métodos em Cadeia",
                description: "Java resolve as execuções de forma aninhada enviando como argumento a anterior. O que acontece em seguida?",
                type: "Mapear Fluxo",
                code: `
public int duplicar(int v) { 
    return v * 2; 
}
<span class="co">// Em outro local:</span>
int x = ${math1};
int temp = duplicar(x);
System.out.println(duplicar(temp));
<br><br>Saída: <input type="text" class="challenge-input" data-answer="${math1 * 4}" placeholder="...">`
            }
        ],
        construtores: [
            {
                id: 1,
                title: "Características do Construtor",
                description: "Preencha a estrutura destacando características exclusivas de construtores: mesmo nome da classe, falta de tipo de retorno, e o uso referencial 'this' para clareza.",
                type: "Montar Construtor",
                code: `
public class ${cls2} {
    private int ${varName2};
    
    public <input type="text" class="challenge-input" data-answer="${cls2}" placeholder="nome..."> (int ${varName2}) {
        <input type="text" class="challenge-input" data-answer="this" placeholder="...">.${varName2} = ${varName2};
    }
}`
            },
            {
                id: 2,
                title: "Valores no Corpo do Construtor",
                description: "Um construtor realiza cálculo ou lógica base no momento da criação ('new'). Qual valor ficará guardado após rodar a linha instanciadora?",
                type: "Cálculo Lógico de Criação",
                code: `
public class Item {
    public int peso;
    public Item(int arg) { 
        this.peso = arg + ${math1}; 
    }
}
<span class="co">// Criação do objeto:</span>
Item p = new Item(${math2});
System.out.println(p.peso);
<br><br>Console: <input type="text" class="challenge-input" data-answer="${math1 + math2}" placeholder="...">`
            },
            {
                id: 3,
                title: "Identidade Semântica e Perda de Construtor",
                description: "Houve um erro grave: o programador colocou uma palavra que fez o Java interpretar o código como um método normal, perdendo os poderes de construtor! Qual palavra deve ser apagada da declaração?",
                type: "Identificar Erro de Assinatura",
                code: `
public class Game {
    public void Game() { <span class="co">// Problema ali!</span>
        <span class="co">// Corpo do suposto construtor</span>
    }
}
<br><br>Escreva a palavra que não poderia aparecer: 
<input type="text" class="challenge-input" data-answer="void" placeholder="...">`
            }
        ]
    };
}

let challengeData = generateChallenges();
let currentCategory = 'estrutura';
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
        let expected = input.getAttribute('data-answer').toLowerCase();
        let value = input.value.toLowerCase();
        
        // Remove spaces for lenient matching 
        expected = expected.replace(/\s+/g, '');
        value = value.replace(/\s+/g, '');

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
            <p style="color: #94a3b8; margin-bottom: 2rem;">Você finalizou a série de desafios de fundamentos até Construtores.</p>
            <button onclick="location.reload()" class="btn primary">Reiniciar Tudo (Novos Textos Aleatórios)</button>
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
