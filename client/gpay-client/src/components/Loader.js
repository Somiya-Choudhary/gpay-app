import React from 'react';

export const Loader = (WrappedComponent) => {

    function WithLoader(props){
        const { isLoading, ...rest } = props;

        if(isLoading){
            return(
                <h2>
                    Loading...
                </h2>
            )
        } else {
            return(
                <WrappedComponent {...rest}/>
            )
        }
    }

    return WithLoader;

}