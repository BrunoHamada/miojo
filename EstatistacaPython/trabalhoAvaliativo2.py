arquivo = open("ExemplodeEntrada.txt")
dadosB = arquivo.readlines()

lista1 = []
count = 0

for u in dadosB:
    lista1.append(int(u.strip()))
    count += 1


class Metodos:

    def media():
        soma = 0

        for i in lista1:
            soma += i

        med = soma/count

        return med

    def mediana():
        if count % 2 == 0:
            mediana = (lista1[count/2]+lista1[count/2+1])/2
        else:
            mediana = lista1[int((count-1)/2+1)] #remova o int e verás o caos subir a terra na forma de um programa de computador
        
        return mediana

    def max():
        for i in range(0, count):
            if lista1[i] > lista1[i-1]:
                maximo = lista1[i]

        return maximo
    
    def min():
        for i in range(0, count):
            if lista1[i] < lista1[i-1]:
                minimo = lista1[i]

        return minimo

    def var():
        lista2 = []
        for i in lista1:
            lista2.append((i-Metodos.media())**2)
        res = sum(lista2)/(count-1)
        return res
     
    def desvP():
        lista2 = []
        for i in lista1:
            lista2.append((i-Metodos.media())**2)
        res = sum(lista2)/(count)
        
        a = res**0.5
        return a

print(f"\n{'Média: ':<15.15s}{Metodos.media():.2f}\n{'Mediana: ':<15.15s}{Metodos.mediana():.2f}\n{'Máximo: ':<15.15s}{Metodos.max():.2f}\n{'Mínimo: ':<15.15s}{Metodos.min():.2f}\n{'Variância: ':<15.15s}{Metodos.var():.2f}\n{'Desvio Padrão: ':<15.15s}{Metodos.desvP():.2f}")