@DataTable
Feature: Data table

  @PrintScenarioInformation
  Scenario: Single cell, to string
    Given single cell, to string
    | test |

  Scenario: Single column, to list
    Given single column, to list
    | abc |
    | xyz |
    | 123 |

  # Transpose required
  Scenario: Single row, to list
    Given single row, to list
    | foo | bar | bob |

  Scenario: Multiple rows, header, to list of map
    Given multiple rows, header, to list of map
	| FIRSTNAME | LASTNAME | DATEOFBIRTH |
    | stephanie | harford  | 11-14-1986  |
    | erik      | angone   | 01-28-1981  |

  # Transpose required
  Scenario: Multiple columns, header, to list of map
    Given multiple columns, header, to list of map
	| FIRSTNAME   | stephanie  | erik       |
	| LASTNAME    | harford    | angone     |
	| DATEOFBIRTH | 11-14-1986 | 01-28-1981 |

  Scenario: Multiple rows, no header, to list of list
    Given multiple rows, no header, to list of list
    | Jump | Slump | Pump  |
    | Camp | Damp  | Stamp |

  # Transpose required
  Scenario: Multiple columns, no header, to list of list
    Given multiple columns, no header, to list of list
    | You   | I    |
    | want  | need |
    | pizza | sub  |