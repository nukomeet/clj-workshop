;; Clojure Workshop in POZnan*

(ns clj-workshop.func)

;; Functions are the essence of any Clojure program

(defn foo [a b c]
  (+ a b c))

(foo 1 2 3)

;; Functions can have multiple arities.

(defn foo2
  ([a b] (+ a b))
  ([a b c] (* a b c)))

(foo2 3 4)
(foo2 3 4 5)

;; Function literals
;; ----------------------------------------------------------------------------

((fn [] (str "A function")))

(#(str "A function"))

;; You can use the % and %N placeholders to represent function arguments.

((fn [x] (str "One argument: " x)) 1)

(#(str "One argument: " %) 1)

;; With two arguments.

((fn [x y] (str "Two arguments: " x " and " y)) 3 4)

(#(str "Two arguments: " %1 " and " %2) 3 4)


;; You can apply functions.

(apply + [1 2 3 4 5])

;; This is the same as.

(+ 1 2 3 4 5)

;; if
;; ----------------------------------------------------------------------------

(if 0
  "Zero is not false-y"
  "Yuck")

;; Nor is the empty string.

(if ""
  "An empty string is not false-y"
  "Yuck")

;; the empty vector

(if []
  "An empty vector is not false-y"
  "Yuck")

;; the empty list

(if ()
  "An empty list is not false-y"
  "Yuck")

;; the empty map

(if {}
  "An empty map is not false-y"
  "Yuck")

;; the empty set

(if #{}
  "An empty set is not false-y"
  "Yuck")

;; cond
;; ----------------------------------------------------------------------------

;; Nesting `if` tends to be noisy and hard to read so Clojure
;; provides a `cond` macro to deal with this.

(cond
  nil "Not going to return this"
  false "Nope not going to return this either"
  :else "Default case")

