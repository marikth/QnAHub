import {Component} from '@angular/core';

declare var require: any;

@Component({
  selector: 'dev-test',
  templateUrl: 'dev-test.component.html',
  styleUrls: ['./dev-test.component.css']
})

export class DevTestComponent{
  tasks: any[] = [
    {
      name: 'Reminders',
      completed: false,
      subtasks: [
        { name: 'Cook Dinner', completed: false },
        { name: 'Read the Material Design Spec', completed: false },
        { name: 'Upgrade Application to Angular2', completed: false }
      ]
    },
    {
      name: 'Groceries',
      completed: false,
      subtasks: [
        { name: 'Organic Eggs', completed: false },
        { name: 'Protein Powder', completed: false },
        { name: 'Almond Meal Flour', completed: false }
      ]
    }
  ];




}
