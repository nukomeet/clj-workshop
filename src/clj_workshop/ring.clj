;; Clojure Workshop in POZnan*

;; Ring is a low-level interface and library for building web applications in
;; Clojure. It is similar to the Ruby Rack library, the WSGI in Python, or the
;; Java Servlet specification.

(ns clj-workshop.ring
  (:require [ring.adapter.jetty :as jetty]
            [ring.util.response :refer :all]))

;; A web application developed for Ring consists of four components: Handler,
;; Request, Response and Middleware

;; Handlers are functions that define your web application. They take one
;; argument, a map representing a HTTP request, and return a map representing
;; the HTTP response.

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World"})

;; You can create Ring response maps manually, but the ring.util.response
;; namespace contains a number of useful functions to make this task easier.

(response "Hello World")

(-> (response "Hello World")
    (content-type "text/plain"))

;; Middleware are higher-level functions that add additional functionality to
;; handlers. The first argument of a middleware function should be a handler,
;; and its return value should be a new handler function.

(defn wrap-token [handler token]
  (fn [request]
    (let [response (handler request)]
      (assoc-in response [:headers "Auth-Token"] token))))

(def app
  (-> handler
      (wrap-token "123456")))

(jetty/run-jetty app {:port 3000})

