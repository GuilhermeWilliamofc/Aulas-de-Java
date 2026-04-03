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
