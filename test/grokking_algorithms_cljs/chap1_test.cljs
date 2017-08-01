(ns grokking_algorithms_cljs.chap1-test
  (:require [cljs.test :refer-macros [deftest is]]
            [grokking_algorithms_cljs.chap1 :refer [binary-search]]))

(deftest return-index-if-found
  (is (= 1 (binary-search [1 3 5 7] 3)))
  (is (= 0 (binary-search [1 3 5 7] 1)))
  (is (= 3 (binary-search [1 3 5 7] 7))))

(deftest return-nil-if-not-found
  (is (= nil (binary-search [1 3 5 7] 2))))
