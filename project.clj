(defproject zilch "0.1.0-SNAPSHOT"
  :description "Conch: A Clojure 0MQ Messaging Library"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.zeromq/jzmq "2.0.9"]]
  :dev-dependencies [[swank-clojure "1.2.1"]]
  :native-path "/usr/local/lib:/opt/local/lib:/usr/lib"
  :namespaces [zilch.mq
               zilch.test.mq])
