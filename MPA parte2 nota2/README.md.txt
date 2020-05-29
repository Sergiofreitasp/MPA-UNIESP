# Métodos Avançados de Programação

## UNIESP Faculdades

### Professora

* Drª Alana Morais ([alanamm.prof@gmail.com](mailto:alanamm.prof@gmail.com))

### Aluno
Sérgio de Freitas Pereria


### Padrão Comportamental: 
Visitor


## Padrão Visitor

### Problema: 

Quando você precisa fazer uma operação com todos os elementos de uma estrutura de objetos complexa, como uma arvore de objetos.
Quando você precisa adicionar uma nova funcionalidade a uma classe já existente, entretanto essa nova funcionalidade ficaria “estranha” dentro da classe ou poderia ocasionar alguma instabilidade ao sistema. 


### Solução: 

Colocar essa nova funcionalidade em uma classe separada, interface Visitor, e não nas classes existentes. Quem vai realizar o novo comportamento é o objeto passado nos métodos definidos na Visitor.
Siga as instruções abaixo:
Implemente uma interface chamada Visitor, e nela faça a assinatura dos métodos recebendo um objeto de cada elemento que você está trabalhando. Para cada um elemento, um método na Visitor.
Na classe separada que você definiu a nova funcionalidade, implemente a interface Visitor. Adicione a funcionalidade nova em cada método que implementou do Visitor.
Adicione uma assinatura de método na interface dos seus elementos. Chame esse método de “accept” e ele deve receber como parâmetro um objeto de nome visitor do tipo Visitor.
Nas classes dos seus elementos, apenas implemente o método accept retornando o método visitante (do elemento especifico) do objeto visitor passando o próprio objeto da classe (this).



### Consequências: 

*Fica mais fácil adicionar novas funcionalidades
*Reúne operações pertinentes e separa informações não pertinentes
*Fica difícil acrescentar novos elementos, na estrutura de objetos mais complexa porque sempre vai ter que adicionar também um método na interface Visitor e implementar nas classes que implementam essa interface.
*Você pode visitar qualquer classe que queira, mesmo que as classes da sua escolha não estejam relacionas.
*Pode acumular estados à medida que visitam cada elemento na estrutura do objeto
*Pode comprometer o encapsulamento, já que ele faz várias operações publicas que acessam o estado interno do objeto 



### Exemplo: 

Contexto do exemplo: 
Uma loja online em que o gerente decide dar um desconto especial, no carrinho de compras, de 20% em Macbooks que custam acima de R$4000 e de R$149,90 nos Iphones que custam mais que R$3699.90.