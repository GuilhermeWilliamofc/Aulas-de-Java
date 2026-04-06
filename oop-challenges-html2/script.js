function generateChallenges() {
    function rnd(arr) { return arr[Math.floor(Math.random() * arr.length)]; }
    function rndInt(min, max) { return Math.floor(Math.random() * (max - min + 1)) + min; }

    const contexts = [
        {
            name: "Automotivo",
            classes: ["Carro", "Moto", "Caminhão", "Veiculo"],
            attributes: ["ano", "quilometragem", "potencia", "portas", "litrosTanque"],
            mathRange1: [2000, 2024],
            mathRange2: [10000, 250000],
            methods: ["acelerar", "frear", "abastecer", "revisar"],
            params: ["km", "litros", "velocidade"],
            types: { ano: "int", quilometragem: "int", potencia: "int", portas: "int", litrosTanque: "double" }
        },
        {
            name: "Comércio",
            classes: ["Produto", "Pedido", "Venda", "Item"],
            attributes: ["preco", "estoque", "codigo", "peso", "desconto"],
            mathRange1: [1, 500],
            mathRange2: [5, 50],
            methods: ["comprar", "vender", "aplicarDesconto", "repor"],
            params: ["qtd", "taxa", "valor"],
            types: { preco: "double", estoque: "int", codigo: "int", peso: "double", desconto: "double" }
        },
        {
            name: "Pessoa",
            classes: ["Cliente", "Aluno", "Usuario", "Paciente"],
            attributes: ["idade", "id", "saldo", "nota", "pontos"],
            mathRange1: [18, 90],
            mathRange2: [1, 1000],
            methods: ["cadastrar", "atualizar", "validar", "processar"],
            params: ["n", "v", "entrada"],
            types: { idade: "int", id: "int", saldo: "double", nota: "double", pontos: "int" }
        },
        {
            name: "Biblioteca",
            classes: ["Livro", "Revista", "Ebook", "Obra"],
            attributes: ["paginas", "edicao", "anoPublicacao", "volume", "isbn"],
            mathRange1: [100, 1200],
            mathRange2: [1, 20],
            methods: ["abrir", "emprestar", "devolver", "consultar"],
            params: ["p", "id", "capitulo"],
            types: { paginas: "int", edicao: "int", anoPublicacao: "int", volume: "int", isbn: "long" }
        }
    ];

    const ctx = rnd(contexts);
    const cls1 = rnd(["Principal", "App", "Main", "Sistema", "Executavel"]);
    const cls2 = rnd(ctx.classes);
    
    // Pick unique attributes from context
    let attrs = [...ctx.attributes];
    const varName1 = attrs.splice(rndInt(0, attrs.length - 1), 1)[0];
    const varName2 = attrs.splice(rndInt(0, attrs.length - 1), 1)[0];
    
    const methodName = rnd(ctx.methods);
    const paramName = rnd(ctx.params);

    const math1 = rndInt(ctx.mathRange1[0], ctx.mathRange1[1]);
    const math2 = rndInt(ctx.mathRange2[0], ctx.mathRange2[1]);

    const vType1 = ctx.types[varName1] || "int";
    const vVal1 = vType1 === "double" ? (rndInt(10, 500) + .99) : rndInt(ctx.mathRange1[0], ctx.mathRange1[1]);
    const varTipo1 = {t: vType1, v: vVal1.toString()};
    
    const vType2 = ctx.types[varName2] || "int";

    const opCond = rnd([">", "<", ">=", "<="]);
    const maxLoop = rndInt(3, 7);
    const methodRet = vType1; // Using variable type for method return consistency

    return {
        estrutura: [
            {
                id: 1,
                title: "Estruturação Básica de Arquivo Java",
                description: `Todo código Java precisa estar dentro de uma classe, e para executar, precisamos do método principal. Complete a estrutura chamando a classe de '${cls1}'.`,
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
                description: `Se o seu arquivo salvo no computador se chama '${cls2}.java', como DEVE ser a assinatura de declaração da classe principal dentro dele?`,
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
                description: `No contexto ${ctx.name}, identifique o tipo primitivo correto para armazenar o valor '${varTipo1.v}' na variável '${varName1}'.`,
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
                description: `Considere que o atributo '${varName2}' do tipo ${vType2} foi declarado na classe '${cls2}', mas *NÃO* foi inicializado com = antes de ser usado. Qual é o valor numérico padrão gerado automaticamente?`,
                type: "Prever Valor Padrão",
                code: `<input type="text" class="challenge-input" data-answer="${vType2 === 'double' ? '0.0' : vType2 === 'long' ? '0' : '0'}" placeholder="Digite apenas o valor numérico">`
            }
        ],
        io: [
            {
                id: 1,
                title: "Ordem de Operações e Concatenação (Com Parênteses)",
                description: `Preveja exatamente o que aparecerá no console ao executarmos a linha abaixo. Considere math1=${math1} e math2=${math2}.`,
                type: "Prever Saída",
                code: `
System.out.println("Total: " + (${math1} + ${math2}));
<br><br>Console: <input type="text" class="challenge-input" data-answer="Total:${math1 + math2}" placeholder="Digite a saída exata">`
            },
            {
                id: 2,
                title: "Concatenação Direta (Contexto de String)",
                description: "Java resolve as operações da esquerda para a direita. O que essa linha de código imprime no console se não temos parênteses de prioridade?",
                type: "Prever Variante de Saída",
                code: `
System.out.println("Resultado: " + ${math1} + ${math2});
<br><br>Console: <input type="text" class="challenge-input" data-answer="Resultado:${math1}${math2}" placeholder="Digite a saída exata">`
            },
            {
                id: 3,
                title: "Matemática Antes da String",
                description: "Com a avaliação da esquerda para a direita, como o Java lidará se a soma acontecer antes de encontrar textos?",
                type: "Prever Matemática+Concatenação",
                code: `
int a = ${math1};
int b = ${math2};
System.out.println(a + b + " unidades");
<br><br>Console: <input type="text" class="challenge-input" data-answer="${math1 + math2}unidades" placeholder="Digite a saída exata">`
            }
        ],
        condicionais: [
            {
                id: 1,
                title: "Sintaxe do If/Else",
                description: `O básico do controle de fluxo: complete a lógica para verificar se '${varName1}' é condizente.`,
                type: "Completar Estrutura",
                code: `
<input type="text" class="challenge-input" data-answer="if" placeholder="..."> (${varName1} ${opCond} ${math1}) {
    System.out.println("Valor dentro do limite.");
} <input type="text" class="challenge-input" data-answer="else" placeholder="..."> {
    System.out.println("Valor fora do esperado.");
}`
            },
            {
                id: 2,
                title: "Operadores Lógicos no Fluxo",
                description: `Dado este código de curta execução, o que será impresso? Considere math2=${math2}.`,
                type: "Prever Fluxo",
                code: `
boolean flag = false;
if (!flag || (${math2} < 0)) {
    System.out.print("V");
}
System.out.print("F");
<br><br>Console: <input type="text" class="challenge-input" data-answer="VF" placeholder="Ex: VV, VF...">`
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
    System.out.println("Igual!");
}`
            }
        ],
        lacos: [
            {
                id: 1,
                title: "A Anatomia do FOR",
                description: `O laço for clássico. Complete a declaração para iterar ${maxLoop} vezes:`,
                type: "Estruturar Laço",
                code: `
<input type="text" class="challenge-input" data-answer="for" placeholder="comando"> (int i = 0; i < ${maxLoop}; <input type="text" class="challenge-input" data-answer="i++" placeholder="incremento...">) {
    System.out.println(i);
}`
            },
            {
                id: 2,
                title: "Rastreio de Variável no While",
                description: `Qual o valor final de k? Começamos com k=${math1}.`,
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
                description: `O que ocorre na variável sum iterativamente?`,
                type: "Cálculo de Iterações",
                code: `
int sum = 0;
for (int i = 1; i <= 3; i++) {
    sum += ${math1 % 10 + 1};
}
System.out.println(sum);
<br><br>Valor no Console: <input type="text" class="challenge-input" data-answer="${(math1 % 10 + 1) * 3}" placeholder="Apenas o número">`
            }
        ],
        metodos: [
            {
                id: 1,
                title: "Assinaturas e Retornos",
                description: `Conclua a assinatura para o método da classe '${cls2}' chamado '${methodName}'. Ele deve retornar e receber '${vType1}'.`,
                type: "Assinatura Metódica",
                code: `
public <input type="text" class="challenge-input" data-answer="${vType1}" placeholder="retorno"> ${methodName}(<input type="text" class="challenge-input" data-answer="${vType1}" placeholder="parâmetro"> ${paramName}) {
    return ${paramName};
}`
            },
            {
                id: 2,
                title: "O Problema de Tipagem do Retorno",
                description: "O código falha porque promete int e entrega String. Preencha apenas o valor numérico correto.",
                type: "Restaurar Lógica de Tipos",
                code: `
public int obterValor() {
    return "${math1 % 100}"; <span class="co">// Erro!</span>
}

<span class="co">// Corrigido:</span>
return <input type="text" class="challenge-input" data-answer="${math1 % 100}" placeholder="valor numérico">;`
            },
            {
                id: 3,
                title: "Chamando Métodos em Cadeia",
                description: "Java resolve as execuções de forma aninhada. O que aparece no console?",
                type: "Mapear Fluxo",
                code: `
public int triplicar(int v) { 
    return v * 3; 
}
<span class="co">// Em outro local:</span>
int x = ${rndInt(1, 5)};
int temp = triplicar(x);
System.out.println(triplicar(temp));
<br><br>Saída: <input type="text" class="challenge-input" data-answer="${((rndInt(1, 5)) * 3) * 3}" placeholder="...">`,
                callback: (data) => {
                    // Update the logic to use the same random x value
                    const xVal = rndInt(1, 5);
                    data.code = data.code.replace(/\$\{rndInt\(1, 5\)\}/g, xVal);
                    data.answers[0] = (xVal * 3 * 3).toString();
                }
            }
        ],
        construtores: [
            {
                id: 1,
                title: "Características do Construtor",
                description: `No contexto ${ctx.name}, complete o construtor da classe '${cls2}'.`,
                type: "Montar Construtor",
                code: `
public class ${cls2} {
    private ${vType2} ${varName2};
    
    public <input type="text" class="challenge-input" data-answer="${cls2}" placeholder="nome..."> (${vType2} ${varName2}) {
        <input type="text" class="challenge-input" data-answer="this" placeholder="...">.${varName2} = ${varName2};
    }
}`
            },
            {
                id: 2,
                title: "Valores no Corpo do Construtor",
                description: "Qual valor ficará guardado após a inicialização?",
                type: "Cálculo Lógico de Criação",
                code: `
public class ${cls2} {
    public int valor;
    public ${cls2}(int arg) { 
        this.valor = arg + 10; 
    }
}
<span class="co">// Criação do objeto:</span>
${cls2} obj = new ${cls2}(${math1 % 100});
System.out.println(obj.valor);
<br><br>Console: <input type="text" class="challenge-input" data-answer="${(math1 % 100) + 10}" placeholder="...">`
            },
            {
                id: 3,
                title: "Identidade Semântica e Perda de Construtor",
                description: "O código abaixo não é um construtor real porque tem um tipo de retorno. Qual palavra deve ser apagada?",
                type: "Identificar Erro de Assinatura",
                code: `
public class ${cls2} {
    public void ${cls2}() { <span class="co">// Erro!</span>
        <span class="co">// ...</span>
    }
}
<br><br>Palavra para apagar: 
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
    categories.forEach(cat => total += challengeData[cat].length);

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

catBtns.forEach(btn => {
    btn.addEventListener('click', () => {
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
            <p style="color: #94a3b8; margin-bottom: 2rem;">Você finalizou a série de desafios com sucesso!</p>
            <button onclick="location.reload()" class="btn primary">Reiniciar (Novos Desafios Contextualizados)</button>
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
