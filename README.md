## 🍰 Padaria – Aplicando o Padrão Decorator

📖 **Descrição**  
Projeto de exemplo para aplicar o padrão **Decorator**.  
O sistema simula uma padaria que produz bolos simples e complexos. Os bolos podem ser decorados com multicamadas, granulado e dizeres personalizados, permitindo composições flexíveis e encadeadas.

---

🎯 **Objetivo**  
Refatorar o código para usar o padrão Decorator.  
Permitir que bolos sejam decorados com múltiplas camadas, granulado e dizeres.  
Adicionar um novo tipo de bolo: morango, com custo dobrado.  
Imprimir corretamente a descrição e o custo de cada bolo.

---

🧠 **Padrão Decorator aplicado**  
- `Cake` (classe base) → representa bolos simples.  
- `StrawberryCake` → novo tipo de bolo com custo dobrado.  
- Decoradores:
  - `MultiLayeredCake` → adiciona $5 e prefixa "Multi-layered".
  - `SprinklesCake` → adiciona $2 e concatena "with sprinkles".
  - `SayingCake` → não altera custo, concatena "with saying 'X'".
- `Main` → instancia os bolos e imprime a ordem.

Esse padrão foi **crucial** porque:
- Permite adicionar funcionalidades (camadas, granulado, dizeres) sem modificar as classes originais.  
- Garante flexibilidade na composição dos bolos.  
- Facilita a manutenção e expansão do sistema.

---

🧠 **Lógica para resolver a questão**  
1. Criar decoradores que estendem `Cake` e recebem outro `Cake` como parâmetro.  
2. Cada decorador altera custo e/ou descrição conforme o requisito.  
3. Criar `StrawberryCake` com custo dobrado.  
4. No `Main.java`, instanciar os bolos conforme o enunciado e imprimir a ordem.

---

🛠️ **Estrutura**

```
src/
├─ Cake.java
├─ ChocolateCake.java
├─ VanillaCake.java
├─ StrawberryCake.java
├─ MultiLayeredCake.java
├─ SprinklesCake.java
├─ SayingCake.java
├─ Order.java
├─ Main.java
PROMPTS.md
AJUSTES.md
```

---

▶️ **Execução**

**Compile:**
```bash
javac src/*.java
```

**Rode:**
```bash
java -cp src Main
```

**Saída Esperada:**
```
10 Chocolate cake
10 Vanilla cake with saying "PLAIN!"
12 Vanilla cake with sprinkles with saying "FANCY!"
29 Multi-layered Strawberry cake with sprinkles with sprinkles with saying "One of" with saying "EVERYTHING"
```

---

📑 **Documentação da IA**  
- `PROMPTS.md` → prompts usados e respostas resumidas.  
- `AJUSTES.md` → ajustes feitos sobre as respostas da IA.

---

📌 **Histórico de commits**

- adicionar bolos simples (chocolate, baunilha)  
- implementar StrawberryCake com custo dobrado  
- implementar decoradores multicamadas, granulado e dizeres  
- atualizar Main com os bolos decorados  
- adicionar Order para armazenar bolos  
- adicionar documentação dos prompts e ajustes  
- adicionar README com explicações e instruções

---

👨‍💻 **Autores**  
Pedro Victor da Silva Pereira  
Valéria Cristina

