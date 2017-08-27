(ns grokking_algorithms_cljs.chap6)

(def graph (atom {:you [:alice :bob :claire]
                  :bob [:anuj :peggy]
                  :alice [:peggy]
                  :claire [:thom :jonny]
                  :peggy []
                  :thom []
                  :jonny []}))

(defn person-is-seller?
  [person]
  (if (= (last (name person)) \m)
    true
    false))

(defn search
  ([name]
   (let [search_queue (apply conj #queue [] (name @graph))
         searched #{}]
     (search name search_queue searched)))
  ([name search_queue searched]
   (if (empty? search_queue)
     false
     (let [person (peek search_queue)]
       (if (contains? searched person)
         (search name
                 (apply conj (pop search_queue) (person @graph))
                 (conj searched person))
         (if (person-is-seller? person)
           (do
             (println person " is a mango seller!")
             true)
           (search name
                   (apply conj (pop search_queue) (person @graph))
                   (conj searched person))))))))
