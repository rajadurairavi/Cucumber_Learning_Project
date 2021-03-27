@BackgoundExamples
Feature: Background feature
Background:
Given Student should join school first
Given Student should pass elementry school

Scenario: Doctor scenario
Given Student has to complete SSLC
When Student has to complete Twelth
Then Student should join Medical college

Scenario: Enginner scenario
Given Student has to complete highschool
When Student has to complete Higher secondry
Then Student should join Engineering college

#   ***** Hooks will get execute first before Background methos ***