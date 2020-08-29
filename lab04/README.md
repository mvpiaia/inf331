# Items para o Lab 4

Este lab é formado por um conjunto de atividades que serão detalhadas abaixo

## Tarefa 1

![Diagrama de grupos de componentes](./images/tarefa_1.png)

## Tarefa 2

![Diagrama de componentes dos grupos Controller e View](./images/tarefa_2.png)



## Tarefa 3

![Diagrama de componentes dos grupos Model e Controller](./images/tarefa_3.png)

## Tarefa 4

#### titulo: News.org - tope headlines

URI: https://newsapi.org/v2/top-headlines

HTTP Request Header

```
GET /v2/top-headlines?country=br&apiKey=d7d2d39e7ca745288387365a2a0d2cae HTTP/2
Host: newsapi.org
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:80.0) Gecko/20100101 Firefox/80.0
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Accept-Language: pt-BR,pt;q=0.8,en-US;q=0.5,en;q=0.3
Accept-Encoding: gzip, deflate, br
Connection: keep-alive
Cookie: __cfduid=d40135319025cc09c9dda2332423436891598670948; _ga=GA1.2.2145025848.1598670949; _gid=GA1.2.1397269755.1598670949; newsapi=A154311AF9394213E700647C8A8D8258936409FB9260FE66BAA74508EF4E3FFEB8A6BF8117D431D7D04415858726E1D1E363ABB8D4DA2903EFE34DC41FF958C3FB8E35C93F4A010EE6CAF4BD569A500C9F67EB1D7801D5C0272C817D8931D2F7
Upgrade-Insecure-Requests: 1
TE: Trailers
```

HTTP Response Header

```
HTTP/2 200 OK
date: Sat, 29 Aug 2020 03:31:15 GMT
content-type: application/json; charset=utf-8
cache-control: no-cache
pragma: no-cache
expires: -1
x-cached-result: true
x-cache-remaining: 99
x-cache-expires: Sat, 29 Aug 2020 03:35:47 GMT
cf-cache-status: DYNAMIC
cf-request-id: 04d9de051b0000f67bb893e200000001
expect-ct: max-age=604800, report-uri="https://report-uri.cloudflare.com/cdn-cgi/beacon/expect-ct"
server: cloudflare
cf-ray: 5ca332b4f949f67b-GRU
content-encoding: br
X-Firefox-Spdy: h2
```

Content

```json
{
  "status": "ok",
  "totalResults": 34,
  "articles": [
    {
      "source": {
        "id": null,
        "name": "Uol.com.br"
      },
      "author": "UOL",
      "title": "\"Jamais menti sobre meu teste\", diz Carla Zambelli após boletim de hospital - UOL Notícias",
      "description": "A deputada federal Carla Zambelli (PSC-SP) disse, na noite de hoje, que \"jamais mentiu\" sobre o teste para coronavírus. A declaração ocorreu pouco tempo depois em que hospital, onde ficou internada, divulgou boletim afirmando que a parlamentar não teve co",
      "url": "https://noticias.uol.com.br/politica/ultimas-noticias/2020/08/28/jamais-menti-sobre-meu-teste-diz-carla-zambelli-apos-boletim-de-hospital.htm",
      "urlToImage": "https://conteudo.imguol.com.br/c/noticias/9a/2020/05/12/carla-zambelli-fala-no-parlatorio-da-camara-dos-deputados-1589310892074_v2_615x300.jpg",
      "publishedAt": "2020-08-29T00:41:37Z",
      "content": "A deputada federal Carla Zambelli (PSC-SP) disse, na noite de hoje, que \"jamais mentiu\" sobre o teste para coronavírus. A declaração ocorreu pouco tempo depois em que hospital, onde ficou internada, … [+1752 chars]"
    },
    {
      "source": {
        "id": "globo",
        "name": "Globo"
      },
      "author": null,
      "title": "Ídolo do Barcelona, Stoichkov não acredita em chantagem política de Messi contra Bartomeu - globoesporte.com",
      "description": "\"Não creio que Leo vai dizer claramente: 'Você vai embora e eu fico'\", diz o ex-atacante búlgaro",
      "url": "https://globoesporte.globo.com/futebol/futebol-internacional/futebol-espanhol/noticia/idolo-do-barcelona-nao-cre-em-chantagem-politica-de-messi-contra-bartomeu.ghtml",
      "urlToImage": "https://s2.glbimg.com/P7c7Z68Q2GebLtVTep9dC2zymZ8=/1200x/smart/filters:cover():strip_icc()/s.glbimg.com/es/ge/f/original/2017/03/04/232.png",
      "publishedAt": "2020-08-29T00:08:00Z",
      "content": "Ídolo do Barcelona no primeiro título da Liga dos Campeões da Uefa do clube, em 1992, o búlgaro Hristo Stoichkov afirmou nesta sexta-feira em um programa de TV espanhol que o desejo manifestado por L… [+2065 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Uol.com.br"
      },
      "author": "UOL",
      "title": "Família paga fiança e Jacob Blake tem algemas retiradas em hospital - UOL Notícias",
      "description": "Jacob Blake, homem negro baleado várias vezes nas costas por um policial em Kenosha, Wisconsin (Estados Unidos), teve as algemas retiradas na tarde de hoje após sua família pagar fiança de US$ 500 (cerca de R$ 2.733, de acordo com a cotação do dia). Ontem",
      "url": "https://noticias.uol.com.br/internacional/ultimas-noticias/2020/08/28/familia-de-jacob-blake-paga-fianca-e-ele-tem-algemas-retiradas-em-hospital.htm",
      "urlToImage": "https://conteudo.imguol.com.br/c/noticias/db/2020/08/25/24082020---eua-manifestantes-protestam-apos-policiais-atirarem-diversas-vezes-em-jacob-blake-pelas-costas-enquanto-ele-entrava-em-seu-carro-com-criancas-acompanhando-a-cena-1598398132406_v2_615x300.jpg",
      "publishedAt": "2020-08-28T23:52:21Z",
      "content": "Jacob Blake, homem negro baleado várias vezes nas costas por um policial em Kenosha, Wisconsin (Estados Unidos), teve as algemas retiradas na tarde de hoje após sua família pagar fiança de US$ 500 (c… [+1234 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Olhardigital.com.br"
      },
      "author": "Renato  Santino",
      "title": "Elon Musk demonstra implante cerebral da Neuralink com porcos - Olhar Digital",
      "description": "Apresentação voltada para atrair talentos para trabalhar no projeto e dar uma atualização sobre a tecnologia",
      "url": "https://olhardigital.com.br/noticia/elon-musk-demonstra-implante-cerebral-da-neuralink-com-porcos/106082",
      "urlToImage": "https://img.olhardigital.com.br/uploads/acervo_imagens/2020/08/20200828083106.jpg",
      "publishedAt": "2020-08-28T23:08:00Z",
      "content": "Elon Musk demonstrou nesta sexta-feira (28) pela primeira vez a tecnologia da Neuralink, sua iniciativa que visa viabilizar interfaces cérebro-máquina. Nas palavras de Musk, o objetivo da empresa é s… [+2436 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Correiobraziliense.com.br"
      },
      "author": "Correio Braziliense",
      "title": "Confira o resultado da Quina 5352 e da Lotofácil 2023 desta sexta-feira (28/8) - Correio Braziliense",
      "description": "O sorteio é realizado no Espaço Caixa Loterias, no Terminal Rodoviário do Tietê, em São Paulo",
      "url": "https://www.correiobraziliense.com.br/brasil/2020/08/4871874-confira-o-resultado-da-quina-5352-e-da-lotofacil-2023-desta-sexta-feira--28-8.html",
      "urlToImage": "https://midias.correiobraziliense.com.br/_midias/jpg/2020/08/13/675x450/1_cats23-6228313.jpg",
      "publishedAt": "2020-08-28T22:52:00Z",
      "content": "A Caixa Econômica Federal sorteia, na noite desta sexta-feira (28/8), três loterias: os concursos 5352 da Quina; 2023 da Lotofácil e 2104 da Lotomania. O sorteio é realizado no Espaço Caixa Loterias,… [+694 chars]"
    },
    {
      "source": {
        "id": "globo",
        "name": "Globo"
      },
      "author": null,
      "title": "Escalação do Flamengo: Gabigol se diz pronto, e Dome faz mistério sobre time para enfrentar o Santos - globoesporte.com",
      "description": "Atacante fez parte de treino com o grupo nesta sexta-feira, e expectativa é que participe integralmente da atividade de sábado, assim como Rodrigo Caio",
      "url": "https://globoesporte.globo.com/futebol/times/flamengo/noticia/apos-lesao-na-coxa-gabigol-do-flamengo-posta-nas-redes-sociais-pronto.ghtml",
      "urlToImage": "https://s2.glbimg.com/e6w0yN3jwVPw9c0uFzuz7a6VAx8=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2020/n/g/n8DF9QTQuj9A4JOZlZ0Q/50275534197-50ae6151b5-k.jpg",
      "publishedAt": "2020-08-28T21:59:00Z",
      "content": "Se depender de Gabigol, ele vai para o jogo contra o Santos. Após sofrer uma lesão na coxa e passar a semana em recuperação, o atacante do Flamengo usou as redes sociais para dizer que está pronto. \r… [+1126 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Tudocelular.com"
      },
      "author": "TudoCelular.com",
      "title": "Apple encerra conta de desenvolvedor da Epic Games em sua plataforma - Tudocelular.com",
      "description": "Jogadores ainda terão acesso aos jogos já instalados, mas não poderão baixar novas atualizações.",
      "url": "https://www.tudocelular.com/curiosidade/noticias/n162416/apple-encerra-conta-desenvolvedores-epic.html",
      "urlToImage": "https://t2.tudocdn.net/382549?w=1200",
      "publishedAt": "2020-08-28T21:53:47Z",
      "content": "Em meio aos conflitos entre a Apple e a Epic, a fabricante de smartphones finalmente decidiu encerrar a conta de desenvolvedor da produtora de games em suas plataformas. Essa ação aconteceu após a ma… [+1908 chars]"
    },
    {
      "source": {
        "id": "globo",
        "name": "Globo"
      },
      "author": null,
      "title": "Mourão vê 'precipitação' de Salles e diz que operações na Amazônia e no Pantanal vão continuar - G1",
      "description": "Após fala do vice-presidente, ministério divulgou a liberação de recursos anteriormente bloqueados, motivo da anunciada suspensão das ações contra queimadas e desmatamento.",
      "url": "https://g1.globo.com/politica/noticia/2020/08/28/mourao-diz-que-salles-se-precipitou-e-que-operacoes-na-amazonia-e-no-pantanal-vao-continuar.ghtml",
      "urlToImage": "https://s2.glbimg.com/UJF7UyS6plAw6h0wYsfuz2HFOEM=/1200x/smart/filters:cover():strip_icc()/s02.video.glbimg.com/x720/8813821.jpg",
      "publishedAt": "2020-08-28T21:42:00Z",
      "content": "O vice-presidente da República, Hamilton Mourão, que preside o Conselho da Amazônia Legal, afirmou no fim da tarde desta sexta-feira (28) que o ministro do Meio Ambiente, Ricardo Salles, se precipito… [+5017 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Meutimao.com.br"
      },
      "author": "https://www.facebook.com/rodrigovessoni79",
      "title": "Acordo com a Caixa é mais importante que o naming rights (fechando a conta da Arena) - Meu Timão",
      "description": "A diretoria do Corinthians (leia-se Andrés Sanchez) precisará fazer um bom acordo com a Caixa Econômica Federal.",
      "url": "https://www.meutimao.com.br/coluna/rodrigo_vessoni/2244/acordo-com-a-caixa-e-mais-importante-que-o-naming-rights-fechando-a-conta-da-arena/",
      "urlToImage": "https://cdn.meutimao.com.br/_upload/noticia-share/facebook/2020/08/28/na-ponta-do-lapis-rodrigo-vessoni-acordo-com-a-caixa-e_8018b35.jpg",
      "publishedAt": "2020-08-28T21:30:00Z",
      "content": "O valor fechado pelo Corinthians para a venda do naming rights, segundo o site Máquina do Esporte, é de R$ 350 milhões por 20 anos. Isso dá R$ 17,5 milhões/ano.\r\nPois bem.\r\nO valor é bom? Segundo o s… [+1630 chars]"
    },
    {
      "source": {
        "id": "globo",
        "name": "Globo"
      },
      "author": null,
      "title": "Vídeos do capítulo de 'Novo Mundo' de sexta-feira, 28 de agosto de 2020 - gshow",
      "description": "Assista gratuitamente aos vídeos de 'Novo Mundo' de sexta-feira, 28 de agosto de 2020",
      "url": "https://gshow.globo.com/novelas/novo-mundo/capitulo/2020/08/28/videos-do-capitulo-de-novo-mundo-de-sexta-feira-28-de-agosto-de-2020.ghtml",
      "urlToImage": "http://s2.glbimg.com/KortYRy3sWf0g-eN6vtSpRLUcMo=/filters:max_age(3600)/s03.video.glbimg.com/deo/vi/22/37/8813722",
      "publishedAt": "2020-08-28T21:24:00Z",
      "content": ""
    },
    {
      "source": {
        "id": "google-news",
        "name": "Google News"
      },
      "author": null,
      "title": "Auxílio Emergencial: Caixa já pagou R$ 179 bilhões em benefício - Notícias Concursos",
      "description": null,
      "url": "https://news.google.com/__i/rss/rd/articles/CBMidGh0dHBzOi8vbm90aWNpYXNjb25jdXJzb3MuY29tLmJyL2RpcmVpdG9zLXRyYWJhbGhhZG9yL2F1eGlsaW8tZW1lcmdlbmNpYWwtY2FpeGEtamEtcGFnb3Utci0xNzktYmlsaG9lcy1lbS1iZW5lZmljaW8v0gEA?oc=5",
      "urlToImage": null,
      "publishedAt": "2020-08-28T21:13:00Z",
      "content": null
    },
    {
      "source": {
        "id": "globo",
        "name": "Globo"
      },
      "author": null,
      "title": "Responsável por batismo de Bolsonaro, pastor Everaldo foi de ‘homem de Deus’ a preso por corrupção e lavagem - Valor Econômico",
      "description": "",
      "url": "https://valor.globo.com/politica/noticia/2020/08/28/responsavel-por-batismo-de-bolsonaro-pastor-everaldo-foi-de-homem-de-deus-a-preso-por-corrupcao-e-lavagem.ghtml",
      "urlToImage": "https://s2.glbimg.com/qps9Fab-Xz1V-Ns-3rw3oFL7A-Q=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_63b422c2caee4269b8b34177e8876b93/internal_photos/bs/2019/p/X/MJJjvNRoGAA5ytx30QIw/foto30esp-101-bolsona-a12.jpg",
      "publishedAt": "2020-08-28T20:54:00Z",
      "content": "Eu sou um homem de Deus, disse Everaldo Dias, o pastor Everaldo, ao lançar sua candidatura à Presidência em 2014 pelo Partido Social Cristão (PSC). Hoje está montada uma lógica para se servir do Esta… [+288 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Uol.com.br"
      },
      "author": "UOL",
      "title": "'Vai ter uma enxurrada de crédito até o fim do ano', diz Guedes - UOL Economia",
      "description": "O ministro da Economia, Paulo Guedes, disse hoje que o governo está \"ultimando\" uma série de medidas de crédito para dar apoio a empresas para enfrentar a pandemia do novo coronavírus. \"Vai ter uma enxurrada de crédito até o fim do ano. O dinheiro finalme",
      "url": "https://economia.uol.com.br/noticias/estadao-conteudo/2020/08/28/vai-ter-uma-enxurrada-de-credito-ate-o-fim-do-ano-diz-guedes.htm",
      "urlToImage": "https://conteudo.imguol.com.br/c/noticias/07/2020/08/26/o-ministro-da-economia-paulo-guedes-apos-audiencia-sobre-limites-de-gastos-publicos-1598481710873_v2_615x300.jpg",
      "publishedAt": "2020-08-28T20:46:00Z",
      "content": "O ministro da Economia, Paulo Guedes, disse hoje que o governo está \"ultimando\" uma série de medidas de crédito para dar apoio a empresas para enfrentar a pandemia do novo coronavírus. \"Vai ter uma e… [+1536 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "Uol.com.br"
      },
      "author": "UOL",
      "title": "Wesley Safadão está com covid-19 e adia live do fim de semana - UOL Entretenimento",
      "description": "Wesley Safadão está com covid-19. A informação foi confirmada pela assessoria de imprensa do cantor.De acordo com comunicado, o músico passa bem e está assintomático. Ele ainda passará por uma contra prova do exame em Fortaleza.Por conta do resultado, a l",
      "url": "https://entretenimento.uol.com.br/noticias/redacao/2020/08/28/wesley-safadao-esta-com-covid-19-e-adia-live-do-fim-de-semana.htm",
      "urlToImage": "https://conteudo.imguol.com.br/c/entretenimento/a4/2020/08/28/wesley-safadao-esta-assintomatico-1598646042842_v2_615x300.jpg",
      "publishedAt": "2020-08-28T20:26:15Z",
      "content": "Wesley Safadão está com covid-19. A informação foi confirmada pela assessoria de imprensa do cantor.\r\nDe acordo com comunicado, o músico passa bem e está assintomático. Ele ainda passará por uma cont… [+650 chars]"
    },
    {
      "source": {
        "id": "globo",
        "name": "Globo"
      },
      "author": null,
      "title": "Ibovespa fecha semana no positivo, apesar de dias de tensão - Valor Econômico",
      "description": "",
      "url": "https://valor.globo.com/financas/noticia/2020/08/28/ibovespa-fecha-semana-no-positivo-apesar-de-dias-de-tensao.ghtml",
      "urlToImage": "https://s2.glbimg.com/M-q07DMSJX1FvSsSHAQwP97pScw=/1200x/smart/filters:cover():strip_icc()/s01.video.glbimg.com/x720/8813780.jpg",
      "publishedAt": "2020-08-28T20:01:00Z",
      "content": "Mesmo depois de dias de tensão com incertezas sobre os rumos das contas públicas, o Ibovespa encontrou espaço no exterior e, em menor grau, no noticiário político para terminar a semana em tom positi… [+2886 chars]"
    },
    {
      "source": {
        "id": "globo",
        "name": "Globo"
      },
      "author": null,
      "title": "Milhares de pessoas se reúnem em Washington para marcha contra a violência policial nos EUA - G1",
      "description": "Famílias de americanos negros mortos ou que levaram tiros de policiais discursaram; manifestação acontecem em meio a cinco noites de protestos em Kenosha após Jacob Blake ser alvejado pela polícia.",
      "url": "https://g1.globo.com/mundo/noticia/2020/08/28/milhares-de-pessoas-se-reunem-em-washington-para-marcha-contra-a-violencia-policial-nos-eua.ghtml",
      "urlToImage": "https://s2.glbimg.com/BKIQwOKle-8NW0qHKidHYJ_qG_I=/1200x/smart/filters:cover():strip_icc()/s01.video.glbimg.com/x720/8813192.jpg",
      "publishedAt": "2020-08-28T19:28:00Z",
      "content": "Milhares de pessoas se reuniram nesta sexta-feira (28) em Washington para uma grande marcha contra o racismo, no aniversário da marcha de 1963, quando o líder dos direitos civis Martin Luther King Jr… [+4076 chars]"
    },
    {
      "source": {
        "id": "globo",
        "name": "Globo"
      },
      "author": null,
      "title": "Luísa Sonza conta que testou positivo para a Covid-19: 'Isolamento total na minha casinha' - gshow",
      "description": "Cantora tranquilizou os fãs em uma sequência de vídeos em sua rede social: 'Estou assintomática, não sinto nada'",
      "url": "https://gshow.globo.com/Famosos/noticia/luisa-sonza-conta-que-testou-positivo-para-a-covid-19-isolamento-total-na-minha-casinha.ghtml",
      "urlToImage": "https://s2.glbimg.com/MZPcwGZDype_pImVfMFS_IVWy6E=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_e84042ef78cb4708aeebdf1c68c6cbd6/internal_photos/bs/2020/0/F/G4ysTjRPeczwZH7GZClw/luisa-sonza.jpeg",
      "publishedAt": "2020-08-28T19:20:00Z",
      "content": "Luísa Sonza usou suas redes sociais, na tarde desta sexta-feira, 28/8, para comunicar que testou positivo para a Covid-19. Em uma sequência de vídeos, a cantora contou que iria gravar um clipe hoje e… [+2150 chars]"
    },
    {
      "source": {
        "id": "globo",
        "name": "Globo"
      },
      "author": null,
      "title": "Aulas presenciais infantis, cinemas e teatros são liberados na Grande Fortaleza em setembro - G1",
      "description": "O anúncio foi feito em transmissão ao vivo pelo governador Camilo Santana e pelo prefeito Roberto Cláudio",
      "url": "https://g1.globo.com/ce/ceara/noticia/2020/08/28/creches-e-pre-escolas-voltam-a-funcionar-presencialmente-na-grande-fortaleza-nesta-terca-feira-1o.ghtml",
      "urlToImage": "https://s2.glbimg.com/b_-I5W_pbLvldBtP88WlXG_Pb0Y=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2020/I/x/nBHq5kTIqW2uJy6MPmOA/creches-voltam.jpg",
      "publishedAt": "2020-08-28T19:18:00Z",
      "content": "As creches e pré-escolas particulares de Fortaleza estarão autorizadas a voltar a funcionar presencialmente a partir desta terça-feira (1º). O anúncio foi feito na tarde desta sexta-feira (28), em tr… [+3692 chars]"
    },
    {
      "source": {
        "id": "globo",
        "name": "Globo"
      },
      "author": null,
      "title": "Moraes revoga decisão de Toffoli e mantém rito do impeachment de Witzel na Alerj - G1",
      "description": "Presidente do STF tinha mandado Assembleia Legislativa do Rio refazer comissão. Moraes, que é relator do caso no Supremo, derrubou determinação nesta sexta.",
      "url": "https://g1.globo.com/politica/noticia/2020/08/28/moraes-revoga-decisao-de-toffoli-e-mantem-rito-do-impeachment-de-witzel.ghtml",
      "urlToImage": "https://s2.glbimg.com/uoHeDIakC4KszPQK3Jzu8L2i5hs=/1200x/smart/filters:cover():strip_icc()/s03.video.glbimg.com/x720/8813314.jpg",
      "publishedAt": "2020-08-28T19:13:00Z",
      "content": "Moraes, que é relator do processo, revogou uma decisão do presidente do STF, Dias Toffoli, tomada durante o recesso do Judiciário, em julho. Toffoli havia determinado que a Assembleia Legislativa do … [+3516 chars]"
    },
    {
      "source": {
        "id": null,
        "name": "BBC News"
      },
      "author": "https://www.facebook.com/bbcnews",
      "title": "Caso Flordelis: como deputada conseguiu 'adotar' mais de 50 filhos? - BBC News Brasil",
      "description": "Processo de adoção normalmente demora no mínimo um ano e pais candidatos podem ficar anos na fila do cadastro; parte filhos da deputada - denunciada à Justiça como mentora do assassinato do marido - na verdade estão sob seus cuidados em situação irregular.",
      "url": "https://www.bbc.com/portuguese/brasil-53953982",
      "urlToImage": "https://ichef.bbci.co.uk/news/1024/branded_portuguese/BB9A/production/_114162084_novaedit.png",
      "publishedAt": "2020-08-28T19:09:01Z",
      "content": "Direito de imagemDivulgaçãoImage caption\r\n Como deputada, a desburocratização da adoção sempre foi uma bandeira de Flordelis\r\nEntre os muitos detalhes que chamam a atenção na investigação sobre o ass… [+17087 chars]"
    }
  ]
}
```

#### The ONE API

URI: https://the-one-api.dev/v2/chapter

HTTP Request Header

```
> GET /v2/chapter?limit=10 HTTP/1.1
> Host: the-one-api.dev
> User-Agent: curl/7.70.0
> Accept: */*
> Authorization: Bearer 9RK8sDOwUb_UQOo4aEUO
> 
* TLSv1.3 (IN), TLS handshake, Newsession Ticket (4):
* TLSv1.3 (IN), TLS handshake, Newsession Ticket (4):
* old SSL session ID is stale, removing
* Mark bundle as not supporting multiuse
```

HTTP Response Header

```
< HTTP/1.1 200 OK
< Date: Sat, 29 Aug 2020 04:03:52 GMT
< Server: Apache/2.4.41 (Ubuntu)
< Content-Security-Policy: default-src 'self';base-uri 'self';block-all-mixed-content;font-src 'self' https: data:;frame-ancestors 'self';img-src 'self' data:;object-src 'none';script-src 'self';script-src-attr 'none';style-src 'self' https: 'unsafe-inline';upgrade-insecure-requests
< X-DNS-Prefetch-Control: off
< Expect-CT: max-age=0
< X-Frame-Options: SAMEORIGIN
< Strict-Transport-Security: max-age=15552000; includeSubDomains
< X-Download-Options: noopen
< X-Content-Type-Options: nosniff
< X-Permitted-Cross-Domain-Policies: none
< Referrer-Policy: no-referrer
< X-XSS-Protection: 0
< Access-Control-Allow-Origin: *
< X-RateLimit-Limit: 100
< X-RateLimit-Remaining: 96
< X-RateLimit-Reset: 1598674365
< Content-Type: application/json; charset=utf-8
< Content-Length: 1150
< ETag: W/"47e-VxZgzAi8YIRVbFOgBT+EJbJBKMU"
< 
```

Content

```json
{
    "docs": [
        {
            "_id": "5cdc25d4bc17e929cf2461eb",
            "chapterName": " A Long-expected Party ",
            "book": "5cf5805fb53e011a64671582"
        },
        {
            "_id": "5cdc25d4bc17e929cf2461ec",
            "chapterName": " The Shadow of the Past ",
            "book": "5cf5805fb53e011a64671582"
        },
        {
            "_id": "5cdc25d4bc17e929cf2461ed",
            "chapterName": " Three is Company ",
            "book": "5cf5805fb53e011a64671582"
        },
        {
            "_id": "5cdc25d4bc17e929cf2461ee",
            "chapterName": " A Short Cut to Mushrooms ",
            "book": "5cf5805fb53e011a64671582"
        },
        {
            "_id": "5cdc25d4bc17e929cf2461ef",
            "chapterName": " In the House of Tom Bombadil ",
            "book": "5cf5805fb53e011a64671582"
        },
        {
            "_id": "5cdc25d4bc17e929cf2461f0",
            "chapterName": " The Old Forest ",
            "book": "5cf5805fb53e011a64671582"
        },
        {
            "_id": "5cdc25d4bc17e929cf2461f1",
            "chapterName": " A Conspiracy Unmasked ",
            "book": "5cf5805fb53e011a64671582"
        },
        {
            "_id": "5cdc25d5bc17e929cf2461f2",
            "chapterName": " At the Sign of The Prancing Pony ",
            "book": "5cf5805fb53e011a64671582"
        },
        {
            "_id": "5cdc25d5bc17e929cf2461f3",
            "chapterName": " Fog on the Barrow-Downs ",
            "book": "5cf5805fb53e011a64671582"
        },
        {
            "_id": "5cdc25d5bc17e929cf2461f4",
            "chapterName": " Strider ",
            "book": "5cf5805fb53e011a64671582"
        }
    ],
    "total": 62,
    "limit": 10,
    "offset": 0,
    "page": 1,
    "pages": 7
}
```

