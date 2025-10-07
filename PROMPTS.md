Registro de uso de IA 
Ferramenta utilizada: Copilot Pro 
Datas: 06/10/2025 – 07/10/2025  
Disciplina: Padrões de Projeto

---

**Prompt 1**  
**Pergunta:** 
Como devo estruturar esse projeto:

"O pacote bakery no código inicial contém bolos simples. Agora preciso aplicar o padrão Decorator para permitir bolos mais complexos. Quero criar decoradores para multicamadas (+$5), granulado (+$2) e dizeres personalizados (sem custo). Também preciso adicionar um novo tipo de bolo: morango (custo dobrado). Me ajude a implementar essas classes decoradoras corretamente."

**Resposta (resumo da IA):**  
Criar decoradores: `MultiLayeredCake`, `SprinklesCake`, `SayingCake`, todos estendendo `Cake`.  
Cada decorador recebe um `Cake` como parâmetro e modifica custo e descrição conforme solicitado.  
Criar `StrawberryCake` com custo dobrado.  
Permitir composições encadeadas como:  
`new MultiLayeredCake(new SprinklesCake(new SayingCake(new StrawberryCake(), "Olá")))`

---

**Prompt 2**  
**Pergunta:**  
"Quero que você gere os arquivos Java com base nesse prompt."


"Tenho um código Java que representa uma padaria com bolos simples: ChocolateCake, VanillaCake e StrawberryCake. Cada bolo estende uma classe abstrata chamada Cake, que tem um método getCost() e getDescription(). Agora preciso aplicar o padrão Decorator para permitir bolos mais complexos.

Quero criar decoradores que possam:
- Adicionar multicamadas ao bolo, aumentando o custo em $5 e adicionando "Multi-layered" no início da descrição.
- Adicionar granulado, aumentando o custo em $2 e adicionando "with sprinkles" no final da descrição.
- Adicionar dizeres personalizados, sem alterar o custo, e adicionando "with saying 'X'" no final da descrição.

Cada decorador deve ser uma classe que estende Cake e recebe um Cake como parâmetro. O código deve permitir composições como: um bolo de morango em várias camadas com granulado duplo e dois dizeres ("One of" e "EVERYTHING").

Me ajude a implementar essas classes decoradoras corretamente."

**Resposta (resumo da IA):**  
IA gerou os arquivos:
- `StrawberryCake.java`
- `MultiLayeredCake.java`
- `SprinklesCake.java`
- `SayingCake.java`
- Atualizou `Main.java` com os quatro bolos pedidos no enunciado.  
  Validou a saída esperada com custo e descrição corretos.

---

**Prompt 3**  
**Pergunta:**  
"Quero que gere os commits parte por parte e adicione explicações no código."

**Resposta (resumo da IA):**  
IA gerou plano de commits progressivos:
1. Código base com bolos simples.
2. Novo tipo de bolo: morango.
3. Decoradores multicamadas, granulado e dizeres.
4. Atualização do `Main.java` com os bolos decorados.
5. Documentação dos prompts e ajustes.
6. Adição do `README.md` com explicações e instruções de execução.
