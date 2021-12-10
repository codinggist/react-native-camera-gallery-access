import { NativeModules } from 'react-native';

type CameraGalleryAccessType = {
  multiply(a: number, b: number): Promise<number>;
};

const { CameraGalleryAccess } = NativeModules;

export default CameraGalleryAccess as CameraGalleryAccessType;
