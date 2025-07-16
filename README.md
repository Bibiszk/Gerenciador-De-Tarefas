# 📝 GerenciadorDeTarefas (versão com menu interativo)

Este projeto foi desenvolvido como parte da aula **"Operações Básicas List: testando os métodos"**, do módulo **"Conhecendo Collections Java"** no **Bootcamp Back-End Java** (DIO - Digital Innovation One).

O objetivo é praticar os conceitos de listas (`List`), classes, encapsulamento e operações básicas com **Collections em Java**, além de interação com o usuário via terminal.

---

## 📚 Descrição

O **GerenciadorDeTarefas** é um sistema simples em Java que permite:

- ✅ Adicionar tarefas
- ❌ Remover tarefas por descrição
- 📄 Listar todas as tarefas
- 🔢 Contar o número total de tarefas

Com interface de menu no terminal para facilitar a prática e testes dos métodos da classe `List`.

---

## 🏗️ Estrutura do Projeto

```bash
GerenciadorDeTarefas/
└── src/
    ├── Tarefa.java            # Classe que representa uma tarefa
    └── ListaDeTarefa.java     # Classe com a lógica + método main com menu
▶️ Como Executar
1. Clone este repositório:
bash
Copiar
Editar
git clone https://github.com/seu-usuario/GerenciadorDeTarefas.git
cd GerenciadorDeTarefas/src
2. Compile os arquivos:
bash
Copiar
Editar
javac *.java
3. Execute o programa:
bash
Copiar
Editar
java ListaDeTarefa
💡 Exemplo de Execução
markdown
Copiar
Editar
=== MENU ===
1. Adicionar tarefa
2. Remover tarefa
3. Listar tarefas
4. Contar tarefas
0. Sair
Escolha uma opção: 1
Digite a descrição da tarefa: Estudar Collections
✅ Tarefa adicionada!

Escolha uma opção: 3
📋 Lista de Tarefas:
- Estudar Collections
🛠️ Tecnologias Utilizadas
Java 8+

Scanner (entrada de dados)

ArrayList

Estruturas de repetição e controle

📌 Conceitos Praticados
✅ Programação Orientada a Objetos (POO)

✅ Encapsulamento

✅ Coleções Java (List, ArrayList)

✅ Menu interativo com entrada do usuário

🧠 Autor
Desenvolvido por [Seu Nome Aqui]
