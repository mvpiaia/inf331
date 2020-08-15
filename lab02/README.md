## Items para o Lab 2

Este lab é formado por um conjunto de atividades que serã detalhadas abaixo

## Tarefa sobre catálogo de componentes

[Notebook com as Tarefas](./notebooks/Tarefas.ipynb)

## Tarefa Web Componente 1

~~~html
<dcc-trigger label="Mundo"
             action="noticia/mundo/politica"
             value="Noticias do Mundo: Essa tal de Internet...">
</dcc-trigger>
<dcc-trigger label="Brasil P"
             action="noticia/brasil/politica"
             value="Noticias do brasil: A Internet é de Governador Valadares">
</dcc-trigger>
<dcc-trigger label="Brasil E"
             action="noticia/brasil/esportes"
             value="Noticias do ESPORTE: FIFA diz que o Palmeiras sempre teve um mundial">
</dcc-trigger>
<dcc-trigger label="Bahia"
             action="noticia/bahia/esporte"
             value="Noticias sempre boas: O Santa Cruza empata com o Bahia como campeões do século XXI">
</dcc-trigger>
<dcc-lively-talk duration="0"
                 character="doctor"
                 speech="">
<subscribe-dcc topic="noticia/#/politica"></subscribe-dcc>
</dcc-lively-talk>
<dcc-lively-talk duration="0"
                 character="nurse"
                 direction="right"
                 speech="">
<subscribe-dcc topic="#/b#/#"></subscribe-dcc>
</dcc-lively-talk>
<dcc-lively-talk duration="0"
                 character="patient"
                 speech="">
<subscribe-dcc topic="#"></subscribe-dcc>
</dcc-lively-talk>
~~~

## Tarefa Web Components 2

