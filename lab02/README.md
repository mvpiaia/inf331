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

~~~html
<dcc-trigger label="Start showing News" action="next/rss">
</dcc-trigger>

<dcc-rss publish="rss/science" source="https://www.wired.com/category/science/feed", interval=20000>
<subscribe-dcc topic="next/rss" role="start"></subscribe-dcc>
</dcc-rss>

<dcc-rss publish="rss/design" source="https://www.wired.com/category/design/feed", interval=20000>
<subscribe-dcc topic="next/rss" role="start"></subscribe-dcc>
</dcc-rss>

<dcc-aggregator publish="aggregate/science" quantity="3">
  <subscribe-dcc topic="rss/science"></subscribe-dcc>
</dcc-aggregator>

<dcc-lively-dialog rate="6s" duration="2s">
<dcc-lively-talk id="doctor"
                 duration="0s"
                 
                 character="doctor"
                 speech="News ">
  <subscribe-dcc topic="aggregate/science"></subscribe-dcc>
</dcc-lively-talk>

<dcc-lively-talk id="nurse"
                 duration="0s"
                 character="nurse"
                  direction="right"
                 speech="News ">
  <subscribe-dcc topic="#/science"></subscribe-dcc>
</dcc-lively-talk>

<dcc-lively-talk id="patient"
                 duration="0s"
                 character="patient"
                 speech="News ">
  <subscribe-dcc topic="#/design"></subscribe-dcc>
</dcc-lively-talk>
</dcc-lively-dialog>
~~~

