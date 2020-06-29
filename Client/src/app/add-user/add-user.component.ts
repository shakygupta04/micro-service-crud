import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from './user.service';
import { User } from './user';


@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent {
 
  user: User;
  submitted:boolean;
  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private userService: UserService) {
          this.submitted = false;
    this.user = new User();
  }
 
  onSubmit() {
    this.submitted=true;
    this.userService.save(this.user).subscribe(result => console.log("User Added"));
  }
 
 
}





 

 
