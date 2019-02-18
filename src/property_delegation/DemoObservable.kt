package property_delegation

import kotlin.properties.Delegates
/*
* This “observable” delegate is useful for cases such as databinding and reactive programming
* */
class DemoObservable {
    var name: String by Delegates.observable("Initial Value") { property, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }
}