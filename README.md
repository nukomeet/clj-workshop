# Clojure Workshop

## Requirements

1. Bring your own laptop, preferably with Linux or OSX operating system.
2. Install [LightTable][5].

## Goal

To build a web application in Clojure.

## Pre

### Leiningen

Leiningen project automation tool for Clojure. It’s similar to Maven or Bundler.

Download the [lein][1] script. Place it on your `$PATH` where your shell can find it (eg. `~/bin`). Set it to be executable.

    chmod a+x ~/bin/lein

Generate a new project skeleton using optional TEMPLATE

    lein new [TEMPLATE] NAME

> Let's review the directory structure

Launch an interactive REPL session

    lein repl

Run tests

    lein test


### REPL

Start REPL

    lein repl

Play with Clojure REPL.

    (+ 1 4)
    (println "Hello, World")

### Lighttable

LightTable is a general purpose IDE, written entirely in ClojureScript by [Chris Granger][6].

1. Create a default project with Leiningen

    lein new zoo

2. Add it to Leiningen using `View->Workspace` option (check its key binding).

3. Open `src/zoo/core.clj` using Navigator: `View->Navigator` option (check its key binding).

4. Evaluate code in `src/zoo/core.clj`

5. Run the function `zoo` and check results in the console, `View->Console` option (check its key binding).

6. Get familiar with Commands, `View->Commands` option (check its key binding). As an example, create a tabset.

7. Adjust Lighttable to your needs. Open `user.behaviours`, change the theme and the font size (check its autocomplete feature).


## Part 1 - Clojure 101

### [Basic constructs](src/clj_workshop/basics.clj)
### [Data structures](src/clj_workshop/data.clj)
### [Functional programming](src/clj_workshop/func.clj)
### [Collections](src/clj_workshop/seqs.clj)

## Part 2 - Web Programming in Clojure

### [Ring](src/clj_workshop/ring.clj)

### Compojure

> Compojure is a small routing library for Ring that allows web applications to be composed of small, independent parts.

Create a new project using the `compojure` template.

    lein new compojure zoo

Let's analyze the project structure.

Let's pass in query arguments

    (GET "/:id" [id]
      (str "<h1>Hello " id "</h1>"))

### Basic RESTful API

Create a new project using the `atw-api` template.

    lein new atw-api zoo-api

Let's analyze the project structure.

### [Om with Facebook React][9]

## Part 3 - Custom Project

An external API integration e.g. Github, Instagram etc. No auth.

## References

* [Clojure Cheatsheet][7]
* [Clojure Doc][8]
* [Clojure Koans][2]
* [LightTable Clojure Tutorial][3]
* [Light Table ClojureScript Tutorial][4]


[1]: https://raw.github.com/technomancy/leiningen/stable/bin/lein
[2]: http://clojurekoans.com/
[3]: https://github.com/mynomoto/lt-clojure-tutorial
[4]: https://github.com/swannodette/lt-cljs-tutorial
[5]: http://lighttable.com
[6]: http://www.chris-granger.com/
[7]: http://clojure.org/cheatsheet
[8]: http://clojure-doc.org/
[9]: http://zaiste.net/2014/02/web_applications_in_clojure_all_the_way_with_compojure_and_om/

2014 Nukomeet
