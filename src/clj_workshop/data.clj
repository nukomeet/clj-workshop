;; Clojure Workshop in POZnan*

(ns clj-workshop.data)

;; Data structures
;; ============================================================================

;; Vectors
;; ----------------------------------------------------------------------------

;; Vectosrs support efficient random access, efficient update and efficient
;; addition to the end.

(def a-vector [1 2 3 4 5])

;; We can get the length of a vector (in constant time) via `count`.

(count a-vector)

;; We can add an element to the end.

(def another-vector (conj a-vector 6))

;; Note this does not mutate the array! `a-vector` will be left
;; unchanged.

a-vector

another-vector

;; We can access any element in a vector with `nth`. The following
;; will return the second element.

(nth a-vector 3)

(nth ["foo" "bar" "baz"] 1)

;; Vectors can be treated as functions.

(a-vector 1)

(["foo" "bar" "baz"] 1)

;; Maps
;; ----------------------------------------------------------------------------

;; In idiomatic Clojure keys are represented by keywords.

(def a-map {:one "This is one" :two "This is two"})

;; We can get the number of key-value pairs in constant time.

(count a-map)

;; We can access a particular value for a key with `get`.

(get a-map :one)

;; and return an alternative value when the key is not present

(get a-map :bar :not-found)

;; We can add a new key-value pair with `assoc`.

(def another-map (assoc a-map :three "This is three"))

;; Again a-map is unchanged!

a-map

another-map

;; We can remove a key-value pair with `dissoc`.

(dissoc a-map :one)

;; Again a-map is unchanged!

a-map

;; Like vectors, maps can act like functions.

(a-map :one)

;; However Clojure keywords themselves can act like functions and the
;; following is more idiomatic.

(:one a-map)

;; We can check if a map contains a key, with `contains?`.

(contains? a-map :one)

;; We can get all the keys in a map with `keys`.

(keys a-map)

;; and all of the values with `vals`.

(vals a-map)

;; Maps can be nested

(def a-nested-map {:customer-id 696
                   :settings {:nickname "Zaiste"
                              :avatar "http://1.gravatar.com/avatar/fd1e763bc15ec2542c97b2b99bef92a5"}})

;; and navigate its keys to get the nested value you're interested in

(get-in a-nested-map [:settings :nickname])

;; Clojure maps support complex keys.

(def complex-map {[1 2] :one-two [3 4] :three-four})

(get complex-map [3 4] :not-found)

;; Sets
;; ----------------------------------------------------------------------------

(def a-set #{:cat :dog :bird})

;; `:cat` is already in `a-set`, so it will be unchanged.

(conj a-set :cat)

;; But `:zebra` isn't.

(conj a-set :zebra)

;; `conj` is a "polymorphic" function that adds an item to a collection.

;; `contains?` works on sets just like it does on maps.

(contains? a-set :cat)

;; Like vectors and maps, sets can also act as functions. If the argument
;; exists in the set it will be returned, otherwise the set will return nil.

(#{:cat :dog :bird} :cat)

;; This is powerful when combined with conditionals.

(defn check [x]
  (if (#{:cat :dog :bird} x)
    :valid
    :invalid))

(check :cat)
(check :zebra)

;; Lists
;; ----------------------------------------------------------------------------

;; A less common Clojure data structure is lists.

(def a-list '(:foo :bar :baz))

(conj a-list :front)

;; and lists are immutable as well

a-list

;; You can get the first element of a list

(first a-list)

;; or the tail of a list

(rest a-list)

(def another-list (conj a-list :front))

another-list

a-list

(identical? (rest another-list) a-list)

;; `identical?` checks whether two things are represented by the same
