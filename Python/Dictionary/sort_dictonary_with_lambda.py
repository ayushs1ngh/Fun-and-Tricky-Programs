
# sorting dictonary items with lambda
import pprint
 
pretty = pprint.PrettyPrinter(width=30)
# Create dictionaries
lis = [{ "Country" : " Afghanistan", "IndependenceYear" : 1919}, 
{ "Country" : "Albania", "IndependenceYear" : 1912 },
{ "Country" : "Algeria" , "IndependenceYear" : 1962 }]
 
print ("-------------------------------------")
print( "Sorted by : Independence Year -> ")
pretty.pprint(sorted(lis, key = lambda i: i['IndependenceYear']))
print ("-------------------------------------")
print ("Sorted by : independence year and country name-> ")
pretty.pprint(sorted(lis, key = lambda i: (i['IndependenceYear'], i['Country'])))
print ("-------------------------------------")
print("Sorted by : independence year, descending order ->")
pretty.pprint(sorted(lis, key = lambda i: i['IndependenceYear'],reverse=True))
print ("-------------------------------------")
