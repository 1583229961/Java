package com.demo.model;

public enum UserState{
    DISABLED(0),
    AVAILABLE(1);
    private int status;
    UserState(int status)
    {
        this.status=status;
    }
    
    public int getStatus()
    {
        return status;
    }
	public void setStatus(int status) {
		this.status = status;
	}

  public static UserState fromValue(int value)
    {
        for(UserState userState:UserState.values())
        {
            if(userState.status==value)
            {
                return userState;
            }
        }
        throw new IllegalArgumentException("Cannot create evalue from value: " + value + "!");
    }

}
