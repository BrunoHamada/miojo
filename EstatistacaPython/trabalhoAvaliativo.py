#==================================================
# Fatec de Ferraz de Vasconcelos
# Programadores: Bruno Hamada de Freitas, Marcos Paulo Teodoro Silva, Nicoly de Lima Santos e Polliany Vieira da Paixão
# Data 24/10/2022
# Programa resolvendo: Valor Máximo, Valor Mínimo, Média, Mediana, Variância, Desvio Padrão (dados de amostra)
#==================================================
#==================================================  

import statistics as stat # Chamando a biblioteca estatisca. 

arquivo = open("ExemplodeEntrada.txt")# Abrindo o arquivo txt.
dados = arquivo.readlines()

Lista1 = [] # Criando listas e variaveis.
Lista2 = []

for i in dados: 
    Lista1.append(int(i.strip()))# Laço para remover caracteres de espaço. 
    #Laço para converter os dados na lista de string para int.

#for i in Lista1:
    #Lista2.append(int(i))# 

# Foi utilizada as funções da biblioteca dentro dos prints, sem a necessidade de criar uma variável apenas chamando 
# a lista com os dados no print e utilizando as funções.   
print(f"Máximo: {max(Lista1):>12.2f}\nMínimo: {min(Lista1):>12.2f}\nMédia: {stat.mean(Lista1):>13.2f}\nMediana: {stat.median(Lista1):>11.2f}")
print(f"Variância: {stat.variance(Lista1):>9.2f}\nDesvio padrão: {stat.pstdev(Lista1):.2f}")

