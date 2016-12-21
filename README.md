### RBO_Retorno_Bancario_Organizador 📂

Sistema para organizar os arquivos de retorno. Os arquivos são gerados pelo Banco Itaú.

###### Sistema para organizar os arquivos de retorno gerados pelo Banco Itaú - SISPAG.

Versão 1.0.0 👌

* Lê os arquivos dentro da pasta "C:\ArquivoRetBanc\ArquivosRet_00". Em seguida organiza os arquivos validando pelo valor da conta corrente na linha "Hearder".
* Movimenta cada arquivo de retorno para dentro da pasta, relacionando conta corente com o nome do empreendimento. Usando os dados informado pelo usuário.

**Versão 1.1.0** 👌

* Após a leitura e movimentação dos arquivos, mostra na tela a mensagem de processo concluído.
**Versão 1.2.0** 👌

* Nova mensagem de conclusão de processo
* Sistama para criação dos diretorios raiz e subpastas, onde serão guardados os arquivos .ret

**Versão 1.3.0** 👎

*Em desenvolvimento*

###### Documentação de melhorias do programa RBO - "Retorno Bancário Organizador"

*Itens para melhoria*

~~Modificar a mensagem de finalização.~~
~~Implementar a criação dos diretórios antes da execução de leitura e organização.~~
Separar os tipos de arquivos .ret pela linha Lote buscando o valor 00 & BD
Criar estrutura organizadora por data, para novos arquivos.
Criar rastreio de arquivos no formato .RET, em seguida mover para a pasta "C:...\ARQUIVO_RET"
