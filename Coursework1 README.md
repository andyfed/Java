# Java
Coursework by discipline "Software development technologies"

Simulator of normal Markov algorithms - implements the processing of a text string (processed string) according to a set of rules.
The number of rules is arbitrary, the rules are ordered.
Each rule defines a text substitution and consists of two lines.

The first (left) line defines the substring to replace.
The second (right) line specifies which line it is replaced with.

Execution occurs until inapplicability, i.e. the moment when there is no substring in the processed string that matches one of the strings from the left parts of the rules.
The application of the rule is
• searching for the occurrence of its left side in the processed string
and
• replacing the corresponding substring with the right side of the rule.
If there are several such occurrences, then only the first occurrence is replaced. If there are no entries, then the rule is not applicable.
The rules are applied as follows.
Take the first rule and try to apply it.
If not applicable, the next rule is taken. And this happens either until the exit is inapplicable, or until the first applicable rule.
After the applicable rule is triggered, everything starts over from the first rule.

Example:

The processed string:
AAAAEEabbbb

Rules:
AE -> ggg
A -> b
bg -> X

The intermediate and final results will be as follows:
1. AAAgggEabbbb
2.bAAgggEabbbb
3.bbAgggEabbbb
4.bbbgggEabbbb
5.bbXggEabbbb

In its minimal form, a simulator is a utility that takes as parameters the name of the input file with the source string, the name of the output file with the resulting string, and the name of the file with the rules. Utility
1) reads input parameters and checks their correctness,
2) opens the source file and the file with rules, handling possible error situations,
3) searches for and applies substitutions,
4) writes the result to the resulting file and exits.

The set of rules, the syntax of their recording and the type of the source line are chosen at their own discretion.

For task 4, the X axis is the size of the input file with the line being processed. All measurements must be carried out with one set of rules.
