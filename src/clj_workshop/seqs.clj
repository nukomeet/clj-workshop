;; Clojure Workshop in POZnan*

(ns clj-workshop.seqs)

;; Sequences
;; ============================================================================

(range 10)

(range 5 20)

(range 4 100 8)

;; Clojure data structures provide a uniform interface. All Clojure collections
;; satisfy the ISeqable protocol.

;; Map / Filter / Reduce
;; ----------------------------------------------------------------------------

(map inc [0 1 2 3 4 5 6 7 8 9])

(filter even? (range 10))

(filter odd? (range 10))

(remove odd? (range 10))

(map #(+ % % 2) (filter even? (range 20)))

(reduce + (range 100))

(reduce * (range 1 20))

;; List comprehensions
;; ----------------------------------------------------------------------------

;; Clojure supports the list comprehensions. They may be sometimes more readable
;; than a chain of `map` and `filter` operations.

(for [x (range 5 10)
      y (range 5 10)]
  [x y])

(for [x (range 1 10)
      y (range 1 10)
      :when (and (zero? (rem x y))
                 (even? (quot x y)))]
  [x y])

(for [x (range 1 10)
      y (range 1 10)
      :let [prod (* x y)]]
  [x y prod])


;; The Clojure Standard Library
;; ----------------------------------------------------------------------------

(apply str (interpose ", " ["Bob" "Mary" "George"]))


(take 5 (repeat 3))

(take 5 (range 4 20))

(take 7 (interleave (repeat "foo") (range 10)))

(take 10 (cycle ["red" "white" "blue"]))

(partition 2 [:a 1 :b 2 :c 3 :d 4 :e 5])

(partition 2 1 [:a 1 :b 2 :c 3 :d 4 :e 5])

(take-while #(< % 5) (range 10))

(drop-while #(< % 5) (range 10))
