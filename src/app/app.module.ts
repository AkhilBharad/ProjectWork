import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './user/register/register.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HomeComponent } from './home/home.component';

import { UserService } from './services/user.service';
import { UsersComponent } from './users/users.component';

import{HttpClientModule} from '@angular/common/http';
import { AddUserComponent } from './add-user/add-user.component';
import { LoginComponent } from './login/login.component';
import { UpdateUserComponent } from './user/update-user/update-user.component';
import { PipesComponent } from './pipes/pipes/pipes.component';
import { CustompipePipe } from './custompipe.pipe';
import { AdminComponent } from './admin/admin.component';
import { ImportComponent } from './import/import.component';
import { AddnewcompanyComponent } from './addnewcompany/addnewcompany.component';
import { DeletecompanyComponent } from './deletecompany/deletecompany.component';
import { UpdatecompanyComponent } from './updatecompany/updatecompany.component';
@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    HomeComponent,
    
    UsersComponent,
    
    AddUserComponent,
    
    LoginComponent,
    
    UpdateUserComponent,
    
    PipesComponent,
    
    CustompipePipe,
    
    AdminComponent,
    
    ImportComponent,
    
    AddnewcompanyComponent,
    
    DeletecompanyComponent,
    
    UpdatecompanyComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }