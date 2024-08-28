import re
import copy
import sys

import pyang
from pyang import plugin
from pyang import syntax
from pyang import grammar
from pyang import error
from pyang import statements


ericssonYang = 'ericsson-yang-extensions'



def pyang_plugin_init():
 
    # register the name of the YANG module where the extensions are defined
    grammar.register_extension_module(ericssonYang)

    # register grammar rules for all our extension statements
    for (stmt, occurance, (arg, rules), add_to_stmts) in ericssonYang_stmts:
        grammar.add_stmt((ericssonYang, stmt), (arg, rules))
        grammar.add_to_stmts_rules(add_to_stmts, [((ericssonYang, stmt), occurance)])

    statements.add_data_keyword((ericssonYang, 'action'))
    statements.add_keyword_with_children((ericssonYang, 'action'))
    statements.add_keywords_with_no_explicit_config((ericssonYang, 'action'))
 #   print >> sys.stderr, ericssonYang

ericssonYang_stmts = [

    ('use-in', '*', ('string', []),  ['extension']),

    ('substatement', '*', ('string', []), ['extension']),

    ('arg-type', '?', (None, [('type', '1'), ('default', '?')]),  ['argument']),

   
    ('action', '*',
     ('identifier', [('description', '?'),
                     ('input', '?'),
                     ('output', '?')]),
     ['list', 'container', 'grouping', 'augment']),

    ('restricted', '*', (None, []),  ['leaf', 'leaf-list', 'container']),

    ('non-unique-leaf-list', '*', (None, []),  ['leaf-list']),

    ('keyless-config-list', '*', (None, []),  ['list']),

    ('organization', '*', ('string', []),  ['revision']),

    ('release', '*', ('string', []),  ['revision']),

    ('version', '*', ('string', []),  ['revision']),
 
     ('docNo', '*', ('string', []),  ['revision']),

    ('revision', '*', ('string', []),  ['revision']),
    
    ('specification', '*', ('string', []),  ['revision']),

    ('contact', '*', ('string', []),  ['revision']),

    ('author', '*', ('string', []),  ['revision']),

    ('correction', '*', ('string', []),  ['revision']),

    ('revision', '*', 
	('string', [('description', '?'),
                     ('organization', '?'),
                     ('author', '?'),
                     ('contact', '?'),
                     ('correction', '?'),
                     ('docNo', '?'),
                     ('revision', '?'),
                      ('version', '?'),
                     ('specification', '?'),
                     ('release', '?')]),
	['extension', 'revision']),
                      
                      
]
    

