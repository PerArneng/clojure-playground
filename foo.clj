#!/usr/bin/env -S clj -Sdeps '{:deps {org.clojure/math.combinatorics {:mvn/version "0.1.6"}}}' -M
; Explanation for the shebang:
;   env -S  Allow multiple arguments to be passed to the following command
;   -Sdeps  Specify deps in EDN format
;   -M      Run the program as a "main" function

(ns foo
  (:use [clojure.math.combinatorics :only (permutations)]))

(dorun
  (map #(println (apply str %))
       (permutations "abcde")))

(defn -main [& args])


