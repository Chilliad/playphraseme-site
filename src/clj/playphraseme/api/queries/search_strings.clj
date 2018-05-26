(ns playphraseme.api.queries.search-strings
  (:require [playphraseme.api.general-functions.doc-id :refer :all]
            [playphraseme.db.phrases-db :refer :all]))

(def coll "searchStrings")

(defn get-search-string-by-id
  [^String search-string-id]
  (stringify-id
   (get-doc-by-id coll (str->id search-string-id))))

(defn insert-search-string!
  [{:keys [email name password refresh-token] :as user-data}]
  (stringify-id
   (add-doc coll user-data)))

(defn update-search-string!
  [^String search-string-id {:keys [email name password refresh-token] :as user-data}]
  (update-doc-by-id coll (str->id search-string-id) user-data))

(defn delete-search-string!
  [^String search-string-id]
  (delete-doc-by-id coll (str->id search-string-id)))

