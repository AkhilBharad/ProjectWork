import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { User } from '../models/user';
import { Router } from '@angular/router';
import { AuthServiceService } from '../auth-service.service';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  
    constructor() { }
    ngOnInit() {
      
    }
    



}


