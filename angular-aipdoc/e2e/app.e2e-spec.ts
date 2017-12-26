import { AngularAipdocPage } from './app.po';

describe('angular-aipdoc App', function() {
  let page: AngularAipdocPage;

  beforeEach(() => {
    page = new AngularAipdocPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
