(ns grokking_algorithms_cljs.test-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [grokking_algorithms_cljs.chap1-test]
            [grokking_algorithms_cljs.chap2-test]
            [grokking_algorithms_cljs.chap3-test]))

(enable-console-print!)

(doo-tests 'grokking_algorithms_cljs.chap1-test
           'grokking_algorithms_cljs.chap2-test
           'grokking_algorithms_cljs.chap3-test)
