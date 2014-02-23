;; Clojure Workshop in POZnan*

;; Basics
;; ============================================================================

;; You can evaluate all the forms in this file by placing the cursor after the
;; form and typing Command-ENTER.

;; The first eval will take several seconds. Light Table needs to create a
;; connection to a REPL.

;; The result of each eval will appear right next to the form.

;; You can get a documentation for each element. Just right-click on it and
;; choose `Show docs`.

;; Declaring a namespaces
;; ----------------------------------------------------------------------------

;; Clojure supports modularity via namespaces. They allow you to group
;; logical definitions together.

(ns clj-workshop.basics
  (:require [clojure.string :as s]))

;; :require allows you to import functionality from a different namespace into
;; the current one.

;; We could write the following:

(clojure.string/blank? "")

;; since we also gave an alias s to imported namespace using :as, let's use the
;; more succint clojure

(s/blank? "")

;; Using functions
;; ----------------------------------------------------------------------------

;; We put the name of function first on the list, followed by number of its
;; arguments.

(str "Hello, " "welcome at " "Clojure Workshop in POZnan*")

(println "Hello again!")

;; Definitions
;; ----------------------------------------------------------------------------

;; You can create a definition using `def`. It binds the name with the namespace
;; it is defined in. This is called top level definition.

(def x 4)

x

;; You can also create a local definition with `let`

(let [x 22]
  (+ 1 x))

x

;; Literal data types
;; ----------------------------------------------------------------------------

;; Clojure comes out of the box with the usual useful data literals. These are
;; in several cases java literals. Here are some examples.

;; Booleans

(def a-boolean true)
(class a-boolean)

;; Strings

(def a-string "Hello!")
(class a-string)

;; Regular Expressions

(def a-regexp #"\d{3}-?\d{3}-?\d{4}")
(class a-regexp)

;; Numbers (Integer)

(def a-number 1)
(class a-number)

;; Numbers (Float)

(def another-number 1.0)
(class another-number)

;; Keywords

(def a-keyword :a)
(class a-keyword)

;; Keywords are an example of a clojure literal.
