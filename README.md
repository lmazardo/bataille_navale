[![Build Status](https://travis-ci.org/lmazardo/bataille_navale.svg?branch=master)](https://travis-ci.org/lmazardo/bataille_navale)


Git
====
Quelques pointeurs sur GIT :
 * [git - petit guide] (http://rogerdudler.github.io/git-guide/index.fr.html)
 * [livre progit fr v1] (http://git-scm.com/book/fr/v1)
 * [livre progit fr v2] (http://git-scm.com/book/en/v2)
 * [Schéma qui montre comment fonctionne le add/commit/push/pull/fetch] (http://assets.osteele.com/images/2008/git-transport.png)

Initialiser un projet GIT à partir d'une arborescence existante.
----------------------------------------------------------------
```
  git init                 # initialisation d'un dépot vide
  git add --verbose --all  # ajout de tous les fichiers (à l'index)
  git commit -m "initial import" # validation de la mise à l'index des fichiers
```

Maven
=====
Utilisation du plugin *maven-jar-plugin* afin de créer un exécutable (jar)

