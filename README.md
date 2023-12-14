Documentação do Aplicativo de Conversão de Moedas
Versão: 1.0
Data: 2023-12-13
Autor: Carltio Antonio de Sousa Júnior
Resumo
Este aplicativo permite converter moedas estrangeiras em reais brasileiros. Ele é fácil de usar e possui apenas três campos: um para o valor a ser convertido, um para selecionar a moeda de origem e um para solicitar a conversão.
Requisitos
Android Studio 
Android 5.0 ou superior
Instalação
Baixe ou transfira o aplicativo para seu aparelho Android.
Instale o aplicativo no seu dispositivo Android.
Uso
Abra o aplicativo.
Digite o valor a ser convertido no campo "Valor".
Selecione a moeda de origem no campo "Moeda de origem".
Pressione o botão "Converter".
Resultado
O resultado da conversão será exibido no campo "Resultado". O resultado é exibido em reais brasileiros.
Exemplo
Suponha que você deseja converter 100 dólares americanos em reais brasileiros. Para isso, você deve seguir os seguintes passos:
Abra o aplicativo.
Digite 100 no campo "Valor".
Selecione "USD" no campo "Moeda de origem".
Pressione o botão "Converter".
O resultado da conversão será 550,00 reais brasileiros.
Suporte
Se você tiver alguma dúvida ou problema com o aplicativo, entre em contato com o autor pelo [endereço de e-mail].
Bugs conhecidos
O aplicativo pode não funcionar corretamente em dispositivos com Android 4.4 ou inferior.
O aplicativo pode não funcionar corretamente em dispositivos com uma conexão de internet lenta.
Próximos passos
Adicionar suporte a mais moedas estrangeiras.
Adicionar um histórico de conversões.
Adicionar uma pesquisa de moedas.
Agradecimentos
Agradeço ao Android Studio pela plataforma de desenvolvimento.
Especificações técnicas
Linguagem de programação: Kotlin
Implementação
O layout principal do aplicativo é composto por três campos:
Um campo de texto para o valor a ser convertido
Um seletor de moedas
Um botão para converter o valor
O seletor de moedas é implementado usando uma lista de itens. Cada item da lista representa uma moeda estrangeira. Quando o usuário seleciona uma moeda, o valor selecionado é armazenado O botão de conversão é implementado usando um componente Button. Quando o usuário pressiona o botão, o ViewModel é notificado para realizar a conversão.
A lógica de negócio é implementada usando o ViewModel. O ViewModel é responsável por obter as cotações das moedas estrangeiras, realizar a conversão do valor e atualizar a UI com o resultado da conversão.
Para obter as cotações das moedas estrangeiras, o ViewModel faz uma requisição HTTP para uma API externa. A API retorna um JSON com as cotações das moedas. O ViewModel decodifica o JSON e armazena as cotações na propriedade currencies.
Para realizar a conversão do valor, o ViewModel usa as cotações armazenadas na propriedade currencies. O ViewModel calcula o valor convertido e armazena o resultado na propriedade convertedValue.
Para atualizar a UI com o resultado da conversão, o ViewModel usa o LiveData. O LiveData é um componente que notifica os observadores quando o seu valor é alterado. O ViewModel publica o valor convertido no LiveData. A UI observa o LiveData e atualiza o seu conteúdo quando o valor é alterado.
Testes
O aplicativo foi testado usando a máquina virtual do Android Studio. Os testes foram escritos para garantir que o aplicativo funciona corretamente.
Conclusão
Este aplicativo é uma ferramenta útil para converter moedas estrangeiras em reais brasileiros. O aplicativo é fácil de usar e possui um design simples.
