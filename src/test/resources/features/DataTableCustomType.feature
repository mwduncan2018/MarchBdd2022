@DataTableCustomType
Feature: Data table custom type

  Scenario: Single row
    Given single row
    | Cranberries | No Need To Argue | 10.99 |

  Scenario: Single column
    Given single column
    | Ibanez |
    | RG     |
    | 1500   |

  Scenario: Horizontal data, no header
    Given horizontal data, no header
    | big  | bear | mike |
    | bald | bull | bill |

  Scenario: Vertical data, no header
    Given vertical data, no header
    | North America | North America | Europe  |
    | USA           | Canada        | England |
    | New York      | Toronto       | London  |

  Scenario: Horizontal data, header
    Given horizontal data, header
    | FIRSTNAME | mike   | stephanie | erik   |
    | LASTNAME  | duncan | harford   | angone |
    | AGE       | 40     | 33        | 41     |

  Scenario: Vertical data, header
    Given vertical data, header
    | BRAND  | MODEL   |
    | Tesla  | Model 3 |
    | Nissan | Z       |
    | Toyota | Camry   |